import home_works.HomeWork3;

public class Main {
    public static void main(String[] args) {
        homeWork3Output();
    }

    public static void homeWork3Output() {
        HomeWork3.printThreeWords();
        HomeWork3.checkSumSign(2, -3);
        HomeWork3.printColor();
        HomeWork3.compareNumbers();
        System.out.println(HomeWork3.checkRange(2, 19));
        HomeWork3.checkAndReturnNumberSign(-2);
        System.out.println(HomeWork3.checkAndPrintNumberSign(-2));
        HomeWork3.printStringMultiplyTimes(5, "Hello world");
        System.out.println(HomeWork3.isLeapYear(300));
    }
}
