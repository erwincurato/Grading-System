import java.io.PrintStream;
import java.security.PublicKey;
import java.util.Scanner;

public class PRAC {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double Num1;
        double Num2;
        double result;

        System.out.print("Enter Number :");
        Num1 = reader.nextDouble();
        System.out.print("Enter Number :");
        Num2 = reader.nextDouble();

        result = Num1 * Num2;

        System.out.println(Num1 + " * " + Num2 + " = " + result);


        String emails[] = {"erwin@gmail.com", "curato@gmail.com", "jr@gmail.com"};
        String usernames[] = {"erwin", "curato", "jr"};
        String passwords[] = {"12345", "54321", "1432"};

        System.out.println("Index :" + 0);
        System.out.println("Email :" + emails[0]);
        System.out.println("Username :" + usernames[0]);



    }

}