import java.util.List;

public class TaskAddOrUpdate {

    private List<Task> tasks;

    public TaskAddOrUpdate(List<Task> tasks) {
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
