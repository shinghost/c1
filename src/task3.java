import java.util.*;

public class task3 {
    public static void main(String[] args) {
        System.out.print("Enter int numbers and 0 at the end: ");
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        int sum = 0;
        while ((nums = sc.nextInt()) != 0) {
            sum += nums;
        }
        System.out.println(String.format("Sum =  %d", sum));
    }
}