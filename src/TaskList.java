import java.util.ArrayList;

public class TaskList {


    private ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> tasks){
        this.tasks = tasks;
    }


    public void printCompletedTasks() {
        System.out.println("Taches terminees :");
        for (Task task : this.tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    // Générer un rapport des tâches non terminées
    public void printPendingTasks() {
        System.out.println("Taches non terminees :");
        for (Task task : this.tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

}
