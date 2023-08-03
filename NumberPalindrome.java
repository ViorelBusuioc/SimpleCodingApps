public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome (int number) {

        int lastDigit = 0;
        int sum = 0;
        int reverso = 0;

        reverso = number;
        while (number != 0) {
            lastDigit = number % 10;
            sum = (sum * 10) + lastDigit;
            number /= 10;
            }


        if (reverso == sum) {
            return true;
        } else return false;
    }
}
