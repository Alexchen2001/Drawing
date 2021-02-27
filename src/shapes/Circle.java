package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(){

        this(1.0);
    }

    public Circle(double radius) {
        if (radius < 0.0){
            throw new IllegalArgumentException("radius cannot be negative. Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area(){

        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj){

        if(obj instanceof Circle){
            Circle other = (Circle) obj;
            return this.radius == other.radius;
        }

        return false;
    }

    @Override
    public double perimeter(){

        return Math.PI * radius * 2;

    }

    public double radius(){

        return radius;
    }

    @Override
    public String toString(){

        return String.format("%s, (%.1f)", super.toString(), radius);
    }
}
