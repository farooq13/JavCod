import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("=========== Calculate Area Of Rectangle ===========");
        System.out.print("Width: ");
        width = scanner.nextDouble();

        System.out.print("Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area of the Rectangle is: " + area + "cm^2");

        scanner.close();
    }
}