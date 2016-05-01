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
     * @throws FileReaderException
     */
    char readCharacter() throws FileReaderException;

    /**
     * Close the stream
     * @throws FileReaderException
     */
    void closeStream() throws FileReaderException;

    /**
     * Check that the exists next character
     * @return true if next character exist
     * @throws FileReaderException
     */
    boolean isNextCharacterExist() throws FileReaderException;
}
