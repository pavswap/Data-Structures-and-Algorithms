import java.util.*;
class Remove_a {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        var sb = new StringBuilder(sc.nextLine());

        remove_a(sb, 0);

        System.out.println("String with a removed :" + sb);
    }

    static void remove_a(StringBuilder sb, int i) {

        if(i >= sb.length()) {
            return;
        }
        if(sb.charAt(i) == 'a') {
            sb.deleteCharAt(i);
        }
        else {
            i++;
        }

    }
}
