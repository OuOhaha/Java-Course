import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upper = scanner.nextInt();
        int lower = scanner.nextInt();
        int height = scanner.nextInt();
        int area = (int) Math.round((upper + lower) * height / 2.0f);
        System.out.println(area);
        scanner.close();
    }
}
