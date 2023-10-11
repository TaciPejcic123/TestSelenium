import java.util.Scanner;

public class Cas3 {
    public static void main(String[] Args) {
//       ` String ime1="Pera"; //string
//        String ime2="Pera";  //string
//        String ime3= new String("Pera");  //objekat
//
//        System.out.println(ime1.equals(ime2)); //poredjenje VREDNOSDTI dva stringa ovde vraca true
//        System.out.println(ime1.equals(ime3)); //poredjenje VREDNOSTI STRINGA I OBJEKTA ovde vraca true zato sto se porede string i objekat
//        System.out.println(ime2.equals(ime3));//poredjenje VREDNOATI STRINGA I OBJEKTA vraca true
//        System.out.println(ime1==ime2);// poredjenje da li je objekat u memoriji isti vraca true
//        System.out.println(ime2==ime3); //poredjenje da li je objekat u memoriji isti vraca false


        //vezba if/else- promenljive moraju biti boolean

//        boolean a= 10>6 && 40<100 || true;
//        boolean b= 50<100 && 100<600 && false;
//        boolean d= false;
//
//        if(!a){
//            System.out.println("Tacan je prvi uslov");
//        } else if (b) {
//            System.out.println("Drugi uslov je true");
//        } else if(d){
//            System.out.println("Tacan treci uslov");
//        } else {
//            System.out.println("nista od navedenog");
//        }
//        if (a){
//            if(10>5){
//                if(10<5){
//                    System.out.println("tacan je prvi uslov");
//                } else if (true) {
//                    System.out.println("neki ispis");
//
//                }
//            }
//        }
        //vezba 11
        Scanner scanner = new Scanner(System.in);
        System.out.println("unesi broj");
        double operand1 = scanner.nextDouble();

        System.out.println("unesi drugi broj");
        double operand2 = scanner.nextDouble();
        System.out.println("unesi operator:");
        String operator = scanner.next();

        if (operator.equals("+")) {
            System.out.println("Rezultat je:" + (operand1 + operand2));
        } else if (operator.equals("-")) {
            System.out.println("Rezultat je:" + (operand1 - operand2));
        } else if (operator.equals("*")) {
            System.out.println("rezultat je:" + (operand1 * operand2));
        } else if (operator.equals("/")) {
            if (operand2 != 0) {
                System.out.println("Reszultat deljenja je:" + (operand1 / operand2));
            } else {
                System.out.println("Deljenje sa nulom nije dozvoljeno");
            }


        }


    }
}
