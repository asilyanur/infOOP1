public class StatementMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Еникеев К. Ш.");
        Teacher teacher2 = new Teacher("Даутова Д. Н.");

        Subject subject1 = new Subject("Информатика и программирование", teacher1, "Практика", 0);
        Subject subject2 = new Subject("Математический анализ", teacher2, "Практика", 1);

        Student student1 = new Student("Нураниева Асиля", "11-503",17);

        ScoreSheet record1 = new ScoreSheet(subject1, student1);
        ScoreSheet record2 = new ScoreSheet(subject2, student1);
        ScoreSheet record3 = new ScoreSheet(subject2, student1);

        record1.setScore(3, "Активность на паре", "14.11.2025");
        record2.setScore(20, "Контрольная работа", "30.09.2025");
        record3.setScore(2,"Выход к доске", "13.11.2025");

        System.out.println(record1);
        System.out.println("Обновленный рейтинг студента: " + student1.getRating(0));
        System.out.println(record2);
        System.out.println(record3);
        System.out.println("Обновленный рейтинг студента: " + student1.getRating(1));
    }
}