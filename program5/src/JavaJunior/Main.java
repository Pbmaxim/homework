/*Задача 5:
Задать размер ипотечного кредита , процентную ставку , кол-во лет .
Найти переплату по кредиту, значение переплаты вывести в консоль.
*/
package JavaJunior;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер ипотечного кредита");
        int credit = scanner.nextInt();
        System.out.println("Введите процентную ставку в %");
        double percent = (scanner.nextDouble() / 100);
        System.out.println("Введите количество лет, на которое взят кредит");
        int time = scanner.nextInt();

        double result = credit;

        for (int i= 1; i <= time; i++){
            result = result * (1 + percent);
        }


        System.out.println("Переплата составила: " + (result - credit));
    }
}
