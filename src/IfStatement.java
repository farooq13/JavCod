import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte age;
        String name;

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Age: ");
        age = scanner.nextByte();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Name: " + name);
        }

        if (age < 18) {
            System.out.println("You are too young for it.");
        } else {
            System.out.println("Age: " + age);
        }

        scanner.close();
    }
}