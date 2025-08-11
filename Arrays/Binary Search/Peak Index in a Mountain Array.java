import java.util.*;

class Practice extends Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice in = new Practice();

        System.out.print("Enter a Array : ");
        int ar[] = in.input(sc.nextLine());

        if(ar.length < 3) {
            System.out.println("The Array must Have at 3 Elements in Order to Have a Peak Index\n");
        }
        else {
            findPeakIndex(ar);
        }
    }

    static void findPeakIndex(int ar[]) {
        int start = 1, end = ar.length - 2, middle;

        while(start <= end) {

            middle = start + (end - start) / 2;

            if(ar[middle] > ar[middle + 1] && ar[middle] > ar[middle - 1]) {
                System.out.printf("The Peak Index is %d and The Peak Element is %d \n", middle, ar[middle]);
                break;
            }
            else if(ar[middle] > ar[middle + 1]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
    }
}
