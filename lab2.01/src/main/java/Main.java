/*
Только запуск
*/
public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        User user = program.signIn();

        if (user == null) {
            System.out.println("Введены неверные данные");
        } else {
            System.out.println("Вы успешно афторизованы");

            Work work = new Work(user);
            work.showMenu();
        }
    }
}