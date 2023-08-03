public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 43));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen (int teen1, int teen2, int teen3) {

        return ((teen1 >= 13 && teen1 <= 19) || (teen2 >= 13 && teen2 <= 19) || (teen3 >= 13 && teen3 <= 19));
    }

    public static boolean isTeen (int teen) {

        return (teen >=13 && teen <=19);
    }
}
