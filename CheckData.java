package HW2;



import java.util.regex.Pattern;

public class CheckData {
    public static void checkData (String []data){
        checkLength(data);
        checkDOB(data[3]);
        checkTel(data[4]);
        checkSex(data [5]);

    }
    public static void checkLength (String data[]){
        int l = data.length;
        if (l< Config.getArrLength())throw new LackOfDataException("Вы ввели недостаточное количество данных");
        if (l> Config.getArrLength())throw new IndexOutOfBoundsException("Вы ввели лишние данные");
    }
    public static void checkDOB(String dob){

//        try {
//           new Person().setdB(Config.getDateFormate().parse(dob));
//        } catch (ParseException e) {
//            System.out.println("Неправильный формат даты");
//            e.printStackTrace();
//        }
        String temp[] = dob.split(Pattern.quote("."));
        if (!(temp.length==3) ||!(temp[0].length()==2) ||(!(temp[1].length()==2)||(!(temp[2].length()==4)))) throw new RuntimeException("Неправильный формат даты");
        int day = 0; int month = 0; int year =0;
        try {
           day = Integer.parseInt(temp[0]);
           month = Integer.parseInt(temp[1]);
           year = Integer.parseInt(temp[2]);
        }
        catch (NumberFormatException nfe){
            System.out.println("Неправильный формат даты");
            nfe.printStackTrace();
        }
        if ((day<=0)||(day>31)) throw new RuntimeException("Такой даты не может быть");
        if ((month<=0)||(month>12)) throw new RuntimeException("Такого месяца нет");
    }
    public static void checkTel (String tel){
        int num =0;
        try {
             num = Integer.parseInt(tel);
        }
        catch (NumberFormatException nfe){
            System.out.println("Вы ввели неправильный номер телефона. Он должен состоять только из цифр");
            nfe.printStackTrace();
        }
        if (num<0) throw new RuntimeException("Телефонный номер должен быть беззнаковый");
    }
    public static  void checkSex(String s){
        if( (!s.equals("f"))&& (!s.equals("m")))throw new RuntimeException("Для выбора пола нужно было ввести f или m");
    }

}
