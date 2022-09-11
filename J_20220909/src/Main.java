public class Main {
    public static void main(String[] args) {

//        First level: С использованием цикла while yаписать метод, печатающий куб числа от 0 до данного чисда n.
//        Пример: на входе n=3  на выходе 0,1,8,27

        coutCube(3, 0, "Count finisch");
        coutCube(2, 0, "finisch");

        System.out.print(countSum(1, 2));


//        int n=3;
//        int i=0;
//        while (i<=n) {
//            System.out.println("Numer is " +i+ " and cube of " +i+ " is: " +(i*i*i));
//            i+=1;
//        }
//        System.out.println("-----------------------------");


//        С использованием цикла while yаписать метод, печатающий результат  умножения данного числа n  на все целые числа от 0 до n..
//        Пример: на входе n=3  на выходе 0,3,6,9
//        i = 0;
//        int mult = n;
//        while (i <= n) {
//            System.out.println(mult * i);
//            i += 1;
//        }
    }

    public static void coutCube(int n, int i, String abc) {
//        int n = 3;
//        int i = 0;
        while (i <= n) {
            System.out.println("Numer is " + i + " and cube of " + i + " is: " + (i * i * i));
            i += 1;
        }
        System.out.println(abc);

    }

    public static int countSum(int begin, int end) {
        int sum=0;
        while (begin<=end){
            sum=sum+begin;
            begin=begin+1;
        }
        return sum;
    }

}