public class Main {
    public static void main(String[] args) {

        int counter=5;
        while (counter>0) {
            System.out.printf("Hello world! ( %d )%n",counter);
            counter=counter-1;
        }
        System.out.println(counter);
        System.out.println("------ done ------");

        /*----------------------------------------------------------------*/

        int a=10;
        int b=50;

        while (a<b) {
            if( a%2!==0 ) {
                System.out.println(a);
            }
                a = a + 1;

        }

        System.out.println("------ done ------");




    }
}