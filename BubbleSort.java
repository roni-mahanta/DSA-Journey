import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //int[] arr={20,5,6,51,36};
        System.out.println("Enter the size of the array: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter the array elements are: ");
        for (int i = 0; i < a; i++) {
            arr[i]=sc.nextInt();
        }
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}

