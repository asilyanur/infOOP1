public class ScoreSheet {
    private Subject subject;
    private Student student;
    private int score;
    private String date;
    private String typeOfTheTask;

    public ScoreSheet(Subject subject, Student student) {
        this.subject = subject;
        this.student = student;
    }

    public void setScore(int score, String typeOfTheTask, String date) {
        this.score = score;
        this.typeOfTheTask = typeOfTheTask;
        this.date = date;


        student.addToRating(subject.getIndex(), score);
    }

    public String toString() {
        return "Ведомость: " + subject.getName() +
                ", Студент: " + student +
                ", Балл: " + score +
                ", Дата: " + date +
                ", За что: " + typeOfTheTask;
    }
}
