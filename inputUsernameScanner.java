import java.util.Scanner;
public class inputUsernameScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Username;
        String Password;
        String Name;
        String Surname;

        System.out.println("Enter a username");
        Username = scanner.nextLine();
        System.out.println("Your username is " +Username);

        System.out.println("Enter a Password");
        Password = scanner.nextLine();
        System.out.println("Your password is " +Password);

        System.out.println("Enter your name");
        Name = scanner.nextLine();
        System.out.println("Your name is " +Name);

        System.out.println("Enter your surname");
        Surname = scanner.nextLine();
        System.out.println("Your surname is " +Surname);

        if (Username.contains("_") && Username.length()==5) {
            System.out.println("Username successfully captured");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");

        }
    }}