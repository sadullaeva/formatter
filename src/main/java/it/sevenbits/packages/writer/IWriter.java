package it.sevenbits.packages.writer;

import it.sevenbits.packages.writer.implementation.FileWriterException;

/**
 * IWriter interface
 * Created by marina on 01.05.16.
 */
public interface IWriter {

    /**
     * Write to string
     * @param s string for writing
     * @throws FileWriterException custom exception
     */
    void writeToString(String s) throws FileWriterException;

    /**
     * Close the stream
     * @throws FileWriterException custom exception
     */
    void closeStream() throws FileWriterException;

}
