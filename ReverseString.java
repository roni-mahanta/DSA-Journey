import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
       // String s ="Roni";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("user name :"+ s);
        String rev ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println("Reverse string "+rev);
    }
}
