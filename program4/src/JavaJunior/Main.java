/*Вывести в консоль ближайшее к 10 из двух чисел, записанных в переменные m и n.
Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
Метод Math.abs(n) возвращает абсолютное значение числа (модуль числа).
*/
package JavaJunior;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mainNumber = 10.0;

        System.out.println("Введите первое число, которое будет сравниваться с 10");
        double m = scanner.nextDouble();
        System.out.println("Введите второе число, которое будет сравниваться с 10");
        double n = scanner.nextDouble();

        if (n == m){
            System.out.println("Введеные числа равны");
        }


        if ( (m < 0) && (n < 0) ){
            if (m > n){
                System.out.println("Ближайшее к 10 число = " + m);
            } else {
                System.out.println("Ближайшее к 10 число = " + n);
            }
        }


        if ( (m > 0) && (n <= 0) ){
            System.out.println("Ближайшее к 10 число = " + m);
        }

        if ( (n > 0) && (m <= 0) ){
            System.out.println("Ближайшее к 10 число = " + n);
        }

        if ( (m > 0) && (n > 0) ){
            m = 10 - m;
            n = 10 - n;

            m = Math.abs(m);
            n = Math.abs(n);

            if (m < n){
                System.out.println("Ближайшее к 10 число = " + m);
            } else {
                System.out.println("Ближайшее к 10 число = " + n);
            }
        }
    }
}
