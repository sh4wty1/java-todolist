import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("Welcome to your To Do List!");
            System.out.println("Commands:");
            System.out.println("1 - List tasks");
            System.out.println("2 - New task");
            System.out.println("3 - Check task");
            System.out.println("4 - Delete task");
            System.out.println("5 - Exit");
            System.out.println("Enter your option: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    if(tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter task description:");
                    String desc = scanner.nextLine();
                    tasks.add(new Task(desc));
                    break;
                case 3:
                    System.out.println("Which task do you want to check?");
                    int checked = scanner.nextInt();
                    scanner.nextLine();

                    if (checked >= 1 && checked <= tasks.size()) {
                        tasks.get(checked - 1).completeTask();
                        System.out.println("Marked as completed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    System.out.println("Which task do you want to delete?");
                    int deleted = scanner.nextInt();
                    scanner.nextLine();

                    if (deleted >= 1 && deleted <= tasks.size()) {
                        tasks.remove(deleted - 1);
                        System.out.println("Task deleted.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
