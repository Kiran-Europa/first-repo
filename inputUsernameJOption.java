import javax.swing.*;
public class inputUsernameJOption {
    public static void main(String[] args) {
        String Username;
        String Password;
        String Name;
        String Surname;

        
       Username = JOptionPane.showInputDialog( null, "Please enter a username");
       JOptionPane.showMessageDialog( null, "Your username is "+Username);

       Password = JOptionPane.showInputDialog( null, "Please enter a password");
       JOptionPane.showMessageDialog( null, "Your password is "+Password);

        Name = JOptionPane.showInputDialog( null, "Please enter a name");
        JOptionPane.showMessageDialog( null, "Your name is "+Name);

        Surname = JOptionPane.showInputDialog( null, "Please enter a surname");
        JOptionPane.showMessageDialog( null, "Your surname is "+Surname);

        if (Username.contains("_") && Username.length()==5) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");

        }
    }}