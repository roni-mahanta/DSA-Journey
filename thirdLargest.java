public class thirdLargest {
    static int thirdLargestElement(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return -1;
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int num:arr) {
            if(num>first){
                third=second;
                second=first;
                first=num;
            } else if (num>second && num<first) {
                third=second;
                second=num;
            } else if (num>third && num<second) {
                third=num;
            }
        }
        return (third == Integer.MIN_VALUE) ? -1 : third;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 3, 54, 65};
        System.out.println(thirdLargestElement(arr));
    }
}
