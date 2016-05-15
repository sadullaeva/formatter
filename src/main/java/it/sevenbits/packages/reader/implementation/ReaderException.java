package it.sevenbits.packages.reader.implementation;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ReaderException
 * Created by marina on 01.05.16.
 */

public class ReaderException extends Exception {

    /**
     * ReaderException
     * @param message error message
     * @param e exception
     */
    public ReaderException(final String message, final FileNotFoundException e) {
        super(message, e);
    }

    public ReaderException(final String message, final IOException e) {
        super(message, e);
    }
}
