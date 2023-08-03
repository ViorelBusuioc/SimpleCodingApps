public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        int megaBytes = kiloBytes / 1024;    // 2500 / 1024 = 2;
        int kiloBytesRest = kiloBytes % 1024;   // 2500 % 1024 = 452 because 1024*2=2048; 2500-2048=252;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + "MB and " + kiloBytesRest + " KB");
        }
    }

}
