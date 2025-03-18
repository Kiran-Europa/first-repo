import javax.swing.*;

public class circleJOP {
    public static void main(String[] args) {
        double Area;
        double pi = 3.14;


        double radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the radius"));
        JOptionPane.showMessageDialog(null, "Radius=" + radius);
        Area = calculateAreaOfCircle(radius, pi);
        JOptionPane.showMessageDialog(null, "Area of Circle= " + Area);
    }
    private static double calculateAreaOfCircle(double radius, double pi) {
    return (pi*(radius*radius));
    }
    }
