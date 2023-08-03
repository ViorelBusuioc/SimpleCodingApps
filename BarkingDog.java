public class BarkingDog {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 0));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfTheDay) {

        if (hourOfTheDay >= 0 && hourOfTheDay < 8) {
            return barking;
        } else if (hourOfTheDay > 22 && hourOfTheDay <= 23) {
            return barking;
        } else if (barking = false) {
        return !barking;
        }
        return false;
    }
}
