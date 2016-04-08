/**
 * Created by caly on 4/4/2016.
 */
public class P1 extends SkeletonJava {

    /*
    1. Se da un sir de numere ordonate crescator.
Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
sirul va fi definit asa, numerele sunt de exemplu.
int[] a = {1,3,4,6,7,8,10,12,14,23};
    */

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int nr = readIntGUI("Introdu numarul cautat:");
        boolean search = false;

        for (int i = 0; i < a.length; i++)
            if (a[i] == nr) {
                printGUI("Pozitia numarului in sir este: " + i);
                search = true;
            }
        if (search == false) {
            printGUI("-1");
        }
    }
}
