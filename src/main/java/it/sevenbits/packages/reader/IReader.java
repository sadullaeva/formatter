package it.sevenbits.packages.reader;

import it.sevenbits.packages.reader.implementation.ReaderException;

import java.io.Closeable;

/**
 * IReader interface
 * Created by marina on 01.05.16.
 */
public interface IReader extends Closeable {
    /**
     * Method read
     * @return one character
     * @throws ReaderException custom exception
     */
    char readCharacter() throws ReaderException;

    /**
     * Check that the exists next character
     * @return true if next character exist
     * @throws ReaderException custom exception
     */
    boolean isNextCharacterExist() throws ReaderException;

}
