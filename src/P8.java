/**
 * Created by caly on 4/5/2016.
 */
public class P8 extends SkeletonJava {
   /* 8. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
    suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n . */

    public static void main(String[] args) {
        int x = readIntGUI("Introdu numarul x:");
        int n = readIntGUI("Introdu numarul n");
        int xlan = 1;
        int suma = 0;

//Ridicarea lui x la puterea lui n
 /*       for (int i = 0; i < n; i++) {
            xlan = xlan * x;
            return;
        }
         System.out.println("Numarul x la puterea n"+xlan);*/


        for (int i = 0; i < n; i++) {
            xlan = xlan * x;
            suma += xlan;
        }
        suma=1+suma;
        System.out.println(suma);
    }
}












