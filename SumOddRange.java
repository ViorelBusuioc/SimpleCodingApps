public class SumOddRange {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd (int number) {

        if (number % 2 == 0) {
                return false;
        }
        if (number < 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd (int start, int end) {

        if ((start > 0) && (end >= start)) {
            int sumOfOdd = 0;
            for (int i = start; i <= end; i++ ) {
                if (isOdd(i)) {
                    sumOfOdd += i;
                }
                }
            return sumOfOdd;
        }
        return -1;
    }
}
