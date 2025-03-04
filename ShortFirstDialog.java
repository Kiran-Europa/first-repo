import java.util.Scanner;

public class ShortFirstDialog{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String Name;
        String Surname;
        String StudentNumber;
        String Email;
        short mark1;
        short mark2;
        short AssignmentMark;
        short ExamMark;
        double DpMark;
        double FinalMark;

        System.out.println("Enter a name");
        Name=scanner.nextLine();

        System.out.println("Enter a surname");
        Surname=scanner.nextLine();

        System.out.println("Enter a StudentNumber");
        StudentNumber=scanner.nextLine();

        System.out.println("Enter a Email");
        Email=scanner.nextLine();

        System.out.println("Enter mark1");
        mark1= (short)Integer.parseInt(scanner.nextLine());
        System.out.println("Enter mark2");
        mark2= (short)Integer.parseInt(scanner.nextLine());
        System.out.println("Enter AssignmentMark");
        AssignmentMark= (short)Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ExamMark");
        ExamMark= (short)Integer.parseInt(scanner.nextLine());

        System.out.println("Your name is" + Name + "!");
        System.out.println("Your name is" + Surname + "!");
        System.out.println("Your name is" + StudentNumber + "!");
        System.out.println("Your name is" + Email + "!");

        System.out.println("Your mark1 is " + mark1);
        System.out.println("Your mark2 is " + mark2);
        System.out.println("Your AssignmentMark is " + AssignmentMark);
        System.out.println("Your ExamMark is " + ExamMark);

        DpMark=(double) (mark1+mark2+AssignmentMark)/3;
        System.out.println("DpMark=" + DpMark);
        FinalMark= ((DpMark*0.4) + (ExamMark*0.6));
        System.out.println("Final Mark="+FinalMark);
    }
}