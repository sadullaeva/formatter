package it.sevenbits.packages.formatter.implementation;

import it.sevenbits.packages.reader.implementation.ReaderException;
import it.sevenbits.packages.writer.implementation.FileWriterException;

/**
 * FormatterException
 * Created by marina on 02.05.16.
 */
public class FormatterException extends Throwable {
    /**
     * FormatterException
     * @param message error message
     * @param e exception
     */
    public FormatterException(final String message, final ReaderException e) {
        super(message, e);
    }

    public FormatterException(final String message, final FileWriterException e) {
        super(message, e);
    }
}
