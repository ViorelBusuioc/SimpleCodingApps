public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));

        double numberOne = 3.176;
        int numberOneInt = (int)(numberOne * 1000);
        System.out.println(numberOneInt);
    }

    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {

        int numberOneThreeDecimal = (int) (numberOne * 1000);
        int numberTwoThreeDecimal = (int) (numberTwo * 1000);

        if (numberOneThreeDecimal == numberTwoThreeDecimal) {
            return true;
        }
        return false;
    }
}
