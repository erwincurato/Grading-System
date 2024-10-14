import java.util.Scanner;

public class ForLoop {
    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        String [] usernames ={"Erwin","Curato","Lanzaderas"};
        String [] passwords={"12345","54321","qwerty"};

        System.out.print("Username :");
        String username = reader.nextLine();
        System.out.print("Password :");
        String password = reader.nextLine();

        for (int i = 0; i < usernames.length ; i++){
            if (username.equalsIgnoreCase(usernames [i]) && password.equalsIgnoreCase(passwords [i])) {
                System.out.println("Welcome to Mobile legends " + usernames[i]);
                break;
            }

        }
        System.out.println("Account not Found");


    }
}
