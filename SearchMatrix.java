import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row= sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols= sc.nextInt();

        int[][] matrix=new int[row][cols];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the target element:");
        int target= sc.nextInt();

        boolean found=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]==target){
                    System.out.print("Element found at position: (" + i + ", " + j + ")");
                    found=true;
                }
            }
        }
        if (!found){
            System.out.println("Element not found");
        }
    }
}

