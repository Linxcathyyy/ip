import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a specific task (an event) containing the description
 * and the deadline of the task that the user wants
 * to add in his or her todo list.
 */
public class Deadline extends Task{
    protected LocalDate date;
    protected String time;

    public Deadline(String description, LocalDate date, String time) {
        super(description);
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "D" + super.toString() + " | " + date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + " " + time;
    }
}
