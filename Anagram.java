import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){
      //  s1.replaceAll("//s","");
      //  s2.replaceAll("//s","");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2= sc.nextLine();

       if (isAnagram(s1,s2)){
           System.out.println("Anagram ");
       }else{
           System.out.println("Not anagram");
       }
    }
}

