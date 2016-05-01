package it.sevenbits.packages.reader.implementation;

import it.sevenbits.packages.reader.IReader;

/**
 * StringReader class
 * Created by marina on 01.05.16.
 */
public class StringReader implements IReader {
    /**
     * Read a string character by character
     * @return one character
     */
    public char readCharacter() {
        return 0;
    }

    /**
     * Close the stream
     */
    public void closeStream() {

    }

    /**
     * Check that the exists next character
     * @return true if next character exist
     */
    public boolean isNextCharacterExist() {
        return false;
    }
}
