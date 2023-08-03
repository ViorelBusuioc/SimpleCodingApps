public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(132,1573));
        System.out.println(getGreatestCommonDivisor(1010,10));
        System.out.println(getGreatestCommonDivisor(961,1271));
        System.out.println(getGreatestCommonDivisor(1155,1089));
    }

    public static int getGreatestCommonDivisor (int first, int second) {

        if (first >= 10 && second >= 10) {

            int cmmdc = 0;
            for (int i = 1; i <= first || i <= second; i++) {

                if (first % i == 0 && second % i == 0) {
                    cmmdc = i;
                }
            }
            return cmmdc;
        }
        return -1;
    }
}
