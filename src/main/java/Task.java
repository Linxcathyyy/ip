/**
 * Represents a general task that the user wants to add
 * in his or her todo list.
 */
public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "1" : "0"); // mark done task with X
    }

    public String getDescription() {
        return description; // mark done task with X
    }

    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return " | " + getStatusIcon() + " | " + getDescription();
    }
}
