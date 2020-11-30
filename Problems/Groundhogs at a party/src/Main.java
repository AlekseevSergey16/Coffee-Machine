import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean flag = scanner.nextBoolean();
        boolean bool = false;

        if(value >= 10 && value <= 20 && flag == false) {
            bool = true;
        }
        if(value >= 15 && value <= 25 && flag == true) {
            bool = true;
        }
        System.out.println(bool);
    }
}