import javax.swing.*;
import java.util.Random;

public class main {
    public static int Count, WIDTH, HEIGHT, Millis;
    public static int[] Bars;

    public static Random rand;
    static int FPS;

    public static void main(String[] args) {
        init();
        makeBars(Count);
        initFrame();
    }

    public static void init() {
        WIDTH = 2000;
        HEIGHT = 720;

        // Count should be divisible by width
        FPS = 25;       // Set to > 1000 to run instantly

        Count = 100;   // Number of rectangles
        Millis = Math.floorDiv(1000,FPS);

        Bars = new int[Count];
        rand = new Random();
    }

    public static void initFrame() {
        Draw d = new Draw();
        JFrame f = new JFrame("Sorting Program");

        f.add(d);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        f.pack();
        f.setSize(WIDTH, HEIGHT);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
//        d.selectionSort();
        d.insertionSort();
    }

    public static void makeBars(int c) {
        for (int i = 0; i < c; i++) {
            Bars[i] = rand.nextInt(HEIGHT - (int) HEIGHT / 5) + (int) (HEIGHT / 5);
        }
    }
}