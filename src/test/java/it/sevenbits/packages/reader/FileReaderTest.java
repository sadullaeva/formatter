package it.sevenbits.packages.reader;

import it.sevenbits.packages.reader.implementation.FileReader;
import it.sevenbits.packages.reader.implementation.ReaderException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * FileReaderTest
 * Created by marina on 05.05.16.
 */
public class FileReaderTest {

    @Before
    public void SetUp() {

    }

    @Test(expected = ReaderException.class)
    public void testFileReaderIfFileNotFound() throws ReaderException {
        IReader reader = new FileReader("thisFileDoesNotExist.txt");
    }

    @Test
    public void testReadCharacter() throws ReaderException, IOException {
        try (IReader reader = new FileReader("src/main/resources/input.txt")) {
            assertEquals('c', reader.readCharacter());
            if (reader.isNextCharacterExist()) {
                assertEquals('l', reader.readCharacter());
            }
        }
    }

}
