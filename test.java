import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("sinir sayisini giriniz: ");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i *= 4) {
            System.out.println(i);
        }
        for (int i = 1; i < number; i *= 5) {
            System.out.println(i);
        }
    }
}
