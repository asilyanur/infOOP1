import java.util.Scanner;

public class Program {

    private User[] dataBase;

    private int countUsers;

    public Program() {
        dataBase = new User[100];
        dataBase[0] = new User("Amina", "123", "admin");
        dataBase[1] = new User("Arina", "132", "user");
        dataBase[2] = new User("Danya", "321", "user");
        dataBase[3] = new User("Rif", "213", "user");

        countUsers = 4;
    }

    public void run() {
        User user = signIn();
        //проверка на null

        new Work(user).showMenu();
    }

    public User signIn() {
        // ожидается ввод с консоли
        Scanner scanner = new Scanner(System.in);
        // checkUser
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        User user = checkUser(login, password);
        return user;
    }

    public User checkUser(String login, String password) {
        for (int i = 0; i < countUsers; i++) {
            if (login.equals(dataBase[i].getLogin()) && password.equals(dataBase[i].getPassword())) {
                return dataBase[i];
            }
        }
        return null;
    }
}
