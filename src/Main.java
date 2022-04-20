import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Задание 1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите тип ОС на телефоне, 0 или 1: ");
        int clientOS = in.nextInt();
        boolean isOSAndroid = clientOS == 1;
        if (isOSAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2
        System.out.print("Введите год выпуска ОС на телефоне: ");
        int clientDeviceYear = in.nextInt();
        boolean isOldOS = clientDeviceYear < 2015;
        if (isOSAndroid && isOldOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (!isOSAndroid && isOldOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (isOSAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 3
        System.out.print("Введите год: ");
        int year = in.nextInt();
        boolean isYearLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (isYearLeap) {
            System.out.println(year + " год является високосным");
        }   else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        System.out.print("Введите дистанцию до клиента в км: ");
        int deliveryDistance  = in.nextInt();
        int day = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day += 2;
        } else if (deliveryDistance >= 100) {
            day += 3;
        }
        System.out.println("Потребуется дней: " + day);

        //Задание 5
        System.out.print("Введите номер месяца: ");
        int monthNumber  = in.nextInt();
        in.close();
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц (он же январь) принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц (он же февраль) принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц (он же март) принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц (он же апрель) принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц (он же май) принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц (он же июнь) принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц (он же июль) принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц (он же август) принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц (он же сентябрь) принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц (он же октябрь) принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц (он же ноябрь) принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц (он же декабрь) принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}