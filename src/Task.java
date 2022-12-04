import java.security.PublicKey;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Task {

    private final String title;
    private final String description;
    private final LocalDateTime taskDateTime;
    private final TaskType taskType;
    private final int id;
    private static int counter = 0;

    public Task(String title, String description, LocalDateTime taskDateTime, TaskType taskType) {
        this.title = title;
        this.description = description;
        this.taskDateTime = taskDateTime;
        this.taskType = taskType;
        this.id = counter++;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTaskDateTime() {
        return taskDateTime;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public int getId() {
        return id;
    }

    public abstract boolean appearsIn(LocalDate localDate);

    public abstract Repeatability getRepeatabilityType();

}
