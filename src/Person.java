import java.util.Scanner;

public class Person {
    Scanner usInput = new Scanner(System.in);
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    // Methods

    public String promptString(String message){
        System.out.println(message);
        return usInput.nextLine();

    }

    public int promptInt(String message){
        int ageValue;

        while (true){
            try {
                System.out.println(message);
                ageValue = Integer.parseInt(usInput.nextLine());
                return ageValue;
            } catch (NumberFormatException e) {
                System.out.println("The input type is invalid, enter a valid age without decimals.");
            }
        }

    }

    public double promptDouble(String message){
        double heightValue;
        while (true){
            try {
                System.out.println(message);
                heightValue = Double.parseDouble(usInput.nextLine());
                return heightValue;
            } catch (NumberFormatException e){
                System.out.println("The input type is invalid, enter a valid height with decimals.");
            }

        }


    }


}
