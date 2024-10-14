import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String emails[] = {"erwin@gmail.com", "curato@gmail.com", "jr@gmail.com"};
        String usernames[] = {"erwin", "curato", "jr"};
        String passwords[] = {"12345", "54321", "2323"};

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter your index no (0, 1, 2) or -1 to exit: ");
            int index = scan.nextInt();
            if (index == -1) {
                // If user enters -1, exit the loop
                continueInput = false;
                System.out.println("Exiting...");



                } else if (index >= 0 && index < emails.length) {
                // Print the corresponding credentials
                System.out.println("Here's your Credentials");
                System.out.println("Email: " + emails[index]);
                System.out.println("Username: " + usernames[index]);
                System.out.println("Password: " + passwords[index]);

            } else {
           
                System.out.println("Invalid index! Please enter 0, 1, or 2.");
            }
        }

        // Close the scanner
        scan.close();
    }
}
