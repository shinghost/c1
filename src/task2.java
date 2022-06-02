public class task2 {
    public static int sum(int a, int b){
        if (a == 0){
            return b;
        }else {
            return sum(a-1, b+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 6));
    }
}
