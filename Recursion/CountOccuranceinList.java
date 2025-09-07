import java.util.*;
import DataStructures.CustomArray;

class CountOccuranceinList {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int[] ar = CustomArray.input(sc.nextLine());

        System.out.println("Enter Target");
        int n = sc.nextInt();

        ArrayList<Integer> answer= targetIndex(ar, 4, 0);

        System.out.println(answer);
    }

    static ArrayList<Integer> targetIndex(int[] ar, int target, int count) {

        var list = new ArrayList<Integer>();

        if(count >= ar.length) {

            return list;
        }

        if(ar[count] == target) {

            list.add(count);

        }
        count++;

        ArrayList<Integer> list2 = targetIndex(ar, target, count);

        list.addAll(list2);
        return list;
    }
}
