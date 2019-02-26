public class MegaByte {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }

        else
        {
            int megabytes = kiloBytes / 1024;
            int remainkilobytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB" + " = " + megabytes + " MB" + " and" + remainkilobytes + " KB");
        }

    }

}
