package it.sevenbits.packages.writer;

import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.implementation.FileReader;
import it.sevenbits.packages.reader.implementation.FileReaderException;
import it.sevenbits.packages.writer.implementation.FileWriter;
import it.sevenbits.packages.writer.implementation.FileWriterException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * FileWriterTest
 * Created by marina on 05.05.16.
 */
public class FileWriterTest {

    @Before
    public void SetUp() {

    }

//    @Test(expected = FileWriterException.class)
//    public void testFileWriterIfFileNotFound() throws FileWriterException {
//         IWriter writer = new FileWriter("src/main/resources/test/thisFileDoesNotExist.txt");
//     }

    @Test(expected = FileWriterException.class)
    public void testFileWriterIfFileCanNotBeWrite() throws FileWriterException, IOException {
        try(IWriter writer = new FileWriter("src/main/resources/test/thisFileCannotBeWrite.txt")) {
            writer.writeToString("lalala");
        }
    }

    @Test
    public void testWriteToString() throws FileWriterException, IOException, FileReaderException {
        try (IWriter writer = new FileWriter("src/main/resources/test/testWriteToString.txt")) {
            writer.writeToString("lalala");
        }
        try (IReader reader = new FileReader("src/main/resources/test/testWriteToString.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            while (reader.isNextCharacterExist()) {
                stringBuilder.append(reader.readCharacter());
            }
            assertEquals("lalala", String.valueOf(stringBuilder));
        }

    }

}
