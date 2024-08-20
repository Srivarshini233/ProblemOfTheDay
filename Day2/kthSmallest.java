//to find the k th smallest element in the give unsorted array

import java.util.Arrays;

public class kthSmallest {
    public static int kthsmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr = {1,6,7,8,9};
        System.out.println(kthsmallest(arr, 3));
        
    }
}
