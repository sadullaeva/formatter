package it.sevenbits.packages.reader;

import it.sevenbits.packages.reader.implementation.FileReaderException;

/**
 * IReader interface
 * Created by marina on 01.05.16.
 */
public interface IReader {
    /**
     * Method read
     * @return one character
     */
    char readCharacter() throws FileReaderException;

    /**
     * Close the stream
     */
    void closeStream() throws FileReaderException;

    /**
     * Check that the exists next character
     * @return true if next character exist
     */
    boolean isNextCharacterExist() throws FileReaderException;
}
