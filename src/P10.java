/**
 * Created by caly on 4/7/2016.
 */
public class P10 extends SkeletonJava {
    /*
    Se da un sir.
    Pentru prima jumatate a sirului sa se afiseze numerele dublate,
    iar pentru a doua jumatate sa se afseze numerele triplate daca sunt impare
    si numerele asa cum sunt in sir daca sunt pare.
    */

    public static void main(String[] args) {

        int x[] = {1, 2, 3, 5, 7, 8, 10};

        for (int i = 0; i < x.length / 2; i++) {
            System.out.println(2*x[i]);
        }
        for(int i=x.length/2; i<x.length; i++){
            if(x[i]%2==1){
                System.out.println(x[i]);
            } else {
                System.out.println(3*x[i]);
            }
        }
    }
}



