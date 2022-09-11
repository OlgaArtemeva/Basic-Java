//2022-09-05
//        —----------------------------------------------------------------
//        Дана строка строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:
//        “Java is a very popular language” ->  “Java language”  
// " Java " -> "Java"



public class Main {
    public static void main(String[] args) {
        String str="   Java is a very popular language  ";
        String firstWord="";
        String lastWord="";
        int i=0;

        char ch=str.charAt(i);

        while(ch==' '){
            i+=1;
            ch=str.charAt(i);
        }

//        get first word

        while (i<str.length() && ch!=' '){
            firstWord+=ch;
            i+=1;
//            if (i<str.length()){
            ch=str.charAt(i);
//        } else {
//            ch=' ';
//            break;
//            }
        }
        System.out.println(firstWord);

        i=str.length()-1;
        ch=str.charAt(i);
        while (ch==' '){
            i-=1;
                ch=str.charAt(i);
            ch=str.charAt(i);
        }
//        get last word


        while (ch!=' ') {
            lastWord=ch + lastWord;
            i-=1;
            ch=str.charAt(i);
        }
        System.out.println(lastWord);

    }
}