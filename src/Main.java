import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("введите трёх значное число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new StringBuffer(String.valueOf(n)).reverse());

    }
}
