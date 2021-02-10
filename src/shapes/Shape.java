package shapes;

public abstract class Shape {

    private double x;
    private double y;

    public Shape(){
        this(0.0, 0.0);
    }

    public Shape(double x, double y){
        setLocation(x, y);
    }

    public abstract double area();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean equals(Object obj){

        if(obj instanceof Shape){
            Shape other = (Shape) obj;
            return this.x == other.x && this.y == other.y;
        }

        return false;
    }

    public void setLocation(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return String.format("(%.1f, %.1f)", x, y);
    }

}
