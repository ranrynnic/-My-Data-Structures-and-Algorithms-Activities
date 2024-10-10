import java.util.Scanner;
public class MergeSort {

    // Metodo para i-merge ang duha ka bahin sa array
    public static void merge(int[] array, int left, int middle, int right) {
        // Kwentaha ang gidak-on sa duha ka sub-array
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Himo og temporaryong arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Gamita ang nested loops para i-copy ang mga elemento sa temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i]; // I-copy ang mga elemento sa left array
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j]; // I-copy ang mga elemento sa right array
        }

        int i = 0, j = 0;
        int k = left; // Starting index para i-merge ang duha ka sub-array

        // Pag-merge sa mga elemento gikan sa duha ka arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i]; // I-copy ang elemento gikan sa left array
                i++;
            } else {
                array[k] = rightArray[j]; // I-copy ang elemento gikan sa right array
                j++;
            }
            k++;
        }

        // I-copy ang nabilin nga mga elemento gikan sa leftArray
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // I-copy ang nabilin nga mga elemento gikan sa rightArray
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Metodo para mag-perform og merge sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // I-sort ang una ug ikaduhang bahin
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // I-merge ang na-sort nga mga bahin
            merge(array, left, middle, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // I-input ang gidak-on sa array
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // I-input ang mga elemento sa array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Pagkuha sa mga elemento gikan sa user
        }

        // Mag-perform og merge sort
        mergeSort(array, 0, size - 1);

        // Output sa na-sort nga array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // I-print ang na-sort nga mga elemento
        }
        System.out.println(); // Bagong linya
    }
}