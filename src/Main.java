import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//Задача 6
        int age = 19, salary = 58_000, limit;
        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }
        if (salary >= 50_000 && salary < 80_000) {
            limit *= 1.2;
        } else if (salary >= 80_000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

//Задача 7
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        double maxPay, payment, rate = 0.1;
        String permit = "Одобрено";
        if (age < 23) {
            rate += 0.01;
        } else if (age < 30) {
            rate += 0.005;
        }
        if (salary > 80_000) {
            rate -= 0.007;
        }
        maxPay = salary * 0.5;
        payment = wantedSum * (1 + rate) / 12;
        if (maxPay < payment) {
            permit = "Отказано";
        }
        System.out.println ("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту "  + payment + " рублей. " + permit);
    }
}