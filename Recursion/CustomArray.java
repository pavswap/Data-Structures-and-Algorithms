//package DataStructures;
import java.util.Scanner;

public class CustomArray {

    public static int[] arIn(int n) {

        var sc = new Scanner(System.in);
        int ar[] = new int[n];

        for(int i : ar) {

            i = sc.nextInt();
        }

        return ar;
    }
}
