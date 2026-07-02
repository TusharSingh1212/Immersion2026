import java.util.Scanner;
public class NO_Of_Consecutive_ones{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        
        //Convert To Binary String
        /*
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int max = 0;
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
        */

        //Bit Manipulation
        int count = 0;

        while (n != 0) {
            n = n & (n << 1);
            count++;
        }

        System.out.println(count);
    }
}