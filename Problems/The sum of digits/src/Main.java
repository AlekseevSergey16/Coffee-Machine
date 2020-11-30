import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int v1 = value % 10;
        int v2 = (value % 100) / 10;
        int v3 = value / 100;
        System.out.println(v1 + v2 + v3);
    }
}