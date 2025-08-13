import java.util.*;
class Binary Search_Recursion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an Array : ");
        int[] ar = Input.input(in.nextLine());

        System.out.print("Enter Search value : ");
        int sv = in.nextInt();

        Arrays.sort(ar);
        
        int start = 0;
        int end = ar.length - 1;

        int answer = binarysearchRecursive(ar, sv, start, end);
        System.out.println(answer);
    }
    public static int binarysearchRecursive(int[] ar, int sv, int start, int end) {

        int middle = (start + end) / 2;

        if (start > end) {

            System.out.println("Element Not Found");
            return -1;
        }

        if(ar[middle] == sv) {

            System.out.println("Element Found");
            return 0;
        }
        else if(ar[middle] > sv) {

            return binarysearchRecursive(ar, sv, start, middle - 1);
        }
        else {
            return binarysearchRecursive(ar, sv, middle + 1, end);
        }
    }

}
