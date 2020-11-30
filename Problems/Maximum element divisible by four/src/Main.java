import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] value = new int[n];
        int max;
        for (int i = 0; i < n; i++) {
            value[i] = scanner.nextInt();
        }
        max = -123123123;
        for (int i = 0; i < n; i++) {
            if(value[i] % 4 == 0) {
                if(value[i] > max)
                    max = value[i];
            }
        }
        System.out.println(max);
    }
}