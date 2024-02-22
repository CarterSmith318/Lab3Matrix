package Lab3Matrix;

public class Lab3Matrix {
    int rows;
    int cols;
    private int[][] data;

    public Lab3Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public int get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    public static Lab3Matrix add(Lab3Matrix matrix1, Lab3Matrix matrix2) {
        if (matrix1.rows != matrix2.rows || matrix1.cols != matrix2.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        Lab3Matrix result = new Lab3Matrix(matrix1.rows, matrix1.cols);
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.cols; j++) {
                result.set(i, j, matrix1.get(i, j) + matrix2.get(i, j));
            }
        }

        return result;
    }

    public static Lab3Matrix multiply(Lab3Matrix matrix1, Lab3Matrix matrix2) {
        if (matrix1.cols != matrix2.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
        }

        Lab3Matrix result = new Lab3Matrix(matrix1.rows, matrix2.cols);
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix2.cols; j++) {
                int sum = 0;
                for (int k = 0; k < matrix1.cols; k++) {
                    sum += matrix1.get(i, k) * matrix2.get(k, j);
                }
                result.set(i, j, sum);
            }
        }

        return result;
    }

    
 ///See test driver
        
    
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

