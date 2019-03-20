
import java.io.*;
import java.util.Scanner;

public class LoginService {


    public void login() {
        String userInput;
        FileReader reader;

        try {
            reader = new FileReader("D:\\pentastagiu\\outputfile.txt");
            BufferedReader br = new BufferedReader(reader);
            Scanner scanner = new Scanner(System.in);

            String[] split;

            while ((userInput = br.readLine()) != null) {
                split = userInput.split("\\s");

                boolean done = false;
                while (done==false) {
                    split = userInput.split("\\s");
                    System.out.println("Please enter your username to login: ");
                    String userName = scanner.nextLine();

                    System.out.println("Please enter your password: ");
                    String userPassword = scanner.nextLine();
                    if (userName.equals(split[0]) && userPassword.equals(split[1])) {
                        System.out.println("Username found.");
                        System.out.println("Welcome " + userName);
                        done = true;
                        break;
                    } else {
                        System.out.println("Invalid Username/Password. Please try again");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logOut() {


    }
}