import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    int count = main.Count;
    int bars[] = main.Bars;
    int index = count + 1;
    boolean sorted = false;

    Color bg = Color.black;
    Color us = Color.white;
    Color s = Color.green;
    Color beam = new Color(255, 0, 0, 50);

    long n = (int) (1000000 * main.Millis);  // Number of nanoseconds I want to wait

    int width = main.WIDTH, height = main.HEIGHT;
    int w = (int) (width / count);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(bg);

        g.setColor(Color.black);

        // Draw the rectangles based on the bars array
        for (int i = 0; i < count ; i++) {
            if (i <= index) g.setColor(s);
            else g.setColor(us);
            g.fillRect((w * i)   , height, w - 1, -bars[i]);

            if (i == index) {
                // Draw a beam to show what index it's looking at
                g.setColor(beam);

                g.fillRect(w * i, height, w - 1, -height);
            }
        }
    }

    public void selectionSort() {
        // Selection Sort
        int min;
        for (int i = 0; i < count; i++) {
            min = i;

            for (int j = i; j < count; j++) {
                if (bars[j] < bars[min]) min = j;
            }

            int temp = bars[min];
            bars[min] = bars[i];
            bars[i] = temp;

            if (i == (count - 1)) sorted = true;

            index = i;
            repaint();

            sleepFor(n);
        }
    }

    public void insertionSort() {
        int x = bars.length;
        for (int i = 1; i < x; i++) {
            int j = i - 1;
            int key = bars[i];

            while (j >= 0 && bars[j] > key) {
                bars[j + 1] = bars[j];
                j--;
            }
            index = i;
            bars[j + 1] = key;
            repaint();
            sleepFor(n);
        }
    }

    public void sleepFor(long nanoseconds) {
        long timeElapsed;
        final long startTime = System.nanoTime();
        do {
            timeElapsed = System.nanoTime() - startTime;
        } while (timeElapsed < nanoseconds);
    }
}