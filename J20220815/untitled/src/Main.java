//        Создать новый проект. Написать программу, в которой задано 2 дробных числа. Программа должна выводить на экран результат сложения, вычитания, умножения и деления этих чисел. Например: задано 2 переменных: 10.6 и 2.2  в результате:
//        10.6 + 2.2=12.8
//        10.6 - 2.2=8.4
//        10.6 *2.2=23.32
//        10.6 / 2.2=4.818181


// обманываем компилятор int a = (int)10.6;

//    double num1 = 10.6;
//    double num2 = 2.2;

//  double a = 10.6;
//  double b = 2.2;

//        System.out.println(a + " + " + b + " = " + (a + b));
//       System.out.println(a+ b);

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------");
//        Создать новый проект и написать программу рассчитывающую, на сколько увеличится площадь пиццы, если ее диаметр увеличить на N сантиметров. Подсказка: площадь круга можно вычислить по формуле 3,14RR. Например: Исходная пицца диаметр 10 см (т.е. R1=10/2=5). Диаметр новой пиццы 16 см (т.е. R1=16/2=8). Ответ: 122.46
        int diameter1 = 10;
        int n = 6;
        int diameter2 = n + diameter1;
//        double pi=3.14;
        double PI = Math.PI;

        double radius1 = diameter1 / 2.0;
        double radius2 = diameter2 / 2.0;
        double area1 = radius1 * radius1 * PI;
//        double area2 = radius2 * radius2 * PI;
        double area2 = Math.pow(radius2,2)*Math.PI;
        double diff=Math.abs(area1-area2); // |+-a|=a


        System.out.println("The area of pizza with diameter " + diameter1 + " is " + area1);
        System.out.println("The area of pizza with diameter " + diameter2 + " is " + area2);
        System.out.println("Result: " + diff);

        System.out.println("--------------------");

        int a=10;
        int b=a+5;
        System.out.println("a+b=" + (a+b));
        System.out.println("a+b=" + a+b);

        System.out.println(a+""+b);

    }
}