import java.util.Scanner;
public class Valid_Palindrome {
    public boolean Palindrome() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char c_First = s.charAt(start);
            char c_Last = s.charAt(last);
            if(c_First != c_Last) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
    public static void main(String[] args) {
        Valid_Palindrome p = new Valid_Palindrome();
        boolean ans = p.Palindrome();
        System.out.println(ans);
    }
}