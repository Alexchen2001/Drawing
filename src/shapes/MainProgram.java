package shapes;

public class MainProgram {

    public static void intro(){
        System.out.println("\t \t W E L C O M E");
        System.out.println(" P L A Y     W I T H     S H A P E S");
    }

    public static void main(String[] args) {
        intro();
        Shape shape = new Rectangle(4.0,5.0);
        System.out.println("in toString - shape: " + shape);
        shape       = new Circle(4.0);
        System.out.println("in toString - shape: " + shape);
        shape       = new Triangle(5.0, 12.0, 13.0);
        System.out.println("in toString - shape: " + shape);

    }
}
