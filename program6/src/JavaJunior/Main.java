/*Задача 6:
В три переменные a, b и c записаны три вещественных числа. Создать программу,
которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
либо сообщать, что корней нет.
*/
package JavaJunior;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, x, x1, x2, D;


        System.out.println("Введите число a в уравнении ax²+bx+c=0");
        a = scanner.nextDouble();
        System.out.println("Введите число b в уравнении ax²+bx+c=0");
        b = scanner.nextDouble();
        System.out.println("Введите число c в уравнении ax²+bx+c=0");
        c = scanner.nextDouble();

        D = b*b - 4*a*c;

        if (D < 0) {
            System.out.println("Уравнение не имеет корней");
        }

        if (D == 0) {
            x = (-1*b / 2*a);
            System.out.println("Уравнение имеет один корень: " + x);
        }



        if (D > 0) {
            x1 = ( ( (-1*b) - Math.sqrt(D) ) / 2*a );
            x2 = ( ( (-1*b) + Math.sqrt(D) ) / 2*a );

            System.out.println("Корни уравнения:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        }

    }
}
