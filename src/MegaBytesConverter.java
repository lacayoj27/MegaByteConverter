public class MegaBytesConverter {


    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-4);
        printMegaBytesAndKiloBytes(5000);


    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int XX = kiloBytes / 1024;
        int ZZ = kiloBytes % 1024;

        if (kiloBytes < 0) {

            System.out.println("Invalid Value");


        } else {

            System.out.println(kiloBytes + " KB = " + XX + " MB and " + ZZ + " KB");
        }


    }


}
