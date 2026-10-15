package home_works;

public class HomeWork3 {
    public static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple",};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The amount is negative");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 99;
        int b = 101;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkRange(long a, long b) {
        long sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkAndReturnNumberSign(long number) {
        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static boolean checkAndPrintNumberSign(long number) {
        return number < 0;
    }

    public static void printStringMultiplyTimes(long number, String string) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeapYear(int year) {
        return year >= 0 && year <= 3000 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
