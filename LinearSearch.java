import java.util.Scanner;

public class LinearSearch {
    
    // Metodo para mag-perform og linear search
    public static int linearSearch(int array[], int b) {
        int n = array.length; // Kuhaon ang gidak-on sa array

        // Loop para i-scan ang matag elemento sa array
        for (int a = 0; a < n; a++) {
            // Kung ang elemento sa array equal sa "b", i-return ang index
            if (array[a] == b)
                return a;
        }
        // Kung wala nakit-an ang elemento, i-return ang -1
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Magamit og Scanner para sa user input

        // Input para sa gidak-on sa array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); // Gikuha ang gidak-on sa array gikan sa user

        int array[] = new int[n]; // Pag-himo og array nga may gidak-on nga "n"

        // Input para sa mga elemento sa array
        System.out.println("Enter " + n + " the elements of the array: ");
        for (int a = 0; a < n; a++) {
            array[a] = sc.nextInt(); // I-store ang matag elemento nga gi-input sa array
        }

        // Input para sa elemento nga ipangita (target)
        System.out.println("Enter the target element to search: ");
        int b = sc.nextInt(); // I-store ang target element

        // Pag-perform og linear search
        int result = linearSearch(array, b);

        // Kung wala nakit-an ang elemento
        if (result == -1)
            System.out.println("Element not found");
        else // Kung nakit-an ang elemento, i-display ang index
            System.out.println("Element found at index: " + result);
    }
}