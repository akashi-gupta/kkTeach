import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i<=num/2 ; i++)
        {
           if(num%i==0)
           {
               flag = 1;
               break;
           }
        }
        if(flag == 1){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }

        switch(flag){
            case 1:
                System.out.println("Not Prime");
                break;
            default:
                System.out.println("Prime");
                break;
        }

    }
}
