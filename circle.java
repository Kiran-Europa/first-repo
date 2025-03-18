import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name;
        String Surname;
        String StudentNumber;
        String Email;
        short mark1;
        short mark2;
        short AssignmentMark;
        short ExamMark;
        double DpMark;


        System.out.println("Enter a name");
        Name = scanner.nextLine();

        System.out.println("Enter a surname");
        Surname = scanner.nextLine();

        System.out.println("Enter a StudentNumber");
        StudentNumber = scanner.nextLine();

        System.out.println("Enter a Email");
        Email = scanner.nextLine();

        System.out.println("Enter mark1");
        mark1 = scanner.nextShort();

        System.out.println("Enter mark2");
        mark2 = scanner.nextShort();

        System.out.println("Enter AssignmentMark");
        AssignmentMark = scanner.nextShort();

        System.out.println("Enter ExamMark");
        ExamMark = scanner.nextShort();

        DpMark = (mark1+mark2+AssignmentMark)/3;
        System.out.println("DpMark= " +DpMark);


        double FinalMark = CalculateFinalMark(DpMark, ExamMark);
        System.out.println("Final Mark=" +FinalMark);
        if (FinalMark>=0 & FinalMark<=46)
        {
            System.out.println("You have failed");
        }
        else if (FinalMark>=47 & FinalMark<=49)
        {
            System.out.println("You have a supplementary exam");
        }
        else if (FinalMark>=50 & FinalMark<=74)
        {
            System.out.println("You have passed");
        }
        else if (FinalMark>=75 & FinalMark<=100)
        {
            System.out.println("You have passed with a distinction");
        }
        else if (FinalMark<=101);
        {
            System.out.println("Your marks exceed the maximum");
        }



    }
    public static double CalculateDpMark(short mark1, short mark2, short AssignmentMark) {
        return ((double) (mark1 + mark2 + AssignmentMark) / 3); }

    public static double CalculateFinalMark(double DpMark, short ExamMark)
    {
        return ((DpMark*0.4)+(ExamMark*0.6));


    }
}