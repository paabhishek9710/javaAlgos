import java.util.Arrays;

public class SelectionSort {

    //The logic is to find the smallest in the unsorted array(logical rightmost part of array) and swap it with the leftmost element in the unsorted array
    // and the logically merge it with the sorted array(on the left)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        //Should I print the unsorted array too :P
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
