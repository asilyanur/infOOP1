public class Student {
    private String name;
    private String group;
    private int subjectsCount;
    private int[] ratings;

    Student(String name, String group, int subjectsCount) {
        this.name = name;
        this.group = group;
        this.subjectsCount = subjectsCount;
        this.ratings = new int[subjectsCount];
    }

    public void addToRating(int index, int score) {
        ratings[index] += score;
    }

    public int getRating(int index) {
        return ratings[index];
    }

    public String toString() {
        return name + ", группа " + group;
    }
}
