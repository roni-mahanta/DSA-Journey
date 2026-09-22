import java.util.Scanner;

public class MissingNumberInArr {

    public  static  int findMissingNumber(int[] arr, int n){
        int totalSum=n*(n + 1)/2;
        int arrSum=0;
        for (int num:arr) {
            arrSum =arrSum + num;
        }
        return totalSum-arrSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of element:");
        int n= sc.nextInt();

        int[] arr=new  int[n];
        System.out.println("Enter the element 1 to N:");
        for (int i = 0; i < n-1; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Missing number is:" + findMissingNumber(arr,n));
    }
}
