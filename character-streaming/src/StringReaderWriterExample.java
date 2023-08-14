import java.io.*;

/*
StringReader extends Reader.
StringWriter extends Writer.
StringReader Reads from String object.
StringWriter Writes from String object.

 */
public class StringReaderWriterExample {
    public static void main(String[] args) throws IOException {
        String stringMessage = "Hello from string";
        try (Reader StringReader = new StringReader(stringMessage))
        {
            char[]charsFromString = new char[20];
            StringReader.read(charsFromString);
            System.out.println(charsFromString);
            try (Writer StringWriter = new StringWriter()){
                String WrittenString = "";
                StringWriter.write(WrittenString);

            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }

        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

    }
}
