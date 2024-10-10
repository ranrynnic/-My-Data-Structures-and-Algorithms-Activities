import java.util.Scanner; // Import og Scanner class para sa input gikan sa user
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Paggamit og Scanner para sa user input
        String rev = ""; // Variable para i-store ang na-reverse nga word

        // Prompt ang user nga musulod og pulong
        System.out.println("Enter any word ");
        String word = sc.nextLine(); // Pagkuha sa word gikan sa user

        // Loop para i-reverse ang word
        for(int a = word.length()-1; a >= 0; a--) {
            rev += word.charAt(a); // I-reverse ang word pinaagi sa pagkuha sa matag character gikan sa katapusan
        }

        // Pagsusi kung ang reverse nga word ug ang original nga word parehas ba
        if(rev.equals(word)) {
            System.out.println("PALINDROME SYA"); // Kung parehas, ipa-print nga palindrome
        } else {
            System.out.println("DILI PALINDROME"); // Kung dili, ipa-print nga dili palindrome
        }
    }
}