import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int rev = 0;
        while(num>0){
            int var = num % 10;
            num = num/10;
            rev = rev * 10 + var;
        }
        num1 = rev + num1;
        System.out.println(num1);
    }
}
