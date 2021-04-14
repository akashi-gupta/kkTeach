import java.util.Scanner;

public class sumofnaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int i = sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
