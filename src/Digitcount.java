import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0)
        {
            int var = num % 10;
            num = num/10;
            sum = sum + var;
        }
        System.out.println(sum);
    }
}
