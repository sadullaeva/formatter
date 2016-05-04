package it.sevenbits.packages.formatter;

import it.sevenbits.packages.formatter.implementation.FormatterException;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.writer.IWriter;

import java.util.Map;

/**
 * Formatter interface
 * Created by marina on 02.05.16.
 */
public interface IFormatter {

    /**
     * formatter
     * @param reader input
     * @param writer output
     * @param contract contract
     * @throws FormatterException custom exception
     */
    void formatter(IReader reader, IWriter writer, Map contract) throws FormatterException;

}
