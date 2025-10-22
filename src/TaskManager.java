import java.util.ArrayList;

class TaskManager {
    private ArrayList<Task> tasks;

    private TaskDAO taskManagerDAO;

    private TaskList taskManagerList;

    public TaskManager() {
        tasks = new ArrayList<>();
        taskManagerDAO = new TaskDAO(tasks);
        taskManagerList = new TaskList(tasks);
    }


    public void addTask(String taskName, String description){
        this.taskManagerDAO.addTask(taskName, description);
    }


    public void markTaskAsComplete(int i) {
        // Ajouter une nouvelle tâche
        this.taskManagerDAO.markTaskAsComplete(i);
    }


    public void printPendingTasks() {
        taskManagerList.printPendingTasks();
    }


    public void printCompletedTasks() {
        taskManagerList.printCompletedTasks();
    }
}