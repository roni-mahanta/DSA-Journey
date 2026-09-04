public class ConsecutiveNumber {
static int maxConsecutiveCount(int[] arr){
    if (arr.length==0){
        return 0;
    }
    int maxCount=0, Count=1;
    for (int i = 1; i < arr.length; i++) {
        if(arr[i]==arr[i-1]){
            Count++;
        }else{
            maxCount=Math.max(maxCount,Count);
            Count=1;
        }
    }
    return Math.max(maxCount,Count);
}


    public static void main(String[] args) {
        int[] arr= {1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(maxConsecutiveCount(arr));
    }
}
