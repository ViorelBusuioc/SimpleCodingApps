public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
        System.out.println(hasSameLastDigit(22,23,34));

    }

    public static boolean hasSameLastDigit (int n1, int n2, int n3) {

        int n1LastDigit = n1 % 10;
        int n2LastDigit = n2 % 10;
        int n3LastDigit = n3 % 10;

        if (isValid(n1) && isValid(n2) && isValid(n3)) {

            if (n1LastDigit == n2LastDigit || n1LastDigit == n3LastDigit || n2LastDigit == n3LastDigit) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid (int number) {

        return number >= 10 && number <= 1000;
    }
}
