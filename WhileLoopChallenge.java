public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumber = 0;
        int oddNumber = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                System.out.println(number + " is a odd number");
                oddNumber++;
                continue;
            }
            evenNumber++;
            System.out.println(number + " is a even number");
            if (evenNumber == 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers = " + evenNumber);
        System.out.println("Total numbers of odd numbers = " + oddNumber);
    }

    public static boolean isEvenNumber (int number) {

        return number % 2 == 0;
    }
}
