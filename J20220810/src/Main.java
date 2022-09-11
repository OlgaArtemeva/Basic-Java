/*
Написать программу, которая выводит на экран фразу: “ The area of a rectangle with sides 21 and 17 is ….” Вместо многоточия программа должна сосчитать площадь прямоугольника и вывести число.
 */
// комментарий

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int side1 = 21;
        int side2 = 17;

        System.out.println("Side 1 is " + side1);
        System.out.println("Side 22 is " + side2);

        System.out.println("The area of a rectangle with sides " + side1 + " and " + side2 + " is " + (21 * 17) + ".");
 //--------------------------------------------------------------
        System.out.println("---------------------");
        double usd = 100.0;
 double rateUsdToEuro= 0.98;

 double euro = usd*rateUsdToEuro;
        System.out.println("USD: " + usd);
        System.out.println("rate: " + rateUsdToEuro);
        System.out.println("EURO: " + euro);


    }
}