public class Main {
    public static void main(String[] args) {
        String str = "     Java is a very popular language   ";
        String firstWord = "";
        String lastWord = "";
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        // 1. skip last spaces
        for (; (rightIndex >= 0 && str.charAt(rightIndex) == ' '); rightIndex = rightIndex - 1) ;

        // 2. accumulate last word
        for (; (rightIndex >= 0 && str.charAt(rightIndex) != ' '); rightIndex = rightIndex - 1) {
            lastWord = str.charAt(rightIndex) + lastWord;
        }
        // 3. skip leading spaces
        for (; leftIndex < rightIndex && str.charAt(leftIndex) == ' '; ) {
            leftIndex += 1;
        }

        //4. accumulate first word
        for (; leftIndex < rightIndex && str.charAt(leftIndex) != ' '; leftIndex += 1) {
            firstWord += str.charAt(leftIndex);
        }
        if (firstWord != "" && lastWord != "") {
            System.out.println(firstWord + " " + lastWord);
        } else {
            System.out.println(lastWord);
        }
// Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку, которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно) до позиции endIndex (не включительно). Если startIndex «не попадает в строку» или больше endIndex выводим “error”. Если endIndex не «попадает в строку», выводим, начиная со startIndex до конца строки. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().
//“Java is a very popular language”, startIndex=5 endIndex=13 -> “is a ver”
//“Java is a very popular language”, startIndex=5 endIndex=-13 -> error
//“Java is a very popular language”, startIndex=5 endIndex=136 -> “is a very popular language”
        str = "Java is a very popular language";
        int startIndex = 5;
        int endIndex = 136;
        String strRes = "";

// если startIndex=endIndex тоже Error? - должны решить с заказчиком. Например, решили вывести 1 символ.
        if (startIndex < 0 || startIndex >= str.length() || startIndex >= endIndex) {
            System.out.println("Error");
        } else {
//                strRes=str.charAt(startIndex);
            for (int i = startIndex + 1; i < endIndex && i < str.length(); i += 1) {

                strRes += str.charAt(startIndex);
            }
            System.out.println(strRes);
        }

//        Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора). Естественно, использовать циклы.

        int row = 9;
        int col = 9;
        for (int numStr = 1; numStr <= row; numStr += 1) {
            System.out.print("%5d", numStr);

            for (int numCol = 1; numCol <= col; numCol += 1) {

//                                int num = numStr * numCol;
//                                String numCell = " ";
//                                if (num < 10) {
//                                        numCell = numCell + " " + num;
//                                } else {
//                                        numCell = numCell + num;
//                                }
//                                System.out.print(numCell);

                System.out.printf("%5d", numStr);
            }
            System.out.println("");
        }

    }
}