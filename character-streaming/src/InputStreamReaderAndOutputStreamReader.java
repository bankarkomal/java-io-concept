import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Two type of stream
 * 1 Byte Stream -> read byte and write byte (1B)
 * 2 Character stream-> read character and write char (2B)
 * Input and Output stream -> Byte streaming.
 * Read and Write -> character streaming.
 * An InputStream reader is a bridge from byte stream to character stream;
 * It reads byte and decodes them into character using a specified charset.
 * the charset that it uses may be specified by name or may be given explicitly,
 * or the default charset must be used.
 */
/*
InputStreamReader and OutputStreamWriter
 */


public class InputStreamReaderAndOutputStreamReader {
    public static void main(String[] args) {


        try ( //fileInputStream
              FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Input.txt");
              //InputStreamReader will read from fileInputStream
              InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);) {
            //char that will hold chars from inputStreamReader
            char[] charsFromInputFile = new char[100];
            inputStreamReader.read(charsFromInputFile);

            System.out.println(charsFromInputFile);//print char array to console
            try (  //fileOutputStream
                   FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Output.txt");
                   //OutputStreamWriter will write into output.txt using fileOutputStream byte by byte
                   OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream
                           , StandardCharsets.UTF_8);
            ) {
                outputStreamWriter.write(charsFromInputFile);
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

    }
}


