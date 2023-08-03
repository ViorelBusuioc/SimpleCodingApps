public class GetEvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum (int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int evenCheck = 0;

        while (number > 0) {
            evenCheck = number % 10;
            number /= 10;
            if (evenCheck % 2 == 0) {
                sum += evenCheck;
                continue;
            }
        }
        return sum;
    }
}
