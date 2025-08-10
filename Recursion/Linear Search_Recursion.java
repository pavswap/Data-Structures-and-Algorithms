import java.util.*;
class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Array : ");
        int[] ar = Input.input(sc.nextLine());

        System.out.print("Enter Search Value : ");
        int sv = sc.nextInt();
        int i = 0;

        boolean ans = linearSearch(ar, sv, i);
        System.out.println(ans);
    }
    public static boolean linearSearch(int[] ar, int sv, int i) {

        if(i == ar.length) {
            return false;
        }
        if(ar[i] == sv) {
            return true;
        }
        return linearSearch(ar, sv, ++i);
    }
}
