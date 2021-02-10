package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    public double radius(){
        return radius;
    }

    @Override
    public String toString(){
        return String.format("%s, (%.1f)", super.toString(), radius);
    }
}
