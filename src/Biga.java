import java.util.Scanner;
public class Biga {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean continuetyping = true;

        while (continuetyping) {

            System.out.print("Enter your name: ");
            String name = reader.nextLine().trim();

            System.out.print("Enter a 'love' word: ");
            String love = reader.nextLine().trim();

            System.out.print("Enter partner's name: ");
            String partner = reader.nextLine().trim();

            if (name.equalsIgnoreCase("erwin") || name.equalsIgnoreCase("curato")) {
                if (love.trim().equalsIgnoreCase("love")) {
                    if (partner.equalsIgnoreCase("annica") || partner.equalsIgnoreCase("agarrado")) {

                        System.out.println("I love you!");
                    } else {
                        System.out.println("Not compatible.");
                    }
                }
            }
                System.out.print("Do you want to perform again? (yes/no) : ");
                String response = reader.next().trim();

                reader.nextLine();

                continuetyping = response.trim().equalsIgnoreCase("yes");
            }
            System.out.println("Exiting...");

            reader.close();
        }
    }