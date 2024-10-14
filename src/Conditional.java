import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean continueTyping = true;

        while (continueTyping) {

            System.out.print("English  :");
            float English = reader.nextFloat();
            System.out.print("Science  :");
            float Science = reader.nextFloat();
            System.out.print("Filipino :");
            float Filipino = reader.nextFloat();
            System.out.print("Math     :");
            float Math = reader.nextFloat();
            System.out.print("MAPEH  :");
            float MAPEH = reader.nextFloat();
            

            float Average = (English + Science + Filipino + Math + MAPEH) / 5;


            System.out.println("Average :" + Average);

            if (Average > 100) {
                System.out.println("AWARD : Super Smart");
            } else if (Average >= 98) {
                System.out.println("AWARD : With Highest Honor");
            } else if (Average >= 95) {
                System.out.println("AWARD : With High Honor");
            } else if (Average >= 90) {
                System.out.println("AWARD : With Honor");
            } else if (Average >= 75) {
                System.out.println("AWARD : Passed");
            } else {
                System.out.println("COMMENT : BAWI NEXT LIFE, \"Failed\" ");
                reader.close();
                return;
            }

            System.out.print("Do you want to perform again (yes/no):");
            String response = reader.next();

            if (response.equalsIgnoreCase("no")) {
                continueTyping = false;
            }else if (!response.trim().equalsIgnoreCase("yes")){
                System.out.print("Invalid input! Exiting...");
                continueTyping = false;
            }

        }

        System.out.println("Exiting..");


        }

    }
