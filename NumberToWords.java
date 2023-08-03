public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(12300);
        System.out.println(getDigitCount(12300));
    }

    public static void numberToWords (int number) {

        int count = getDigitCount(number);
        number = reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int lastDigit = 0;
        for (int i = 0; i < count; i++) {

            lastDigit = number % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            number /= 10;
        }
    }

    public static int reverse (int number) {

        int lastDigit = 0;
        int sum = 0;
        int reverse = 0;

        reverse = number;
        while (number != 0) {
            lastDigit = number % 10;
            sum = (sum * 10) + lastDigit;
            number /= 10;
        }
        return sum;
    }

    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
