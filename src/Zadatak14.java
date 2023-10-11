import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Zadatak14 {
   public static void main(String[] Args) {
//        int x = 3333333;
//        int y = 2222222;
//        int resultat = x % y;
//
//        if (resultat!=0) {
//            System.out.println("Ostatak je: "+ resultat);
//        }
//
//        if (resultat > 1000) {
//            System.out.println("Ostatak je"+ resultat +">1000" );
//        } else if (resultat<1000) {
//            System.out.println("Ostatak je" + resultat + "<1000");
//
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int a = scanner.nextInt();

        System.out.println("Unesi drugi broj: ");
        int b = scanner.nextInt();

        int drugiRezultat = a % b;


        if (drugiRezultat == 0 ) {
            System.out.println("Nema ostatka");
        } else {
            System.out.println("Ostatak je: " + drugiRezultat);

            if (drugiRezultat >=1000) {
                System.out.println("ostatak je " + drugiRezultat + ">=1000");
            } else if (drugiRezultat <= 1000) {
                System.out.println("ostatak je " + " " + drugiRezultat + " i to je <=1000");
            }
        }

    }

}


