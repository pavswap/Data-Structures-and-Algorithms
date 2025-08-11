import java.util.*;
class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Array : ");
        int[] ar= Input.input(sc.nextLine());

        int start = 0, end = ar.length - 1;
        int pivot = pivotFinder(ar, start, end);

        System.out.println("Pivot index is " + pivot);
    }
    public static int pivotFinder(int[] ar, int start, int end) {
        
        if (start > end) return -1;

        int middle = (start + end) / 2;
                                                                    // case 1 : check if mid is pivot
        if (middle < end && ar[middle] > ar[middle + 1]) {
            return middle;
        }
                                                                    // case 2 : check if mid-1 is pivot
        if (middle > start && ar[middle] < ar[middle - 1]) {
            return middle - 1;
        }
                                                                      // case 3 : decide which side to go
        if (ar[middle] >= ar[start]) {
            return pivotFinder(ar, middle + 1, end);
        } else 
        {
            return pivotFinder(ar, start, middle - 1);
        }
    }
}
