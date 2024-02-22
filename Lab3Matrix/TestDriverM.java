package Lab3Matrix;

public class TestDriverM {
    public static void main(String[] args) {
        // Create matrices
        Lab3Matrix matrixA = new Lab3Matrix(3, 3);
        Lab3Matrix matrixB = new Lab3Matrix(3, 3); // Adjusted to have the same number of columns as matrixA has rows

        // Initialize matrices with values
        initializeMatrix(matrixA, 2);
        initializeMatrix(matrixB, 3);

        // Print matrices before operations
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);

        try {
            // Perform addition
            Lab3Matrix sumResult = Lab3Matrix.add(matrixA, matrixB);
            System.out.println("Matrix A + B:");
            printMatrix(sumResult);

            // Perform multiplication
            Lab3Matrix productResult = Lab3Matrix.multiply(matrixA, matrixB);
            System.out.println("Matrix A * B:");
            printMatrix(productResult);

            // Demonstrate get and set operations
            int elementValue = matrixA.get(1, 2);
            System.out.println("Value at (1, 2) in matrixA: " + elementValue);

            matrixA.set(0, 1, 10);
            System.out.println("Matrix A after setting (0, 1) to 10:");
            printMatrix(matrixA);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Helper method to initialize a matrix with sequential values for testing
    private static void initializeMatrix(Lab3Matrix matrix, int startValue) {
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                matrix.set(i, j, startValue++);
            }
        }
    }

    // Helper method to print the contents of a matrix
    private static void printMatrix(Lab3Matrix matrix) {
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                System.out.print(matrix.get(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
