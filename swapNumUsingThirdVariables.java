public class swapNumUsingThirdVariables {

    static void swapNum(int num1, int num2){
        int temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("After swapping " + "num1: " + num1 + " num2: " + num2);
    }
    public static void main(String[] args) {
        int num1=9;
        int num2=5;
        swapNum(num1,num2);

    }
}
