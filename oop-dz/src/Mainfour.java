import java.util.Scanner;

public class Mainfour {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        metod();

    }

    public static void metod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = new Scanner(System.in).nextInt();
        System.out.println("Введите чисто с которым хотите сравнить: ");
        int a = new Scanner(System.in).nextInt();

        if (first > a) {
            System.out.println("true");
        } else {
            if (first <= a) {
                System.out.println("false");
            }
        }
    }
}
