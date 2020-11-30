import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int result = 0;
        var scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = a; i <= b; i++) {
            result += i;
        }
        System.out.println(result);
    }
}