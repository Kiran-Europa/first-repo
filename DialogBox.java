import javax.swing.*;

class Main {
    public static void main(String[] args) {
        int mark1;
        int mark2;
        int assignmentMark;
        int ExamMark;
        double DpMark;
        double FinalMark;
        String FavoriteSoccerTeam;
        String FavoriteColor;
        
        mark1=Integer.parseInt(JOptionPane.showInputDialog(null, "Input mark1"));
        JOptionPane.showMessageDialog( null,mark1);
        mark2=Integer.parseInt(JOptionPane.showInputDialog(null, "Input mark2"));
        JOptionPane.showMessageDialog( null,mark2);
        assignmentMark=Integer.parseInt(JOptionPane.showInputDialog(null, "Input assignment mark"));
        JOptionPane.showMessageDialog( null,assignmentMark);
        ExamMark=Integer.parseInt(JOptionPane.showInputDialog(null,"Input Exam mark"));
        JOptionPane.showMessageDialog( null,ExamMark);

        DpMark=(double) (mark1+mark2+assignmentMark)/3;
        JOptionPane.showMessageDialog( null, "DpMark="+DpMark);
        FinalMark= ((DpMark*0.4) + (ExamMark*0.6));
        JOptionPane.showMessageDialog( null, "FinalMark="+FinalMark);

        FavoriteSoccerTeam = JOptionPane.showInputDialog( null,"Who is your favorite soccer team?");
        JOptionPane.showMessageDialog( null, "Your favorite soccer team is "+FavoriteSoccerTeam);
        FavoriteColor = JOptionPane.showInputDialog( null,"What is your favorite color? ");
        JOptionPane.showMessageDialog( null,"Your favorite color is "+FavoriteColor);

    }
}
