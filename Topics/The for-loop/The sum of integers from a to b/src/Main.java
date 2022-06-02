import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int sum = 0;
        for (int i = numberA; i <= numberB; i++) {
            sum += i;
        }
        System.out.println(sum);
        // start coding here
    }
}
