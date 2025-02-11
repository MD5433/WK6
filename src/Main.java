import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner userIn = new Scanner(System.in);
    static ArrayList usersInfo = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        enterInfo();


    }

    static void enterInfo(){

        while (!userIn.equals("end")){
            System.out.println("Enter your first and last name.");
            String usName = userIn.nextLine();
            System.out.println("Enter your email.");
            String usEmail = userIn.nextLine();

            System.out.println("What is your street address?");
            String usAddress = userIn.nextLine();
            System.out.println("What city do you live in?");
            String usCity = userIn.nextLine();
            System.out.println("What state do you live in?");
            String usState = userIn.nextLine();
            System.out.println("What is your zip code");
            int usZip = userIn.nextInt();
            System.out.println("What is your phone number?");
            int usPhone = userIn.nextInt();
           
        }

        userIn.close();

    }
}
