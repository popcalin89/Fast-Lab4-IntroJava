/**
 * Created by caly on 4/5/2016.
 */
public class P2 extends SkeletonJava {
     /*
    Se se calculeze suma primelor n numere naturale,
    unde n este declarat ca si
    int n = 20; //sau o alta valoare
    */

    public static void main(String[] args) {
        int n = readIntGUI("Introdu un numar");
        int count=0;
        int suma=0;
        do {
            suma = suma + count;
            count++;
        }
        while (count <= n);
        printGUI("Suma este egala cu:" +suma);
        }
    }



