// Если необходимо, исправьте данный код

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ex2myCode();
    }
//    public static void ex2HWCode(){
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//    }

    public static void ex2myCode(){
        double catchedRes1 = 0;
        Scanner scan;
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int d = 0;
        int index = 0;
        try {
            scan = new Scanner(System.in);
            d = scan.nextInt(); // статичный => всегда exception
            index = scan.nextInt();
            catchedRes1 = (double) intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("На ноль не дели!:  " + e.getMessage());
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Что-то не так: " + e.getMessage());
        }
    }

}