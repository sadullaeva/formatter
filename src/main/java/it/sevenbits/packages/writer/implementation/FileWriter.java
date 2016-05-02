package it.sevenbits.packages.writer.implementation;

import it.sevenbits.packages.writer.IWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileWriter class
 * Created by marina on 01.05.16.
 */
public class FileWriter implements IWriter {

    private FileOutputStream fileOutputStream;

    /**
     * Constructor
     * @param fileName file name
     * @throws FileWriterException custom exception
     */
    public FileWriter(final String fileName) throws FileWriterException {
        try {
            fileOutputStream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new FileWriterException("File not found", e);
        }
    }

    /**
     * Write to string
     * @param s string for writing
     * @throws FileWriterException custom exception
     */
    public void writeToString(final String s) throws FileWriterException {
        try {
            fileOutputStream.write(s.getBytes());
        } catch (IOException e) {
            throw new FileWriterException("Cannot write", e);
        }
    }

    /**
     * Close the stream
     * @throws FileWriterException custom exception
     */
    public void closeStream() throws FileWriterException {
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            throw new FileWriterException("Cannot close file", e);
        }
    }
}
