import java.util.Scanner;

public class Fibbonaciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int a = 0;
        int b = 1;
        System.out.println(a);
        while (sum < n) {
            System.out.println(sum);
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
