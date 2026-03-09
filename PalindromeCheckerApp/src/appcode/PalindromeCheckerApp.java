package appcode;

public class PalindromeCheckerApp {
	
    public static void main(String[] args) {
        // Define the input string
        String input = "radar";

        // Create an instance of the service class (Encapsulation)
        PalindromeService service = new PalindromeService();

        // Call the service method
        boolean isPalindrome = service.checkPalindrome(input);

        // Display results
        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


class PalindromeService 
{
   public boolean checkPalindrome(String input) 
   {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Mismatch found
            }
            start++; // Move forward
            end--;   // Move backward
        }

        return true; // No mismatches found
    }
}