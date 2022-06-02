import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 = ");
        Float x1 = sc.nextFloat();
        System.out.print("Enter x2 = ");
        Float x2 = sc.nextFloat();
        System.out.print("Enter y1 = ");
        Float y1 = sc.nextFloat();
        System.out.print("Enter y2 = ");
        Float y2 = sc.nextFloat();
        Double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println(String.format("Distance = %f", distance));
    }
}
