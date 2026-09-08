public class secondLargest {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr={12,35,1,10,34,1};
        secondLargest obj=new secondLargest();
        int result=obj.getSecondLargest(arr);
        System.out.println("Second largest element is:" + result);
    }
}
