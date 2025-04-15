import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[][] Numbers = new int [3][3];
        System.out.println("Please enter 9 values");
    for (int i = 0; i<=Numbers.length-1; i++) {
        for (int p = 0; p <= Numbers.length - 1; p++) {
            Numbers[i][p] = scanner.nextInt();
        }
    }

        System.out.println("You entered:");
        for (int i = 0; i < Numbers.length; i++) {
            for (int p = 0; p < Numbers[i].length; p++) {
                System.out.print(Numbers[i][p] + " ");
            }
            System.out.println();
        }
        }
    }
