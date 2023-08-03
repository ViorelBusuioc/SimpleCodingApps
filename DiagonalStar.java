public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(8);
    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int rowCount = 1; rowCount <= number; rowCount++) {
                for (int columnCount = 1; columnCount <= number; columnCount++) {
                    if (rowCount == 1 || rowCount == number) {
                        System.out.print("1");
                    } else if (columnCount == 1 || columnCount == number) {
                        System.out.print("2");
                    } else if (rowCount == columnCount) {
                        System.out.print("3");
                    } else if (columnCount == number - rowCount + 1) {
                        System.out.print("4");
                    } else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
