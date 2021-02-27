package activity;

public class SquareMatrix {
    private int[][] matrix;
    private int size;

    public SquareMatrix(int size){
        matrix = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = (i == j) ? 1 : 0;
            }
        }
        this.size = size;
    }

    public SquareMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        if(rows != columns)
            throw new IllegalArgumentException(" Must be an n x n Matrix");

        this.size = rows;

        this.matrix = matrix;
    }

    public SquareMatrix add(SquareMatrix other){
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                result[i][j] = this.matrix[i][j] +other.matrix[i][j];
            }
        }
        return new SquareMatrix(result);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof SquareMatrix){
            SquareMatrix other = (SquareMatrix) obj;
            if (size != other.size){
                return false;
                }
            for (int i = 0; i < size ; i++) {
                for (int j = 0; j < size; j++) {
                    if(matrix[i][j] != other.matrix[i][j]){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean isDiagonal(){
        int matchVal = matrix[0][0];
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && matrix[i][j] != matchVal){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIdentity(){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && matrix[i][j] != 1){
                    return false;
                } else if ( i != j && matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public SquareMatrix multiply(SquareMatrix other){
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                for (int k = 0; k < size; k++){
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }

            }
        }
        return new SquareMatrix(result);
    }

    public SquareMatrix subtract(SquareMatrix other){
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                result[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return new SquareMatrix(result);
    }

    //TODO: Update Class

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.append(matrix[i][j]).append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
