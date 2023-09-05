public class TaskPersistence {
    private String filePath;

    public TaskPersistence(String filePath) {
        this.filePath = filePath;
    }

    public List<Task> loadTasks() {
        // Read tasks from the file and return them
    }

    public void saveTasks(List<Task> tasks) {
        // Write tasks to the file
    }
}
