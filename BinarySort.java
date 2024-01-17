import java.util.Arrays;

public class BinarySort {
    public static void binarySort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = Math.abs(Arrays.binarySearch(arr, 0, i, key) + 1);
            System.arraycopy(arr, j, arr, j + 1, i - j);
            arr[j] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        binarySort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
