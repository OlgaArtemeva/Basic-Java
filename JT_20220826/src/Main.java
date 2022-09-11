public class Main {
    public static void main(String[] args) {

        // Вася спит днем, если он не работает или у него отпуск.
        // Переменная weekday=true если это рабочий день, переменная vacation=true, если у него отпуск.
        //Написать программу, выводящую на экран true, если Вася спит
        //weekday vacation rezalt
        //false   false -> true
        //true    false -> false
        //false   true  -> true

        boolean weekday = false;
        boolean vacation = true;
        boolean rez= !weekday || vacation;
if (rez){
            System.out.println(rez);
        }


//--------------------------------------------------------//
// 2.Воспитательница в детском саду знала, что если Вася и Петя оба смеются или оба очень серьезные,
// то они что-то затевают и надо быть внимательной. Помогите воспитательнтце и напишите выражение,
// дающее true  когда оба смеются или оба мрачные
// petyaSmile   vasyaSmile
//  true         true   ->  true
//  false        false  ->  true
//  true          false  -> false
//  false         true  -> false
//Можно пешить тремя способами

        boolean petyaSmile = true;
        boolean vasyaSmile = true;

        // три метода
      rez = (petyaSmile && vasyaSmile) || (!petyaSmile && !vasyaSmile);
        boolean rez2 = petyaSmile==vasyaSmile;
        boolean rez3 = !(petyaSmile^vasyaSmile);

//        if (rez) {
            System.out.println(rez);
        System.out.println(rez2);
        System.out.println(rez3);

//        }



//---------------------------------------------------------//
        //3. Напишите прграмму, возвращающую сумму двух целых чисел. А в случае если эти числа равны,
        // возвращающую двойную сумму
        // 1+2 -> 3
        // 5+5 -> 20

        int a=2;
        int b=2;

        int sum = a+b;

        if (a==b)
            sum = sum*2;
        System.out.println(sum);


//---------------------------------------------------------//
//4. Вася рано встает на работу и поэтому рано ложится спать. Сосед Васи любит  громко петь
// У Васи проблемы, если сосед слушает музыку и еще нет семи утра или уже позже 20 часов.
// Напишите выражение дающее true если у Васи проблемы.Singing = true когда сосед поет,
// int hour -  время в диапазоне 0 до 23 часов
// singing  hour
//   true    6 -> true
//   true    7 -> false
//   false   5 -> false
    }
}