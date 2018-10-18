/*Задача 3:
Найдите площадь овального кольца, полученного из овала площадью 15 дм2 вырезанием овала площадью 600 см2.
*/
package JavaJunior;
public class Main {

    public static void main(String[] args) {
        int squareEllipse = 15;
        int squareEllipseSmal = 6;
        int squareRing = squareEllipse - squareEllipseSmal;
        System.out.println("Площадь овального кольца, полученного из овала площадью \n " +
                "15 дм2 вырезанием овала площадью 600 см2 = " + squareRing + " дм2 или \n" +
                squareRing * 100 + "см2");
    }
}
