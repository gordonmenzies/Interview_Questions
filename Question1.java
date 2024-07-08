public class Question1 {
    public static int[] plusOne(int[] digits) {

        // count the number of times nine occurs
        boolean[] nineOccurs = new boolean[digits.length];
        int instance = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 9) {
                nineOccurs[i] = true;
                instance = instance + 1;
            }
        }
        // create the new array
        int[] newDigits = new int[digits.length];

        // no instance of 9
        if (instance == 0) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;

        } else if (instance == 1) {
            System.out.println("reached");
            int[] allNine = new int[digits.length + 1];
            if (digits.length == 1) {
                allNine[0] = 1;
                allNine[1] = 0;
                return allNine;
            } else if (digits[digits.length - 1] != 9) {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
                return digits;
            } else {
                for (int i = nineOccurs.length - 1; i >= 0; i--) {
                    if (nineOccurs[i] == true) {
                        digits[i] = 0;
                        digits[i - 1] = digits[i - 1] + 1;
                    }
                }
                return digits;
            }

        } else if (instance > 1) {
            // search for the number of 9's in a row
            int nineInARow = 0;
            if (nineOccurs[digits.length - 1] == true) {
                nineInARow++;
                int j = nineOccurs.length - 2;
                while (j >= 0 && nineOccurs[j] == true) {
                    nineInARow++;
                    j--;
                }
            }
            // condition for if all digits are 9
            if (digits[digits.length - 1] != 9) {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
                return digits;
            }
            if (nineInARow > 1 && nineInARow == digits.length) {
                int[] allNine = new int[digits.length + 1];
                allNine[0] = 1;
                for (int j = 1; j < digits.length; j++) {
                    allNine[j] = 0;
                }
                return allNine;
            } else if (nineInARow > 1) {
                for (int j = digits.length - 1; j >= digits.length - nineInARow; j--) {
                    newDigits[j] = 0;
                }

                newDigits[newDigits.length - nineInARow - 1] = digits[newDigits.length - nineInARow - 1] + 1;

                for (int j = 0; j <= newDigits.length - nineInARow - 2; j++) {
                    newDigits[j] = digits[j];
                }
            } else if (nineInARow == 1) {
                for (int j = 0; j < nineInARow; j++) {
                    newDigits[newDigits.length - 1 - j] = 0;
                }
                newDigits[newDigits.length - 1 - nineInARow] = digits[newDigits.length - 1 - nineInARow] + 1;

                // add the remaining digits
                for (int j = 0; j < newDigits.length - 1 - nineInARow; j++) {
                    newDigits[j] = digits[j];
                }
            }
        }
        return newDigits;
    }

    public static int[] plusOneAlternative(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] testCaseOne = { 1, 2, 3, 4 };
        int[] testCaseTwo = { 9 };
        int[] testCaseThree = { 5, 3, 8, 5, 2, 5 };
        int[] testCaseFour = { 9, 9 };
        int[] testCaseFive = { 8, 9, 9, 9 };
        int[] testCaseSix = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] testCaseSeven = { 9, 8, 9 };
        int[] testCaseEight = { 9, 8, 9, 9 };
        int[] testCaseNine = { 9, 9, 9, 0, 2 };
        int[] testCaseTen = { 5, 6, 2, 0, 0, 4, 6, 2, 4, 9 };

        int[] answerOne = plusOne(testCaseOne);
        for (int number : answerOne) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerTwo = plusOne(testCaseTwo);
        for (int number : answerTwo) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerThree = plusOne(testCaseThree);
        for (int number : answerThree) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerFour = plusOne(testCaseFour);
        for (int number : answerFour) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerFive = plusOne(testCaseFive);
        for (int number : answerFive) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerSix = plusOne(testCaseSix);
        for (int number : answerSix) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerSeven = plusOne(testCaseSeven);
        for (int number : answerSeven) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerEight = plusOne(testCaseEight);
        for (int number : answerEight) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerNine = plusOne(testCaseNine);
        for (int number : answerNine) {
            System.out.print(number);
        }
        System.out.println();

        int[] answerTen = plusOne(testCaseTen);
        for (int number : answerTen) {
            System.out.print(number);
        }
        System.out.println();
    }
}
