//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        inputNumber();
    }

    public static void inputNumber(){
        float number = 0;
        boolean check = true;
        Scanner scan;
        while (check){
            try{
                scan = new Scanner(System.in);
                System.out.printf("Enter: ");
                number = scan.nextFloat();
                check = false;
            }catch (Exception e){
                System.out.println("Enter float!!!");
            }
        }
        System.out.println("Your number: " + number);
    }

}