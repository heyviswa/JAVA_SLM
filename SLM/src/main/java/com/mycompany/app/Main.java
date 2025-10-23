package com.mycompany.app;

import java.util.Scanner; // Import the Scanner class to read user input

public class Main {
    public static void main(String[] args) {
        System.out.println("🤖 Welcome to the Java Code Companion!");
        System.out.println("   Ask any Java question, or type 'exit' to quit.");

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        String userInput; // Variable to store what the user types

        // Start an infinite loop to keep the conversation going
        while (true) {
            // Prompt the user for input
            System.out.print("\n[You] > ");

            // Read the user's entire line of input
            userInput = scanner.nextLine();

            // Check if the user wants to exit
            if (userInput == null || userInput.equalsIgnoreCase("exit") || userInput.trim().isEmpty()) {
                break; // Exit the loop
            }

            // --- THIS IS THE PLACEHOLDER FOR AI RESPONSE ---
            // For now, we'll just echo back what the user said
            // We will replace this with a real AI model call later
            String aiResponse = "This is a placeholder response for: '" + userInput + "'";

            // Display the placeholder response
            System.out.println("[Companion] > " + aiResponse);
        }

        System.out.println("Goodbye! Keep coding!");
        scanner.close(); // Close the scanner to release system resources
    }
}