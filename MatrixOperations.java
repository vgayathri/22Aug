import java.util.Scanner;

/**
 * Created by Gayathri on 22/08/17.
 */
import java.util.Scanner;

public class MatrixOperations {

    public  int[][] populateMatrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix :");
        int matRow=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix :");
        int matCol=sc.nextInt();
        int [][]matInput = new int[matRow][matCol];
        System.out.println("Getting input for matrix of dimension ["+matRow+"]["+matCol+"]");
        for (int i=0;i<matRow; i++) {
            System.out.println("Enter the numbers of the matrix A in row :" + (i+1));
            for (int j=0; j<matCol;j++ ) {
                System.out.println("Enter the numbers at position ["+i+"]["+j+"]");
                matInput[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        return matInput;
    }
    public  void printMatrix(int mat[][]) {

        for (int i=0;i<mat.length; i++) {
            for (int j=0; j<mat[0].length;j++ ) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void matrixAdd(int matrixA[][], int matrixB[][]) {
        int noOfRows = matrixA.length;
        int noOfColumns = matrixA[0].length;
        int[][] sumOfMatrix = new int[noOfRows][noOfColumns];
        // the rows and columns do not match then cannot add
        if (noOfRows != matrixB.length || noOfColumns != matrixB[0].length){
            System.out.println("Cannot add the two matrices as they have different rows and columns");
        return;
        }

        for (int i=0;i<noOfRows; i++) {
            for (int j=0; j<noOfColumns;j++ ) {
                    sumOfMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.print(sumOfMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public void matrixDiff(int matrixA[][], int matrixB[][]) {
        int noOfRows = matrixA.length;
        int noOfColumns = matrixA[0].length;
        int[][] diffOfMat = new int[noOfRows][noOfColumns];
        // the rows and columns do not match then cannot add
        if (noOfRows != matrixB.length || noOfColumns != matrixB[0].length){
            System.out.println("Cannot subtract the two matrices as they have different rows and columns");
            return;
        }

        for (int i=0;i<noOfRows; i++) {
            for (int j=0; j<noOfColumns;j++ ) {
                diffOfMat[i][j] = matrixA[i][j] - matrixB[i][j];
                System.out.print(diffOfMat[i][j]+" ");
            }
            System.out.println();
        }

    }
     public  void matrixMult(int matA[][], int matB[][]){

         int noOfRowsOfA = matA.length;
         int noOfColsOfA= matA[0].length;
         int noOfRowsOfB = matB.length;
         int noOfColsOfB= matB[0].length;

         if (noOfColsOfA != noOfRowsOfB ){
             System.out.println("Cannot multiply the two matrices as they are not compatible");
             return;
         }

         int[][] prodOfMatrix = new int[noOfRowsOfA][noOfColsOfB];
         for (int i=0;i<noOfRowsOfA; i++) {
             for (int j=0; j<noOfColsOfB;j++ ) {
                 int sum=0;
                 for (int k=0; k < noOfColsOfA; k++) {
                     sum = sum + (matA[i][k] * matB[k][j]);
                 }
                 prodOfMatrix[i][j]=sum;
                 System.out.print(prodOfMatrix[i][j]+" ");
             }
             System.out.println();
         }
     }

    public static void main(String[] args) {

        MatrixOperations mat1 = new MatrixOperations();

        System.out.println("Populating matrix A:");
        int [][]matA = mat1.populateMatrix();
        System.out.println("Populating matrix B:");
        int [][]matB = mat1.populateMatrix();

        System.out.println("Printing matrix A:");
        mat1.printMatrix(matA);
        System.out.println("Printing matrix B:");
        mat1.printMatrix(matB);

        System.out.println("Sum of above matrices is :");
        mat1.matrixAdd(matA, matB);
        System.out.println("Difference of above matrices is :");
        mat1.matrixDiff(matA, matB);

        System.out.println("Product of above matrices is :");
        mat1.matrixMult(matA,matB);
    }
}
