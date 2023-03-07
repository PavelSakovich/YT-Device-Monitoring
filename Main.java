import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.*;
import java.util.stream.Stream;
import java.util.function.*;
//"[\\p{Punct}\r\n]"

public  class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in,  StandardCharsets.UTF_8 );
 String d = scanner.nextLine();
        System.out.println(d);

    }



    public static void otel(int hight, int flat, int randomNumber) {
         ArrayList <Integer> list1 = new ArrayList <> ();
         int count = 101;
         while ( count<=hight * 100 + 1){
              int iterator = (int) Stream.iterate(count, s -> s + 1).limit(flat). peek(s-> list1.add(s)).count();
              count+=100;
        }
         int sds = (int) list1.stream().map (n -> {
            int f = 0;
             String a = String.valueOf(n);
             String [] stringNumber = a.split("");
             for (String g: stringNumber){
                 f = Integer.parseInt(g);
             }

        return f;
         }). filter ( s -> s == randomNumber).count();
        System.out.println("Список комнат: " + list1);
        System.out.println("всего комнат: " + list1.size());
        System.out.println( "Количество цифр " +  randomNumber  + " будет равно: " + sds );
    }
}

//    Если кому интересно предлагаю доп задачку про Отель. Условия: Пользователю предлагается ввести с клавиатуры:
//        1 Количество этажей (от 1 до 9)
//        2 Количество комнат на этаже (от 1 до 99)
//        3 Любую цифру "X" (от 0 до 9)
//
//        Комнаты в отеле нумеруются по принципу  №Этажа и №Комнаты  (к примеру первая комната на первом этаже 101, первая комната на втором этаже 201, двенадцатая комната на третьем этаже 312 и т.д.). На каждом этаже одинаковое количество комнат. Необходимо посчитать какое общее количество цифр "X" находится во всех комнатах (если ищем цифру 2 то в комнате 222 она считается как три раза).
//        Пример:
//        Введите количество этажей: 3
//        Введите количество комнат: 5
//        Введите цифру: 2
//        Ответ:
//        Список комнат: [101, 102, 103, 104, 105, 201, 202, 203, 204, 205, 301, 302, 303, 304, 305]
//        Всего комнат: 15
//        Количество цифр '2': 8
//
//        ну и для проверки количество этажей: 5 количество комнат: 35 искомая цифра:2
//        правильный ответ количество цифр '2': 105
//        Предлагаю решить с помощью потока, ну или у кого может быть элегантнее получится.