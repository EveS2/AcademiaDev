public class Courses {
    private String title;
    private String description;
    private String instructorName;
    private int durationInHours;
    private DifficultyLevel difficultyLevel;
    private StatusCurso status;

    public Courses(String title, String description,
    String instructorName, int durationInHours, 
    DifficultyLevel difficultyLevel, StatusCurso status) {
        this.title = title;
        this.description = description;
        this.instructorName = instructorName;
        this.durationInHours = durationInHours;
        this.difficultyLevel = difficultyLevel;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public StatusCurso getStatus() {
        return status;
    }
}
