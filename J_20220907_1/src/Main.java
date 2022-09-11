public class Main {
    public static void main(String[] args) {


        for (int i=0; i<3;i=i+1) {
            System.out.println(i);
        }

       String str= "Java is the best!";

        for (int i=0; i<str.length();i+=1){
            System.out.println(str.charAt(i));
        }
        System.out.println("-----------------------------------");

        for (int i=str.length()-1; i>=0 ; i-=1){
            System.out.println(str.charAt(i));
        }
        System.out.println("-----------------------------------");

        for (int i=0; i<str.length();i+=2){
            System.out.println(str.charAt(i));
        }
        System.out.println("-----------------------------------");
    }

}