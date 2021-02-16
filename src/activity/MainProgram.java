package activity;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainProgram {

    public static SquareMatrix read(String location) throws IOException {
        File file      = new File(location);
        Scanner input  = new Scanner(file);
        int size       = input.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        return new SquareMatrix(matrix);
    }

    public static void write(String location, StringBuilder builder) throws IOException {
        File file           = new File(location);
        PrintWriter writer  = new PrintWriter(file);

        writer.println(builder);
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        String location       = "data" + File.separator + "matrix.txt";
        String otherLocation  = "data" + File.separator + "other_matrix.txt";
        String outputLocation = "data" + File.separator + "output.txt";

        // Create object to append string output of matrix
        StringBuilder builder = new StringBuilder("\n");

        // TODO : Create matrices for testing
        SquareMatrix matrix = read(location);
        SquareMatrix other = read(otherLocation);
        SquareMatrix identityMatrix = new SquareMatrix(3);
        SquareMatrix addMatrix = matrix.add(other);
        SquareMatrix multiplyMatrix = matrix.multiply(other);
        SquareMatrix subtractMatrix = matrix.subtract(other);


        builder.append(matrix);
        builder.append(other);
        builder.append(addMatrix);
        builder.append(multiplyMatrix);
        builder.append(subtractMatrix);

        // TODO : Test operations of Square Matrices
        System.out.println("Matrix");
        System.out.println(matrix);

        System.out.println("Other_Matrix");
        System.out.println(other);

        System.out.println("Identity Matrix");
        System.out.println(identityMatrix);

        System.out.println("Addition Matrix");
        System.out.println(addMatrix);

        System.out.println("Multiplication Matrix");
        System.out.println(multiplyMatrix);

        System.out.println("Subtraction Matrix");
        System.out.println(subtractMatrix);

        System.out.println("Matrix equals to other_matrix: " + matrix.equals(other));

        System.out.println();
        System.out.println("Matrix is diagonal: " + matrix.isDiagonal());
        System.out.println("other_Matrix is diagonal: " + other.isDiagonal());

        System.out.println();
        System.out.println("Matrix is Identity: " + matrix.isIdentity());
        System.out.println("other_Matrix is Identity: " +other.isIdentity());



        // write to output file
        write(outputLocation, builder);

    }
}
