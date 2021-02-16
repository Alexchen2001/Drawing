package shapes;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(){
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public boolean equals(Object obj){
        if(obj instanceof Shape){
            Triangle other = (Triangle) obj;
            return this.a == other.a && this.b == other.b && this.c == other.c;
        }

        return false;
    };

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double perimeter(){
        return a + b + c;
    }
    @Override
    public String toString(){
        return String.format("%s, (%.1f), (%.1f), (%.1f)", super.toString(), a, b, c);
    }
}
