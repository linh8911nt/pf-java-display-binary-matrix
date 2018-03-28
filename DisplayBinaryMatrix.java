import java.util.Scanner;

public class DisplayBinaryMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of matrix: ");
        int sizeMatrix = input.nextInt();
        printMatrix(sizeMatrix);
    }

    public static void printMatrix(int sizeMatrix){
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = (int) Math.round(Math.random()*1);
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
