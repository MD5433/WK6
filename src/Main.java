// Mariah Dungey 02/23/2025
public class Main {
    public static void main(String[] args) {
        Person userInput = new Person("Mariah", 18, 5.5);
        String userName = userInput.promptString("What is your name?");
        System.out.println(userName);

        int userAge = userInput.promptInt("How old are you? " + userName);
        System.out.println("You are " + userAge + " years old.");

        double userHeight = userInput.promptDouble("How tall are you in feet? e.g(0.0) " + userName);
        System.out.println("You are " + userHeight + " feet tall.");



    }
}
