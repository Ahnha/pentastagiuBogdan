import java.util.Scanner;

public class ConsoleMenu {
    LoginService loginService= new LoginService();

    public void displayConsoleMenu() { System.out.println( "Program menu: \n" );
        System.out.println( "0  Exit" );
        System.out.println( "1  Login" );
        System.out.println( "2  Logout" );


        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            System.out.println( "Select menu option: " );
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                   loginService.login();
                    break;
                case 2:
                    loginService.logOut();
                    break;

            }

        } while (option != 0);

    }

}

