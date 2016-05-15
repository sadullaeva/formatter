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
     * @throws ReaderException custom exception
     */
    public FileReader(final String fileName) throws ReaderException {
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new ReaderException("File not found", e);
        }
    }

    /**
     * Read a file character by character
     * @return one character
     * @throws ReaderException custom exception
     */
    public char readCharacter() throws ReaderException {
        try {
            return (char) fileInputStream.read();
        } catch (IOException e) {
            throw new ReaderException("Cannot read file", e);
        }
    }

    /**
     * Check that the exists next character
     * @return true if next character exist
     * @throws ReaderException custom exception
     */
    public boolean isNextCharacterExist() throws ReaderException {
        try {
            return fileInputStream.available() != 0;
        } catch (IOException e) {
            throw new ReaderException("Something went wrong", e);
        }
    }

    @Override
    public void close() throws IOException {
        fileInputStream.close();
    }
}
