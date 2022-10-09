import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        metod();

    }

    public static void metod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int second = new Scanner(System.in).nextInt();

        if (first > second) {
            System.out.println("Наименьшее число: " + second);
        }
        if (second > first) {
            System.out.println("Наименьшее число: " + first);
        }
    }



}
