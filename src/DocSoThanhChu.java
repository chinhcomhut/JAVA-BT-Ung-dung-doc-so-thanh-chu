import java.util.Scanner;

public class DocSoThanhChu {
    public static String checkUnit(int number) {
        switch (number) {
            case 0:
                return "";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    public static String checkDozens1(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen ";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }
        return "";
    }

    public static String checkDozen2(int ten) {
        switch (ten) {
            case 1:
                return "teen";
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy ";
            case 8:
                return "eighty";
            case 9:
                return "ninety";

        }
        return "";
    }

    public static void main(String[] avg) {

        Scanner scanner = new Scanner(System.in);
//        int number = 1;
//        while (number != 0) {
        System.out.println("Input Number Into Words");
        int number = scanner.nextInt();
//            int hundred=Math.floorDiv(number,100);
//            int tens = Math.floorDiv((number-hundred*100), 10);
//            int numeral = number % 10;
        int unit = number % 10;
        int ten = (number - unit) / 10;
//        int unit2 = (number - unit-ten*10)/100;
        int unitHundred = (number - number % 100) / 100;
        int Dozens = number % 100;
        int UnitDozens1 = (Dozens - unit) / 10;
//        int ten2 = (number - unit - unitHundred * 100) / 10;
//        int ten3 = (number - unit) % 100;
        if (number < 10) {
            System.out.println(checkUnit(number));
        } else if (number < 20) {
            System.out.println(checkDozens1(number));
        } else if (number < 100) {
            System.out.println(checkDozen2(ten) + " " + checkUnit(unit));
        } else if (number < 999 && Dozens > 19) {
            System.out.println(checkUnit(unitHundred) + " hundred " + checkDozen2(UnitDozens1) + " " + checkUnit(unit));
        } else if (number < 999 && Dozens < 10) {
            System.out.println(checkUnit(unitHundred) + " hundred " + checkUnit(Dozens));
        } else if (number < 999 && Dozens < 20) {
            System.out.println(checkUnit(unitHundred) + " hundred " + " " + checkDozens1(Dozens));
        }
//        }
    }
}