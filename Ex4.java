//Разработайте программу,которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        inputString();
    }

    public static void inputString(){
        String str = null;
        boolean check = true;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.printf("Enter: ");
            str = scan.nextLine();
            if (!str.equals("")){
                check = false;
            }else {
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            System.out.println("Строка пуста!!!");
        }catch (Exception e){
            System.out.println("Enter string!!!");
        }
    }

}