import java.util.ArrayList;
import java.util.List;

class TaskManager {
    private List<Task> tasks;

    private TaskAddOrUpdate taskAddOrUpdate;

    private TaskList taskList;

    public TaskManager() {
        tasks = new ArrayList<>();
        taskAddOrUpdate = new TaskAddOrUpdate(tasks);
        taskList = new TaskList(tasks);
    }


    public void addTask(String taskName, String description){
        this.taskAddOrUpdate.addTask(taskName, description);
    }


    public void markTaskAsComplete(int i) {
        // Ajouter une nouvelle tâche
        this.taskAddOrUpdate.markTaskAsComplete(i);
    }


    public void printPendingTasks() {
        taskList.printPendingTasks();
    }


    public void printCompletedTasks() {
        taskList.printCompletedTasks();
    }
}