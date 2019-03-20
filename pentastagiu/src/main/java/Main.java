public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to BankAplication\n");
        ConsoleMenu consoleMenu= new ConsoleMenu();
        consoleMenu.displayConsoleMenu();
       LoginService loginService= new LoginService();
       loginService.login();
    }

}