package shapes;

public class MainProgram {

    public static void intro(){
        System.out.println("\t \t W E L C O M E");
        System.out.println(" P L A Y     W I T H     S H A P E S");
    }
    public static void testShape(Shape shape){
        if (shape instanceof Circle) {
            System.out.println("radius: " + ((Circle) shape).radius());
        } else if(shape instanceof Rectangle) {
            System.out.println("width: " + ((Rectangle) shape).width());
            System.out.println("height: "+ ((Rectangle) shape).height());
        } else if(shape instanceof Triangle) {
            System.out.println("side A: " + ((Triangle) shape).getA());
            System.out.println("side B: " + ((Triangle) shape).getB());
            System.out.println("side C: " + ((Triangle) shape).getC());

        }
        System.out.println("perimeter: " + shape.perimeter());
        System.out.println("area: " + shape.area());
    }

    public static void main(String[] args) {
        intro();
        System.out.println("-------------------------------");
        Shape shape = new Circle(4.0);
        System.out.println("Shape's perimeter: " + shape.perimeter() + " Shape's area: "
                + shape.area() + " Shape's to String: " + shape);

        shape = new Rectangle(4.0,5.0);
        System.out.println("Shape's perimeter: " + shape.perimeter() + " Shape's area: "
                + shape.area() + " Shape's to String: " + shape);

        shape = new Triangle(5.0, 12.0, 13.0);
        System.out.println("Shape's perimeter: " + shape.perimeter() + " Shape's area: "
                + shape.area() + " Shape's to String: " + shape);
        System.out.println("-------------------------------");


        System.out.println();
        shape = new Circle(3.0);
        System.out.println("Shape's perimeter: " + shape.perimeter() + " Shape's area: "
                + shape.area() + " Shape's to String: " + shape);


        shape = new Rectangle(6.0,13.0);
        System.out.println("Shape's perimeter: " + shape.perimeter() + " Shape's area: "
                + shape.area() + " Shape's to String: " + shape);


        shape = new Triangle(8.0,15.0,17.0);
        System.out.println("Shape's perimeter: " + shape.perimeter() + " Shape's area: "
                + shape.area() + " Shape's to String: " + shape);
        System.out.println("-------------------------------");

        System.out.println("Test of Circle: Circle Info");
        shape = new Circle(4.0);
        testShape(shape);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Test of Rectangle: Rectangle Info");
        shape = new Rectangle(4.0,5.0);
        testShape(shape);
        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("Test of Triangle: Triangle Info");
        shape = new Triangle(8.0,15.0,17.0);
        testShape(shape);
        System.out.println("-------------------------------");




    }
}
