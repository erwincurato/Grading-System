import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double numOne;
        double numTwo;
        char operation;
        double result;

        boolean continueTyping = true;
        Scanner reader = new Scanner(System.in);

        while (continueTyping) {

            System.out.print("Enter First Number: ");
            numOne = reader.nextDouble();
            System.out.print("Enter a operation (+,-,*,/): ");
            operation = reader.next().charAt(0);
            System.out.print("Enter Second Number: ");
            numTwo = reader.nextDouble();

            switch (operation) {
                case '+':
                    result = numOne + numTwo;
                    break;
                case '-':
                    result = numOne - numTwo;
                    break;
                case '*':
                    result = numOne * numTwo;
                    break;
                case '/':
                    if (numTwo != 0) {
                        result = numOne / numTwo;
                    }else {
                        System.out.println("Error: Division by zero");
                        reader.close();
                        return;
                    }
                        break;
                default:
                    System.out.println("Invalid Operator");
                    reader.close();
                    return;
                }
        // if statement 
                /*  if (operation == '+') {
                result = numOne + numTwo;
            } else if (operation == '-') {
                result = numOne - numTwo;
            } else if (operation == '*') {
                result = numOne * numTwo;
            } else if (operation == '/') {
                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("Error: Division by zero");
                    reader.close();
                    return;
                }
            } else {
                System.out.println("Invalid Operator");
                reader.close();
                return;
            }
            */
            System.out.println("Result :" + numOne + " " + operation + " " + numTwo + " = " + result);
            System.out.println();
            System.out.print("Do you want to Perform again? (yes/no) :");
            String response = reader.next().trim();

            if (response.equalsIgnoreCase("no")) {
                continueTyping= false;
            } else if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Invalid input. Exiting...");
                continueTyping = false;

            }
        }
        System.out.println("Exiting...");
        reader.close();
    }

        }