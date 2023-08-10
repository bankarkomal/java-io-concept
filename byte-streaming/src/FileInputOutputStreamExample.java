import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *  File InputStream we read all byte from input file.
 *  File OutputStream will write all bytes read from all FileInputStream into output file.
 */
public class FileInputOutputStreamExample {
    public static void main(String ... args) {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\byte-streaming\\src\\FileInputOutputStreamExample.java\\Input.txt");

            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\byte-streaming\\src\\FileInputOutputStreamExample.java\\Output.txt");
            System.out.println(inputStream.available());

            byte[] bytes = inputStream.readAllBytes();// Read all byte from input file.
            outputStream.write(bytes); // Write all byte to the output file

            System.out.println(outputStream);
            inputStream.close();
            outputStream.close();
        }catch (IOException FileNotfounExcepetion){
            FileNotfounExcepetion.printStackTrace();
        }

    }
}
