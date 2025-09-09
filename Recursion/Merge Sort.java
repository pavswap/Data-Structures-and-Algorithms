import java.util.*;
import DataStructures.CustomArray;

class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int[] ar1 = CustomArray.input(sc.nextLine());
        //int[] ar2 = CustomArray.input(sc.nextLine());


        System.out.println(Arrays.toString(mergeSort(ar1)));
    }

    static int[] mergeSort(int[] ar) {

        if(ar.length == 1) {

            return ar;
        }

        int mid = ar.length / 2;

        int[] a = mergeSort(Arrays.copyOfRange(ar, 0, mid));
        int[] b = mergeSort(Arrays.copyOfRange(ar, mid, ar.length));

        return merge(a, b);
    }
    static int[] merge(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int i = 0;                          //  1 3 5 -- i
        int j = 0;                          //  0 2 6 -- j
        int k = 0;

        while(i < a.length && j < b.length) {

            if(a[i] < b[j]) {

                c[k] = a[i];
                i++;
            }
            else {

                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < a.length) {

            c[k] = a[i];
            i++;
            k++;
        }

        while(j < b.length) {

            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }
}
