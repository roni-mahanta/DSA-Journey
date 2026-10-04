import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a <=0 || b <= 0|| a >= b){
            System.out.println("Provide valid input");
            return;
        }
        int num=a;
        while (num <= b){
            boolean isPrime=true;
            if (num < 2){
                 isPrime=false;
            }
            else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if(num % i ==0){
                        isPrime= false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(num + " ");
            }
            num++;
        }
    }
}

