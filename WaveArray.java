import java.util.Arrays;
public class WaveArray {
    public static void waveSort(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i+=2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

    }

    public static void main(String[] args) {
        int[] arr={20, 10, 8, 6, 4, 2};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        waveSort(arr);
        System.out.println("Wave Array: "+ Arrays.toString(arr));
    }
}

