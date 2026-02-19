public class Task {
    public String description;
    public boolean completed;

    public Task(String description){
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeTask() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[X] " : "[ ] ") + description;
    }
}
