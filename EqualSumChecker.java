public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));

        int number1 = 0;
        int number2 = -2;
        int total = number1 + number2;
        System.out.println(total);

    }

    public static boolean hasEqualSum (int numberOne, int numberTwo, int numberThree) {

        return ((numberOne + numberTwo) == numberThree);
    }

}
