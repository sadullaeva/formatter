package it.sevenbits.packages.writer.implementation;

import java.io.IOException;

/**
 * FileWriterException
 * Created by marina on 01.05.16.
 */
public class FileWriterException extends Throwable {

    /**
     * FileWriterException
     * @param message error message
     * @param e exception
     */
    public FileWriterException(final String message, final IOException e) {
        super(message, e);
    }
}
