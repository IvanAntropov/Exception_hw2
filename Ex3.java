//Дан следующий код, исправьте его там, где требуется

import java.io.FileNotFoundException;

public class Ex3 {

// было

//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }


//стало

    // если мы хотим пробросить вверх Exception, то убираем catch оставляя throws
    public static void main(String[] args){
        int a; // Я бы сначала инициировал, потом проводил действия
        int b;
        int[] abc;
        try {
            a = 90; // значения можно присваивать и сразу проверять catchами
            b = 3;
            abc = new int[]{ 1, 2 };
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9; //тут статичное число, всегда будет Exception, можно либо заставить пользователь вводить, а так я не знаю для чего этот arr
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (FileNotFoundException ex)// если надо словить именно этот Exception
        {
            System.out.println("Файл не найден");
        }
        catch (Throwable ex) // здесь ловим проброснутые Exception и в последнюю очередь, чтоб не мешать остальным catchам
        {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}