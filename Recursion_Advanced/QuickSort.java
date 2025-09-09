import java.util.*;

class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i : ar) {
          i = sc.nextInt();
        }

        quickSort(ar, 0, ar.length - 1);

        System.out.println(Arrays.toString(ar));
    }

    static void quickSort(int[] ar, int start, int end) {

        if(start >= end) {
            return;
        }

        int pivot = findPivot(ar, start, end);

        quickSort(ar, start, pivot - 1);
        quickSort(ar, pivot + 1, end);
    }

    static int findPivot(int[] ar, int start, int end) {

        int pivot = ar[end];

        int i = start - 1;
        int j = start;

        for(;j <= end - 1; j++) {

            if(ar[j] < pivot) {

                i++;
                swap(ar, i, j);
            }
        }

        i++;
        swap(ar, i, end);

        return i;
    }

    static void swap(int[] ar, int i, int j) {

        int swap = ar[i];
        ar[i] = ar[j];
        ar[j] = swap;
    }
}
