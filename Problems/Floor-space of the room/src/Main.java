import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String ch = sc.nextLine();
        double a;
        double b;
        double c;
        double S;
        switch (ch) {
            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double p = 0.5 * (a + b + c);
                S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println(S);
                break;
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                S = a * b;
                System.out.println(S);
                break;
            case "circle":
                double r = sc.nextDouble();
                S = 3.14 * Math.pow(r, 2);
                System.out.println(S);
                break;
            default:
                System.out.println("Error");
        }
    }
}