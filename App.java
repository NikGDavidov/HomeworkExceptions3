package HW2;

import java.util.Scanner;


public class App {
    public static void clickButton(){

        System.out.println("Введите данные через пробел");
        System.out.println("<Фамилия> <Имя> <Отчество> <дата рождения(dd.mm.yyyy)> <номер телефона (812345678)> <пол (f/m)>");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String [] data = str.split(" ");
        CheckData.checkData(data);
        DataSave.saveWithWrapper(data);
    }
}
