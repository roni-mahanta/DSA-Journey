import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered elements are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Sorting the array
        Selection sorter = new Selection();
        sorter.selectionSort(arr);

        System.out.println("Sorted elements are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        // sc.close(); // Uncomment if you want to close the scanner
    }

    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Iterate till n-1
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Find the index of the minimum element
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
