/*Задача 2:
На садовом участке площадью 10 соток , разбили грядки 15 на 25 метров. Сколько м2 осталось незанято?
*/

// 1 сотка = 10 м * 10 м = 100 м2

package JavaJunior;
public class Main {

    public static void main(String[] args) {

        int area = 1000;
        int radge = 15 * 25;
        int countRadge = 0;

        while (area > radge){
            area = area - radge;
            countRadge++;
        }
        System.out.println("На садовом участке площадью 10 соток, разбили грядки 15 на 25 метров.");
        System.out.println("Количесвто грядок, на которые можно разделить участок = " + countRadge);
        System.out.println("Остаок площади участка после разделения его на грядки = " + area + " м2");
    }
}
