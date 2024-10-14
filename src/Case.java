import java.util.Scanner;

public class Case {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Month :");
        int months = reader.nextInt();
        System.out.print("Date  :");
        int dates = reader.nextInt();
        System.out.print("Year  :");
        int years = reader.nextInt();


        String wordmonths = "";
        switch (months) {
            case 1:
                wordmonths = ("January");
                break;
            case 2:
                wordmonths = ("February");
                break;
            case 3:
                wordmonths = ("March");
                break;
            case 4:
                wordmonths = ("April");
                break;
            default:
                System.out.println("Invalid Month");

        }
            if (dates > 31 || dates <= 0) {
                System.out.println("Invalid Date");
                }
            else
                System.out.println(wordmonths + " " + dates + "," + years);

        }
    }













