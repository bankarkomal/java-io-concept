import java.io.*;
import java.util.stream.IntStream;

// Input-stream and output stream deal with byte. [1 bit or 8bit]
// Read/Write or Input/Output
public class ByteArrayInputOutputStreamExample {
    public static void main(String[] args) {
        try{
            byte[] byteArray = {'H','e','l','l','o','w'};
            InputStream inputStream = new ByteArrayInputStream(byteArray,0,byteArray.length);
            // Read
            OutputStream outputStream = new ByteArrayOutputStream();//Write

            outputStream.write(inputStream.readAllBytes());

            System.out.println(outputStream.toString());

        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
