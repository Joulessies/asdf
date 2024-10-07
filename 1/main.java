
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] arrOfNumber = { 2, 10, 15, 4, 1, 18, 6, 5 };

        System.out.println("Initial Array: " + Arrays.toString(arrOfNumber));

        System.out.println("\nBubble Sort Process:");
        bubbleSort(arrOfNumber.clone());

        System.out.println("\nSelection Sort Process:");
        selectionSort(arrOfNumber.clone());

        System.out.println("\nInsertion Sort Process:");
        insertionSort(arrOfNumber.clone());
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Bubble Sort Iteration " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

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
            System.out.println("Selection Sort Iteration " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Insertion Sort Iteration " + i + ": " + Arrays.toString(arr));
        }
    }
}
