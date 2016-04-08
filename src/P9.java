/**
 * Created by caly on 4/5/2016.
 */
public class P9 extends SkeletonJava {
  /*  9. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si
  sa se afiseze in ordine crescatoare.
  de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4} */

    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = readIntGUI("Primul numar");
        a[1] = readIntGUI("Al doilea numar");
        a[2] = readIntGUI("Al treilea numar");
        boolean sorted = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted==false) {
            for(int i =0;i<a.length;i++) {
                int iMin = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[iMin]) {
                        iMin = j;
                    }
                }
                int temp = a[i];
                a[i] = a[iMin];
                a[iMin] = temp;
                System.out.println(a[i]);
            }
        }else {printGUI("Crescator");
            System.out.println("Crescator");
                }
            }
        }







