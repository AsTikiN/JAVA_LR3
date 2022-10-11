import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        char c2;
        byte b;
        float f;
        int i = -500;

        f = ThreadLocalRandom.current().nextFloat(0, 1000001);
        System.out.println("random float value: " + f);
        i = Math.round(f);
        System.out.println("Rounded float to int value: " + i);
        b = (byte)i;
        System.out.println("Converted int to byte value: " + b);

        double res = Math.pow(Math.sin(f), 2) + 2 * Math.pow(2, 1.0 / b);
        System.out.println("Result of the equation: " + res);
    }
}