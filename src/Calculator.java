import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("ENTER FIRST NUMBER:");
        int firstno = input.nextInt();
        System.out.println("ENTER SECOUND NUMBER:");
        int secoundno = input.nextInt();
        int sum= firstno+secoundno;
        System.out.println("SUM OF YOUR ENTERED NUMBERS IS:" +sum);
        int mul= firstno*secoundno;
        System.out.println("MULTIPLICATION OF YOUR ENTERED NUMBERS IS:" +mul);
        int sub= firstno-secoundno;
        System.out.println("SUBTRACTION OF YOUR ENTERED NUMBERS IS:" +sub);
        int div= firstno/secoundno;
        System.out.println("DIVIDION OF YOUR ENTERED NUMBERS IS:" +div);


    }
}
