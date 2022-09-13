public class Main {
    public static void main(String[] args) {

//        Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»

        System.out.println(replace("саша", 'с', 'м'));

    }

    public static String replace(String str, char oldChar, char newChar) {
        String resStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                resStr += newChar;
            } else {
                resStr += str.charAt(i);
            }
        }
        return resStr;
    }
}

