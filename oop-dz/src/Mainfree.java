import java.util.Scanner;

public class Mainfree {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        metod();

    }

    public static void metod() {
        Scanner scanner = new Scanner(System.in);
        int a = 2;
        System.out.println("Введите число: ");
        int first = new Scanner(System.in).nextInt();
        System.out.println("Число в квадрате: " + first * first);

    }
}
