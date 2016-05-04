package it.sevenbits.packages.reader.implementation;

import it.sevenbits.packages.reader.IReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileReader class
 * Created by marina on 01.05.16.
 */
public class FileReader implements IReader {

    private FileInputStream fileInputStream;

    /**
     * Constructor
     * @param fileName a file name
     * @throws FileReaderException custom exception
     */
    public FileReader(final String fileName) throws FileReaderException {
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new FileReaderException("File not found", e);
        }
    }

    /**
     * Read a file character by character
     * @return one character
     * @throws FileReaderException custom exception
     */
    public char readCharacter() throws FileReaderException {
        try {
            return (char) fileInputStream.read();
        } catch (IOException e) {
            throw new FileReaderException("Cannot read file", e);
        }
    }

    /**
     * Close the stream
     * @throws FileReaderException custom exception
     */
    public void closeStream() throws FileReaderException {
        try {
            fileInputStream.close();
        } catch (IOException e) {
            throw new FileReaderException("Cannot close file", e);
        }
    }

    /**
     * Check that the exists next character
     * @return true if next character exist
     * @throws FileReaderException custom exception
     */
    public boolean isNextCharacterExist() throws FileReaderException {
        try {
            return fileInputStream.available() != 0;
        } catch (IOException e) {
            throw new FileReaderException("Something went wrong", e);
        }
    }

    @Override
    public void close() throws IOException {
        fileInputStream.close();
    }
}
