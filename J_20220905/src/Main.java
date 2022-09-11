//Дано целое число num. Необходимо написать программу, которая выводит на экран таблицу умножения num  до 10. Например, если num=3 то вывод должен быть таким:
//        3*1=3
//        3*2=6
//        3*3=9
//        -----
//        3*9=27
//        3*10=30

public class Main {

    public static void main(String[] args) {

        int num=3;
        int mult=1;
        while (mult<=10){
            System.out.printf("%d * %2d = %d%n", num, mult, num*mult);
            mult+=1;

        }

//Дано целое число num. Необходимо написать программу, которая считает, сколько разрядов в этом числе. Например:
//           	3 -> 1
//           	343 -> 3
//           	98761 -> 5
System.out.println("__________________________________________________");

//        int num1=23;
//        int dig=1;
//        int div=10;
//
//        if (num1 / div < 1){
//            System.out.println(num1 + " -> " + (dig));
//        } else {
//
//            while (num1 / div >= 1) {
//
//                div = div * 10;
//                dig = dig + 1;
//            }
//            System.out.println(num1 + " -> " + (dig-1));
//        }


        String str="Hello world!";
        System.out.println(str);
        System.out.println(str.length()); //длина строки 11
        System.out.println(str.toLowerCase());
        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(str.charAt(1));

//        печатаем строку в столбец
int index=str.length()-1; // 0 ...<str.length()
while (index>=0){
    System.out.print(str.charAt(index));
index-=1;
        }

System.out.println();
System.out.println("----------------------------");

String str3="";
index=str.length()-1;
while (index>=0){
    str3+=str.charAt(index);
    index-=1;
}
System.out.println(str3);

System.out.println("----------------------------");

//fghf hjk hjk kl;
        String strWithoutSpace="";
        index=0;
        while (index<str.length()){
            char ch=str.charAt(index);
if (ch!=' ') {
    strWithoutSpace += ch;
}
            index+=1;
        }
        System.out.println(strWithoutSpace);
    }
}