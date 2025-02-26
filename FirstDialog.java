import javax.swing.JOptionPane;
import java.util.Scanner;

public class FirstDialog{
           public static void main(String[] args) {
               JOptionPane.showMessageDialog(null, "First Java Dialog");
               Scanner scanner= new Scanner(System.in);
                String Name;
                String Surname;
                String StudentNumber;
                String Email;
                System.out.println("Enter a name");
                Name=scanner.nextLine();

                System.out.println("Enter a surname");
                Surname=scanner.nextLine();

                System.out.println("Enter a StudentNumber");
                StudentNumber=scanner.nextLine();

                System.out.println("Enter a Email");
                Email=scanner.nextLine();

                System.out.println("Your name is" + Name + "!");
                System.out.println("Your name is" + Surname + "!");
                System.out.println("Your name is" + StudentNumber + "!");
                System.out.println("Your name is" + Email + "!");
           }
    }