import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CoppyFileExample {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập file muốn copy: ");
        File file1 = new File(input.nextLine());

        System.out.println("Nhập file đích đến: ");
        File file2 = new File(input.nextLine());
//        System.out.println(file2.toString());

 0
        try {
            if (!file1.exists()){
                throw new FileNotFoundException();
            }
            if (!file2.exists()) {
                throw new FileNotFoundException();
            }
            if (file2.exists()) {
                throw new FileAlreadyExistsException(file2.toString());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");
        }
        catch (FileAlreadyExistsException e) {
            System.out.println("File đã tồn tại!");
        }

        FileReader fileReader = new FileReader(file1);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line = "";

        int sum = 0;
        while ((line = reader.readLine()) != null){
//            System.out.println(line);
            writer.write("\n");
            writer.write(line);
            sum += line.length();
        }
        writer.close();
        System.out.println("Sao chép thành công !!! ");
        System.out.println("Kí tự đã sao chép: "+sum);

    }
}
