import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 0 или 1: ");
        int clientOS = in.nextInt();
        in.close();
        boolean isOSAndroid = clientOS == 1;
        if (isOSAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
}