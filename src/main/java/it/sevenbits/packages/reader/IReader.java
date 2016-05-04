package it.sevenbits.packages.reader;

import it.sevenbits.packages.reader.implementation.FileReaderException;

import java.io.Closeable;

/**
 * IReader interface
 * Created by marina on 01.05.16.
 */
public interface IReader extends Closeable {
    /**
     * Method read
     * @return one character
     * @throws FileReaderException custom exception
     */
    char readCharacter() throws FileReaderException;

    /**
     * Check that the exists next character
     * @return true if next character exist
     * @throws FileReaderException custom exception
     */
    boolean isNextCharacterExist() throws FileReaderException;

}
