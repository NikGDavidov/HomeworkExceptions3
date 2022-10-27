package HW2;

import java.io.FileWriter;
import java.io.IOException;


public class DataSave {

    public static void save( String data){

        String fileName =data.substring(0,data.indexOf(" "));
        try( FileWriter fw = new FileWriter(fileName, true)){
            fw.write(data);
            fw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveWithWrapper(String data []){

        StringBuilder sb = new StringBuilder();
        for (String s:data){
            sb.append('<');
            sb.append(s);
            sb.append('>');
            sb.append(' ');
        }

        String fileName =data[0];
        try( FileWriter fw = new FileWriter(fileName, true)){
            fw.write(sb.toString());
            fw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
