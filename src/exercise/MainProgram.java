package exercise;

import java.awt.Color;
import java.awt.Graphics;

public class MainProgram {

    public static void testDrawable(Display display, Drawable circles) throws Exception {

        // TODO : Move to location and draw Yellow Circles
        circles.move(50, 0);
        circles.draw(Color.YELLOW);

        // TODO : Move to location and draw RED Circles
        circles.move(0, 100);
        circles.draw(Color.RED);

        // TODO : Move to location and draw Circles with Fillable AQUA
        circles.move(0, 100);
        circles.draw(Fillable.AQUA);

        display.pause(500);
    }

    public static void testFillable(Display display, Fillable filledCircles) throws Exception {

        //TODO: Set Location back to location (50, 50)
        Circles other = (Circles) filledCircles;
        other.setLocation(50, 50);

        display.pause(500);

        // TODO : Draw fillable  RED, WHITE and BLUE Circles
        filledCircles.fill(Color.RED);
        filledCircles.fill(Color.WHITE);
        filledCircles.fill(Color.BLUE);

        // TODO : Draw circles with Fillable AQUA Color
        filledCircles.draw();
        other.move(50,50);
        other.draw(Fillable.AQUA);
        display.pause(500);
    }

    public static void main(String[] args) throws Exception{

        Display display = new Display(600, 500);
        display.setBackground(Color.DARK_GRAY);

        // Get Graphics Pen Object for Drawing in Window
        Graphics pen = display.getGraphics();

        // TODO : Create Circles of a Drawable Type
        Drawable circles01 = new Circles(pen);

        // TODO : Draw Drawable Circles
        testDrawable(display, circles01);

        // clear display if needed (uncomment)
        display.clear();

        // TODO : Create Circles of a Fillable Type
        Fillable circles02 = new Circles(pen);

        // TODO : Draw Fillable Circles
        testFillable(display, circles02);
    }
}
