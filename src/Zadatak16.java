public class Zadatak16 {
    public static void main(String[] Args) {
        int a=1;
        int b=2;
        int c=3;
        System.out.println("**************");
        System.out.println("#"+ "   "+"1 " + "  " +" 2 " + "  "+ "3 ");
        //System.out.printf("a:%d,b:%d,c:%d\n"); ne radi
        System.out.println("**************");
        for (int i = 1; i<=10; i++) {
           int j= 2;
            int y= 3;
            int rezultat = i * j;
            int rezultat1= i * y;
            //formatiranje ispisa, moze na dva nacina sa printf i println


           System.out.printf("%-3d  %-3d %-4d %-4d%n", i, i,  rezultat, rezultat1);
     //      System.out.println(i + "   " + i + "   " + rezultat + "   " + rezultat1);


        }
    }
}
