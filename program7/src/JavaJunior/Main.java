/*Задача 7:
Создать программу, выводящую в консоль наибольшую цифру любого трехзначного натурального числа.
Примеры работы программы:
В числе 208 наибольшая цифра 8
В числе 774 наибольшая цифра 7
В числе 613 наибольшая цифра 6
*/
package JavaJunior;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое трехзначное натуральное число");
        int number = scanner.nextInt();
        int numberInRes = number;
        int max = 0;

        while (number > 0) {
            if (number % 10 > max) {
                max = (number % 10);
            }
            number = (int)number / 10;
        }

        System.out.println("В числе " + numberInRes + " наибольшая цифра = " + max);
    }
}
