package rose.task;

/**
 * Represents a task without any date/time attached to it.
 *
 * <p>A <code>Todo</code> object is represented by the description of the task
 * and the status of completion. e.g., <code>[T][ ] watch lecture video</code>.
 */
public class Todo extends Task {

    public Todo (String taskName) {
        super(taskName);
    }

    public Todo (String taskName, boolean isDone) {
        super(taskName, isDone);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * Returns a string representation of the todo task in a comma-separated format.
     *
     * <p>The format is: <code>"T,status,taskName"</code>, where <code>status</code>
     * is "X" if the task is done, and a space (" ") if the task is not done.</p>
     *
     * @return A comma-separated string representing the todo task's type, status, and name.
     */
    @Override
    public String commaString() {
        return String.format("T,%s", super.commaString());
    }
}
