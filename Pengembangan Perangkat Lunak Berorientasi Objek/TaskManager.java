import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        Task newTask = new Task(title, description);
        tasks.add(newTask);
        System.out.println("Task '" + title + "' has been added.\n");
    }

    public void editTask(int taskId, String newTitle, String newDescription) {
        if (taskId >= 0 && taskId < tasks.size()) {
            Task task = tasks.get(taskId);
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            System.out.println("Task " + taskId + " has been updated to '" + newTitle + "'.\n");
        } else {
            System.out.println("Task ID not found.\n");
        }
    }

    public void deleteTask(int taskId) {
        if (taskId >= 0 && taskId < tasks.size()) {
            Task removedTask = tasks.remove(taskId);
            System.out.println("Task '" + removedTask.getTitle() + "' has been removed.\n");
        } else {
            System.out.println("Task ID not found.\n");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.\n");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("ID: " + i + "\n" + tasks.get(i) + "\n");
            }
        }
    }
}
