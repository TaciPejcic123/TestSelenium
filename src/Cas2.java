import java.io.Console;
import java.util.Scanner;

public class Cas2 {
    public static void main(String[] Args) {
        System.out.print("Hello Java");
        System.out.println(" hello");
        System.out.println("Hello");

    /*  ovo ne radi

    Console c = System.console();
        c.writer().println("rqwrw");

       Console c1 = System.console();
       if(c1!=null){
           c1.writer().println("Console exist");
       Console c2 = System.console();
       String line = c2.readLine();
       c2.writer().println("Hello" + line);
       }*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesi prvi broj: ");
//        int broj1 = scanner.nextInt();
//        System.out.println();
//        System.out.println("Unesi drugi broj: ");
//        int broj2 = scanner.nextInt();
//        System.out.println(broj1 + broj2);
//        System.out.println("Upisi ime: ");
//        String ime = scanner.next();
//        System.out.println("Upisi prezime: ");
//        String prezime = scanner.next();
//        //System.out.println(ime+" " +prezime);
//        %s je placeholder odnosi se na formatiranje teksta -"%s %s\n",ime,prezime-ovaj de ce ispisati razmak izmedju imena i prezimena
//        System.out.printf("%s %s\n",ime,prezime);
//        dva znaka %% prikazuje % u ispisu ali se koristi metoda System.out.printf()
        //       System.out.printf("Unesi drugi %% broj: ");
        //     double x = (113.0/112.0);
//        System.out.println("Hello from number"+x);
        //funkcija print f i oznaka %.2f zakruzuje broj na dve decimale
//        System.out.printf("Hello from number %.2f",x);

//         Celobrojni ostatsak %
//        int a =20;
//        int b =6;
//        int modulo =10 % 3;
//        System.out.println(modulo);
//        System.out.println(a % b);


//        int x = 10;
        //       int y= ++x;
//        inkrement i dekrement
//        System.out.println(x);
//        System.out.println(y);
//        int y = x++;
//        System.out.println(y);
//        int a= 2,b =3;
//        int res = a * (b++) + b;
//        int res1 =a *(++b) +b;
//        System.out.println(res);
//        System.out.println(res1);
//
////        nrgacija
//        boolean negacija= !!!!!!!true;
//        System.out.println(negacija);


//  Operatori
//        int x= 23;
//        int y= 45;

//        boolean resultat = x==y;
//        System.out.println(resultat);
//        boolean resultat1 = x > y;
//        System.out.println(resultat1);
//        boolean resultat2 = x < y;
//        System.out.println(resultat2);
//        boolean resultat3 = x >= y;
//        System.out.println(resultat3);
//        boolean resultat4 = x <= y;
//        System.out.println(resultat4);
//        if(resultat2= true){
//            System.out.println("x je manje od y");
//        }
//        if (resultat3= false){
//            System.out.println("x je vece od y");
//        }
//     logicki operatori
        int x = 10;
        int y = 20;
        boolean logicki = x < 20 && x > 10;
        System.out.println(logicki);
        logicki = x < 20 || x > 10;
        System.out.println(logicki);
//ne radi
//        logicki = (x>9&&x!=25&&y>19&&x!=10)
//                ||y!=20&&y==10||(x==1&&x==3)
//                ||true);
//        System.out.println(logicki);

//   Zadatak 2.
        Scanner scanner = new Scanner(System.in);
        System.out.println("unesite broj:");
        int paran = scanner.nextInt();

        int modulo = paran % 2;

        if (modulo == 0) {
            System.out.println("broj je paran");
        } else {
            System.out.println("broj je neparan");

        }


    }
}
