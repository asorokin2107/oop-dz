import java.util.Scanner;

public class Maintwo {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        metod();

    }

    public static void metod() {
        Scanner scanner = new Scanner(System.in);
        int a = 2;
        System.out.println("Введите число: ");
        int first = new Scanner(System.in).nextInt();


        if ((first % 2)==0) {
            System.out.println("Четное: " + first);
        } else {
            if ((first % 1) == 0) {
                System.out.println("Нечетное: " + first);
            }
        }
    }
}
