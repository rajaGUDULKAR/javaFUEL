import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcone to swapping \n \n ");
        System.out.println("enter your first number");

        int a = input.nextInt();
        System.out.println("enter your secound nuber");
        int b = input.nextInt();


        int c = a;
        a = b;
        b = c;

        System.out.println("your swapping is ready");
        System.out.println(" the value of A is"+a);
        System.out.println("the value of b is "+b);

    }
}
