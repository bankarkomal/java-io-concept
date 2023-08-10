import java.io.*;
import java.util.stream.IntStream;

// Input-stream and output stream deal with byte. [1 bit or 8bit]
// Read/Write or Input/Output
//InputStream - Consider this as pipe of input data
//OutputStream - Consider this as pipe of output data

/**
 * ByteArrayInputStream - this is an implementation of InputStream abstract class.
 * This class is used to read byte array.
 * ByteArrayOutputStream - this is an implementation of OutputStream abstract class.
 * This class is used to write array read from input stream
 */
public class ByteArrayInputOutputStreamExample {
    public static void main(String[] args) {
        try{
            byte[] byteArray = {'H','e','l','l','o'};

            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray,0,byteArray.length);//Read
            ByteArrayInputStream inputStream1 = new ByteArrayInputStream(byteArray,0,byteArray.length);//Read


            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();//Write
            ByteArrayOutputStream outputStream1= new ByteArrayOutputStream();

//            System.out.println("inputStream.readAllBytes() = "+ Arrays.toString(inputStream.readAllBytes()));
            outputStream.write(inputStream.readAllBytes());

            byte[] bytesFromOutputStream = outputStream.toByteArray();

            System.out.println("outputStream.toString()="+ new String(bytesFromOutputStream, "UTF-8"));

        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

}