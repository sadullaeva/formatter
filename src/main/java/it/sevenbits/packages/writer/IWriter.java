package it.sevenbits.packages.writer;

import it.sevenbits.packages.writer.implementation.FileWriterException;

import java.io.Closeable;

/**
 * IWriter interface
 * Created by marina on 01.05.16.
 */
public interface IWriter extends Closeable {

    /**
     * Write to string
     * @param s string for writing
     * @throws FileWriterException custom exception
     */
    void writeToString(String s) throws FileWriterException;

}
