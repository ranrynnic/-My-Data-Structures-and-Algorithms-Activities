import java.util.Hashtable;
import java.util.Scanner;

public class RanolaEventPlanner {
    public static void main(String[] args) {
        Hashtable<String, String> events = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Event Planner =====");
           			 System.out.println("1. Add Event");
           					 System.out.println("2. View Event");
           							 System.out.println("3. Delete Event");
           					 System.out.println("4. View All Events");
           			 System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Add Event
                    System.out.print("Enter event name: ");
                    String name = scanner.nextLine();
                    if (events.containsKey(name)) {
                        System.out.println("Event already exists!");
                    } else {
                        System.out.print("Enter event details: ");
                        String details = scanner.nextLine();
                        events.put(name, details);
                        System.out.println("Event added!");
                    }
                    break;

                case 2: // View Event
                    System.out.print("Enter event name: ");
                    String viewName = scanner.nextLine();
                    if (events.containsKey(viewName)) {
                        System.out.println("Event Details: " + events.get(viewName));
                    } else {
                        System.out.println("Event not found!");
                    }
                    break;

                case 3: // Delete Event
                    System.out.print("Enter event name: ");
                    String deleteName = scanner.nextLine();
                    if (events.remove(deleteName) != null) {
                        System.out.println("Event deleted!");
                    } else {
                        System.out.println("Event not found!");
                    }
                    break;

                case 4: // View All Events
                    if (events.isEmpty()) {
                        System.out.println("No events available.");
                    } else {
                        System.out.println("Events:");
                        for (String event : events.keySet()) {
                            System.out.println("- " + event + ": " + events.get(event));
                        }
                    }
                    break;

                case 5: // Exit
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }
}
