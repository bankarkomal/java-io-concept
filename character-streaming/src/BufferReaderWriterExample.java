import java.io.*;
import java.util.Arrays;


/**
 * Read text from a character-input stream, buffering character to provide.
 * for the efficient reading of character, arrays and lines.
 * The buffer size may be specified , or the default size may be used .8KB
 * The default is large enough for most purposes.
 *
 */

public class BufferReaderWriterExample {
    public static void main(String[] args) {

        try(      //File Reader
                  FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Input.txt");

                  BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            //char Array that hold char from buffer reader
            char[]charsFromInputFile = new char[100];
            bufferedReader.read(charsFromInputFile);
            // Print char array to the console
            System.out.println("Input string read by buffer reader from input.txt" + Arrays.toString(charsFromInputFile));
            try(FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Output.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            ) {
                bufferedWriter.write(charsFromInputFile);
                System.out.println("Buffer writer done with writing.");

            }catch (IOException ioException){
                System.out.println(ioException.getMessage());

            }

            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }




        }
}