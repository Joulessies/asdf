import java.util.*;

public class Main {

    static void Menu() {
        System.out.println("Menu: ");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Hot Chocolate");
        System.out.println("4. Iced Coffee");
        System.out.println("5. Iced Tea");
    }

    static void line() {
        String coffeeEmoji = "☕";
        System.out.println("-------------------------------------------------");

        Queue<String> q = new LinkedList<>();
        q.add("Robert");
        q.add("Adona");
        q.add("Luis");
        q.add("Miguel");

        System.out.println("Queue: " + q);
        System.out.println("-------------------------------------------------");
        System.out.println("Welcome to Julius Coffee Shop! " + coffeeEmoji);

        Scanner userInput = new Scanner(System.in);

        while (!q.isEmpty()) {
            System.out.println("Press enter to serve the next person");
            userInput.nextLine();

            String currentCustomer = q.poll();
            System.out.println("Serving: " + currentCustomer);

            Menu();

            System.out.print("Enter the number of the drink you would like to order: ");
            int drinkNumber;
            try {
                drinkNumber = userInput.nextInt();
                userInput.nextLine();
            } catch (InputMismatchException e) {
                userInput.nextLine();
                System.out.println("Invalid drink number. Please enter a number between 1 and 5.");
                continue;
            }

            switch (drinkNumber) {
                case 1 -> System.out.println("You ordered Coffee");
                case 2 -> System.out.println("You ordered Tea");
                case 3 -> System.out.println("You ordered Hot Chocolate");
                case 4 -> System.out.println("You ordered Iced Coffee");
                case 5 -> System.out.println("You ordered Iced Tea");
                default -> System.out.println("Invalid drink number");
            }

            System.out.println("Order Completed!");

            if (q.isEmpty()) {
                System.out.println("No more people in the queue");
                System.out.println("Press [T] to continue the transaction or [Q] to quit");
                String continueTransaction = userInput.nextLine();
                if (continueTransaction.equalsIgnoreCase("T")) {
                    line();
                } else if (continueTransaction.equalsIgnoreCase("Q")) {
                    System.out.println("Thank you for visiting Julius Coffee Shop!");
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            }
        }

        System.out.println("-------------------------------------------------");
    }

    public static void main(String[] args) {
        line();
    }
}
