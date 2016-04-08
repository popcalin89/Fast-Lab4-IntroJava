/**
 * Created by caly on 4/4/2016.
 */
public class P6 extends SkeletonJava {

/*Sa se calculeze factorialul unui numar a .
factorialul este definit asa: factorial  = 1*2*3*4….*a
de ex pentru a = 4, factorialul este 1*2*3*4   */

    public static void main(String[] args) {

        int a = readIntGUI("Introdu un numar:");
        int count = 1;
        int result = 1;
        do {
            result = result * count;
            count++;
        } while (count <= a);
        printGUI("Factorialul numarului a este:" +result);

    }
}