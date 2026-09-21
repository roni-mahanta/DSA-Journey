import java.util.Scanner;

public class PerfectNum {

    public  static  boolean isPerfect(int num){
        int temp=num;
        int sum=0;
        for (int i = 1; i < num; i++) {
            if ( num % i == 0){
                sum+=i;
            }
        }
        return temp==sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (isPerfect(num)){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not perfect number");
        }
    }
}

