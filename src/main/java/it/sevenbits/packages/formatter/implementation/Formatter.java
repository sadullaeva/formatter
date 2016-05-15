package it.sevenbits.packages.formatter.implementation;

import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.implementation.ReaderException;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.implementation.FileWriterException;

import java.util.Map;

/**
 * Formatter class
 * Created by marina on 02.05.16.
 */
public class Formatter implements IFormatter {

    private IFormatter formatter;

    /**
     * Formatting Java code
     * @param reader input
     * @param writer output
     * @param contract contract
     * @throws FormatterException custom exception
     */
    public void formatter(final IReader reader, final IWriter writer, final Map contract) throws FormatterException {
        int countOfBrace = 0;
        try {
            while (reader.isNextCharacterExist()) {
                char inputCharacter = reader.readCharacter();
                if (contract.containsKey(inputCharacter)) {
                    writer.writeToString((String) contract.get(inputCharacter));
                } else {
                    writer.writeToString(String.valueOf(inputCharacter));
                }
            }
        } catch (ReaderException e) {
            throw new FormatterException("Something went wrong", e);
        } catch (FileWriterException e) {
            throw new FormatterException("Something went wrong", e);
        }
    }
}
