public class Subject {
    private String name;
    private Teacher teacher;
    private String typeOfLesson;
    private int index;

    Subject (String name, Teacher teacher, String typeOfLesson, int index) {
        this.name = name;
        this.teacher = teacher;
        this.typeOfLesson = typeOfLesson;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
