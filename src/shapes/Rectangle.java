package shapes;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){
        this(1.0, 1.0);
    }
    public Rectangle(double width, double height){
        this.width  = width;
        this.height = height;
    }

    public double area(){

        return width * height;
    }

    public boolean equals(Object obj){
        if(obj instanceof Rectangle){
            Rectangle other = (Rectangle) obj;
            return this.width == other.width && this.height == other.height;
        }

        return false;
    }

    public double height(){

        return height;
    }

    public double perimeter(){
        return (2 * height) + (2 * width);
    }

    public double width(){
        return width;
    }

    @Override
    public String toString(){
        return String.format("%s, (%.1f), (%.1f)", super.toString(), height, width);
    }
}
