import java.util.Scanner;

public class SecondTask {
    public static int sum(int a, int b){
        if (a != 0) {
            return (sum(a -1, b+1));
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt(), sc.nextInt()));
    }
}