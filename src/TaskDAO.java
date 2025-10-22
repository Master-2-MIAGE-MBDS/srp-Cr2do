import java.util.ArrayList;

public class TaskDAO {

    private ArrayList<Task> tasks;

    public TaskDAO(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < this.tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public void addTask(String title, String description) {
        this.tasks.add(new Task(title, description));
    }

}
