

public class Main {
    int count = 0;

    public void increase() {
        count++;
        System.out.println(count);
    }
    public static void main(String [] args) {
        Main c1 = new Main();
        Main c2 = new Main();
        Main c3 = new Main();

        c1.increase();
        c2.increase();
        c3.increase();

    }
}