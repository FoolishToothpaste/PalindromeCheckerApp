package appcode;
import java.util.Stack;

public class PalindromeCheckerApp 
{
    public static void main(String[] args) {
        String input = "level";
        
        System.out.println("Input : " + input);

        // --- Approach 1: Pointer-Based (Iterative) ---
        long startIterative = System.nanoTime();
        boolean isPalIterative = checkIterative(input);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // --- Approach 2: Stack-Based ---
        long startStack = System.nanoTime();
        boolean isPalStack = checkStack(input);
        long endStack = System.nanoTime();
        long timeStack = endStack - startStack;

        // Display results as per the required output format
        System.out.println("Is Palindrome? : " + isPalIterative);
        System.out.println("Execution Time (Iterative): " + timeIterative + " ns");
        System.out.println("Execution Time (Stack-Based): " + timeStack + " ns");
    }

    /**
     * Pointer-based approach (High performance, low memory)
     */
    public static boolean checkIterative(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}