import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x > 0) {
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
        sc.close();
    }
}