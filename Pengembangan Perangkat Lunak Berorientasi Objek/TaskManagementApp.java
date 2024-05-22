import java.util.Scanner;

public class TaskManagementApp {
    private static Scanner scanner = new Scanner(System.in);
    private static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Task Management Application");
            System.out.println("1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Delete Task");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    editTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    listTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        taskManager.addTask(title, description);
    }

    private static void editTask() {
        System.out.print("Enter task ID to edit: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new task title: ");
        String newTitle = scanner.nextLine();
        System.out.print("Enter new task description: ");
        String newDescription = scanner.nextLine();
        taskManager.editTask(taskId, newTitle, newDescription);
    }

    private static void deleteTask() {
        System.out.print("Enter task ID to delete: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        taskManager.deleteTask(taskId);
    }

    private static void listTasks() {
        taskManager.listTasks();
    }
}
