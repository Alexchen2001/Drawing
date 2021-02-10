package exercise;
import java.awt.Color;

public interface Fillable {
    Color AQUA = new Color(0, 150, 255);
    void draw();
    void fill(Color color);
}
