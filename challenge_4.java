import java.util.Scanner;

public class challenge_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.println("Enter the value of A : ");
        int a =input.nextInt();
        System.out.println("Enter the value of B : ");
        int b =input.nextInt();

        int c=a;
        a=b;
        b=c;

        System.out.println("Swapping done");
        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);
    }


}
