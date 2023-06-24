import java.util.*;

public class WordGameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Interactive main menu
        while (true) {
            System.out.println("Welcome to the Word Game Program!");
            System.out.println("Please select an option:");
            System.out.println("1. Substring Problem");
            System.out.println("2. Points Problem");
            System.out.println("3. Palindrome Problem");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    solveSubstringProblem(scanner);
                    break;
                case 2:
                    solvePointsProblem(scanner);
                    break;
                case 3:
                    solvePalindromeProblem(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    // Substring Problem
    public static void solveSubstringProblem(Scanner scanner) {
        System.out.println("Substring Problem");
        // Your code for solving the substring problem goes here
        
        System.out.println("Substring Problem solved!");
    }
    
    // Points Problem
    public static void solvePointsProblem(Scanner scanner) {
        System.out.println("Points Problem");
        // Your code for solving the points problem goes here
        
        System.out.println("Points Problem solved!");
    }
    
    // Palindrome Problem
    public static void solvePalindromeProblem(Scanner scanner) {
        System.out.println("Palindrome Problem");
        // Your code for solving the palindrome problem goes here
        
        System.out.println("Palindrome Problem solved!");
    }
}
