import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

//        int num = 1;
//        while (num <= 100) {//initialization
//            System.out.println(num);//actual work
//            num=num+1;//updating the condition
//        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp= input.nextInt();
            System.out.println("Number is: "+inp);
            i++;
        }
    }
}
