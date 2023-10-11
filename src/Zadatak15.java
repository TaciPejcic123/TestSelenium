import java.util.Scanner;


public class Zadatak15 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite proizvodjaca automobila: ");
        String markaAutomobila = scanner.next();
        System.out.println("Unesite broj vrata:");
        int brojVrata = scanner.nextInt();

        if (brojVrata <= 0 || brojVrata>=5) {
            System.out.println("Uneli ste neispravan broj vrata:");
            System.exit(1);
        }

        if (markaAutomobila.equalsIgnoreCase("Ford")) {

            System.out.println("Broj vrata je: " + brojVrata);
        } else {

            System.out.println("nije marke ford");
        }


    }

}