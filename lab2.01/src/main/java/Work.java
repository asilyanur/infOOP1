import java.util.Scanner;

public class Work {

    private User user;
    private Scanner scanner;

    public Work(User user) {
        this.user = user;
        this.scanner = new Scanner(System.in);
    }

    private void showAdminMenu() {
        while (true) {
            System.out.println("1 - Посмотреть информацию о себе");
            System.out.println("2 - Выйти");
            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Логин: " + user.getLogin());
                    System.out.println("Роль: " + user.getRole());
                    break;
                case "2":
                    System.out.println("Выход из меню администратора.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private void showUserMenu() {
        while (true) {
            System.out.println("1 - Посмотреть информацию о себе");
            System.out.println("2 - Выйти");
            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Логин: " + user.getLogin());
                    System.out.println("Роль: " + user.getRole());
                    break;
                case "2":
                    System.out.println("Выход из меню пользователя.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    public void showMenu() {
        switch (user.getRole()) {
            case "ADMIN": showAdminMenu(); break;
            case "USER": showUserMenu(); break;
        }
    }

}
