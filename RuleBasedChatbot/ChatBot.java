import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("ChatBot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.contains("hello")) {
                System.out.println("ChatBot: Hi there! How can I help?");
            } else if (input.contains("your name")) {
                System.out.println("ChatBot: I'm ChatBot, your virtual buddy.");
            } else if (input.contains("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            } else {
                System.out.println("ChatBot: Sorry, I didn't understand that.");
            }
        }

        sc.close();
    }
}
