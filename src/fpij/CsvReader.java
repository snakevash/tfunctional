package fpij;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by snake on 2014/6/27.
 */
public class CsvReader {
    private static final String SEPARATOR = ";";
    private final Reader source;

    public CsvReader(Reader source) {
        this.source = source;
    }

    public List<String> readHeader() {
        try (BufferedReader reader = new BufferedReader(source)) {
            return reader.lines()
                    .findFirst()
                    .map(line -> Arrays.asList(line.split(SEPARATOR)))
                    .get();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void main(final String[] args) throws FileNotFoundException {
        System.out.println(new CsvReader(new FileReader("test.csv")).readHeader());
    }
}
