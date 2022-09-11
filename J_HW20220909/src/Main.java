public class Main {
    public static void main(String[] args) {


        printNum(5);
        int a=sumNum(5);
        System.out.println(a);

        }

    //    C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
    public static void printNum(int n) {
        for (int num=1; num <= n; num+=1) {
            System.out.println(num);
        }

    }

//    C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
    public static int sumNum(int n) {
        int sum=0;
        for (int num=1; num <= n; num+=1){
            sum=sum+num;
        }
        return sum;
    }

}