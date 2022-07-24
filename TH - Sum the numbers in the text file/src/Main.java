
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

//        File file = new File("text");
//        file.mkdir();


        FileWriter fileWriter = new FileWriter("number.txt");
        fileWriter.write("5"+"5\n"+"5\n"+"5\n");
        fileWriter.close();
//
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);

    }
}
