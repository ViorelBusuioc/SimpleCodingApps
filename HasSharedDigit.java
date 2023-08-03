public class HasSharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit (int a, int b) {

        if (a > 9 && a < 99 && b <= 99) {

            int aR = a % 10;
            int aL = a / 10;
            int bR = b % 10;
            int bL = b / 10;

            if ((aR == bR) || (aR == bL) || (aL == bR) || (aL == bL)) {
                return true;
            }
        }
        return false;
    }
}
