import java.util.Random;
import java.util.Scanner;

public class Zadatak17 {
    public static void main(String[] Args) throws InterruptedException {
        Random rand = new Random();
        int zamisljeniBroj = rand.nextInt(3);

        System.out.println(zamisljeniBroj);


        System.out.println("koji broj sam zamislio");
        System.out.println("Unesi broj:");
        Scanner scanner = new Scanner(System.in);
        int unetBroj = scanner.nextInt();


        if (unetBroj == (zamisljeniBroj)) {
            System.out.println("uneo si dobar broj");
        }

        while (unetBroj != zamisljeniBroj) {
            System.out.println("nije dobar broj");
            System.out.println("Unesi broj:");
            unetBroj = scanner.nextInt();
            if (unetBroj == (zamisljeniBroj)) {
                System.out.println("uneo si dobar broj");
            }


        }


    }
}
