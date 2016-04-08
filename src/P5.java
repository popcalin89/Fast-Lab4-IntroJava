/**
 * Created by caly on 4/4/2016.
 */
public class P5 extends SkeletonJava {
/*Se dau doua numere a si n. sa se afiseze numarul a la puterea n
de ex
a =3
b = 2
se va calcula 3*3 */

    public static void main(String[] args) {
        int a = readIntGUI("Introdu numar");
        int n = readIntGUI("Introdu puterea numarului a");
        int count = 1;
        for( int i=1 ; i<= n ; i++) {
            count = count * a;
        }
        printGUI("Rezultatul:" +count);

    }
}