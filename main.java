public class Main {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            int[] newDigits = new int[digits.length + 1];
            if (digits.length <= 1) {
                newDigits[0] = 1;
                newDigits[1] = 0;
            } else {
                for (int i = 0; i < newDigits.length - 2; i++) {
                    newDigits[i] = digits[i];
                }
                newDigits[newDigits.length - 2] = 1;
                newDigits[newDigits.length - 1] = 0;
            }
            return newDigits;
        }
    }

    public static void main(string[] args) {
        int[] testCaseOne = { 1, 2, 3, 4 };
        int[] testCaseTwo = { 9 };
        int[] testCaseThree = { 5, 3, 8, 5, 2, 5 };

        int[] answerOne = plusOne(testCaseOne);
        for (int number : answerOne) {
            System.out.println(number);
        }

        int[] answerTwo = plusOne(testCaseTwo);
        for (int number : answerTwo) {
            System.out.println(number);
        }

        int[] answerThree = plusOne(testCaseThree);
        for (int number : answerThree) {
            System.out.println(number);
        }
    }

}
