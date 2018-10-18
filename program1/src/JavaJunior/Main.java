/*
        Задача 1:
Задайте высоту, длину и ширину прямоугольного параллелепипеда и найти его площадь.
Узнайте, что больше: ширина или высота и выведите информацию об этом в консоль.
        */

package JavaJunior;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите высоту прямоугольного параллелепипеда");
        int height = scanner.nextInt();
        System.out.println("Введите длину прямоугольного параллелепипеда");
        int width = scanner.nextInt();
        System.out.println("Введите ширину прямоугольного параллелепипеда");
        int leight = scanner.nextInt();

        int square;
        square = 2 * (height + leight + width);
        System.out.println("Площадь прямоугольного параллелепипеда = " + square);

        if (leight > height) {
            System.out.println("В прямоугольном параллелепипеде ширина больше высоты");
        } else if (leight < height){
            System.out.println("В прямоугольном параллелепипеде высота больше ширины");
        } else if (leight == height){
            System.out.println("В прямоугольном параллелепипеде высота равна ширины");
        }
    }
}
