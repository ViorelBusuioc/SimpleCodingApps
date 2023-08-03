public class DiagonalStar2 {

    public static void main(String[] args) {

    printSquareStar(5);
    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        }

        int rowCount = 0;
        int columnCount = 0;
        int currentRow = 0;

        for (int i = 1; i <= number; i++) {

            rowCount = i;

            for (int j = 1; j <= number; j++) {
                columnCount = j;
                if (rowCount == 1 || rowCount == number) {
                    System.out.print("*");
                } else if (columnCount == 1 || columnCount == number) {
                    System.out.print("*");
                } else if (rowCount == columnCount || columnCount == rowCount - i + 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
