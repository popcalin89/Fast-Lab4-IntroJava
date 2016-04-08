/**
 * Created by caly on 4/8/2016.
 */
public class P11 extends SkeletonJava {
    /*
        Se da un sir.
        Sa se extraga toate numerele intre doua valori si
        sa se puna intr-un alt sir care apoi sa se afiseze.
        */

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[a.length];
        int x = readIntGUI("Introdu prima valoare:");
        int y = readIntGUI("Introdu valoarea a doua:");

        for (int i = 0; i < a.length; i++) {
            if (a[i] > x && a[i] < y) {
                b[i] = a[i];
 //              System.out.println(b[i]);
            }
        }
        for (int i=0; i<b.length;i++){
            if(b[i]>0) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(b[i]);
            }
            }
        }
    }

