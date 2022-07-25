import java.io.*;
import java.util.ArrayList;

public class DemoFile {

    public static void main(String[] args) throws IOException {

//        File file = new File("tao.txt");
//        String[] arr = new String[4];
//        arr[0] = "mot";
//        arr[1] = "hai";
//        arr[2] = "ba";
//        arr[3] = "bon";
//
//        OutputStream outputStream = new FileOutputStream(file);
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
//
//        for (String item : arr){
//            outputStreamWriter.write(item);
////            outputStreamWriter.write("\n");
//            outputStreamWriter.flush();
//        }


        File file = new File("demo.txt");

        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);


        String line = "";

        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }


    }
}
