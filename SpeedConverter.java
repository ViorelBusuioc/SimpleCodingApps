public class SpeedConverter {

    public static void main(String[] args) {


        printConversion(0);

    }

    public static long toMilesPerHour (double kilometerPerHour) {

        double toMilesPerHour = kilometerPerHour / 1.609;

            return Math.round(toMilesPerHour);
    }



    public static void printConversion (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h" + " = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
