package it.sevenbits.packages.reader.implementation;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileReaderException
 * Created by marina on 01.05.16.
 */

public class FileReaderException extends Exception {

    /**
     * FileReaderException
     * @param message error message
     * @param e exception
     */
    public FileReaderException(final String message, final FileNotFoundException e) {
        super(message, e);
    }

    public FileReaderException(final String message, final IOException e) {
        super(message, e);
    }
}
