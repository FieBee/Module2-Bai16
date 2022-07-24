import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

class ReadFile

{

    public static void main(String[] args) throws IOException {

        // variable declaration

        int ch;

        // check if File exists or not

        File file = new File("text");

        FileReader fr = null;
        try {
            fr = new FileReader("text");

        } catch (FileNotFoundException fe) {

            System.out.println("File not found");

        }

        // read from FileReader till the end of file

        while ((ch = fr.read()) != -1)

            System.out.print((char) ch);

        // close the file

        fr.close();

    }

}