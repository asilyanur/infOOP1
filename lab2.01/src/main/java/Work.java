public class Work {

    private User user;

    public Work(User user) {
        this.user = user;
    }

    private void showAdminMenu() {

    }

    private void showUserMenu() {

    }

    public void showMenu() {
        switch (user.getRole()) {
            case "ADMIN": showAdminMenu(); break;
            case "USER": showUserMenu(); break;
        }
    }

}
