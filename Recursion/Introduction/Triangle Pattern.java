import java.util.*;
class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the triangle : ");
        int n = sc.nextInt();

        triangle(n, 0);
    }
    static void triangle(int n, int i) {

        if(i == n && n != 0) {
            System.out.println();
            triangle(n - 1, 0);
        }
        else if( n == 0) {

            return;
        }
        if(i < n) {

            System.out.print("* ");
            triangle(n, i + 1);
        }
    }
}