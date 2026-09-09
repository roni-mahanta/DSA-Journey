import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = st.nextLine();
        System.out.println("String is "+s);
        String rev="";
        for (int i = s.length()-1; i>=0; i--) {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
}

