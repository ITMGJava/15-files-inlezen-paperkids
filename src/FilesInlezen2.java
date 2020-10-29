
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FilesInlezen2 {

    public static void main(String[] arg) {
        try {
            bestandInlezen("Hello.txt");

        } catch (FileNotFoundException a) {
            System.out.println("Helaas, het bestand kan niet gevonden worden. De reden is: " + a);

        } finally {
            System.out.println("Het programma is afgelopen");
        }


    }

    static void bestandInlezen(String bestandsnaam) throws FileNotFoundException {
        File f = new File("Hello.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());


        }

    }
}