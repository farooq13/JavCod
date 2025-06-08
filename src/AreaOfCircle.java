public class AreaOfCircle{
    static final double PI = Math.PI;
    static float radius = 5.0f;
    static double area = PI * Math.pow(radius, 2);
    static float result = (float) area;

    public static void main(String[] args) {

        System.out.printf("Area of circle: %.3f", result);
    }
}