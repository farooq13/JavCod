
public class MathMethods {
    public static void main(String[] args) {
        System.out.println("Pi = " + Math.PI);
        System.out.println("e = " + Math.E);

        double result = Math.pow(2, 3);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14); // round up
        result = Math.floor(3.14); // round down
        result = Math.max(20, 30);
        result = Math.min(10, 5);

        System.out.println("Result: " + result);
    }
}