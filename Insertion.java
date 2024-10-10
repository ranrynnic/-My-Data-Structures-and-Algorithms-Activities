import java.util.Scanner; // Import sa Scanner class para sa input gikan sa user
public class InsertionSort {

    // Metodo para sa pag-perform og Insertion Sort
    public static void InsertionSort(int[] array) {
        for(int a = 0; a < array.length; a++) {
            int key = array[a]; // Ang elemento nga i-insert
            int b = a - 1;

            // While loop nga mutan-aw kung ang previous nga elemento mas dako sa "key"
            while(b >= 0 && array[b] > key) {
                array[b+1] = array[b]; // Ibalhin ang elemento nga mas dako sa "key" ngadto sa sunod nga posisyon
                b--; // I-decrement ang index aron ibalhin ang kasunod nga elemento
            }
            array[b+1] = key; // I-insert ang "key" sa iyang husto nga posisyon
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Magamit og Scanner para sa user input

        // I-input ang gidak-on sa array
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int array[] = new int [size]; // Pag-himo og array base sa gidak-on nga gi-input

        // I-input ang mga elemento sa array
        System.out.println("Enter an elements of an array:");
        for(int a = 0; a < size; a++) {
            array[a] = sc.nextInt(); // Kuhaon ang matag elemento sa user ug i-store sa array
        }

        // Pag-perform og Insertion Sort
        InsertionSort(array);

        // Ipakita ang resulta sa sorted nga array
        System.out.print("Sorted Array: ");
        for(int a = 0; a < size; a++) {
            System.out.print(array[a] + " "); // I-print ang matag sorted nga elemento
        }

        // Magbutang og bagong linya
        System.out.println();
    }
}