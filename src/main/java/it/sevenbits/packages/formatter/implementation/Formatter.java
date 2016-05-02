package it.sevenbits.packages.formatter.implementation;

import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.implementation.FileReaderException;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.implementation.FileWriterException;

import java.util.HashMap;
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
     * @throws FormatterException custom exception
     */
    public void formatter(final IReader reader, final IWriter writer) throws FormatterException {
        Map<Character, String> contract = new HashMap<Character, String>();
        contract.put('{', " {\n");
        contract.put('}', "\n}");
        contract.put(';', ";\n");

        try {
            while (reader.isNextCharacterExist()) {
                char inputCharacter = reader.readCharacter();
                if (contract.containsKey(inputCharacter)) {
                    writer.writeToString(contract.get(inputCharacter));
                } else {
                    writer.writeToString(String.valueOf(inputCharacter));
                }
            }
        } catch (FileReaderException e) {
            throw new FormatterException("Something went wrong", e);
        } catch (FileWriterException e) {
            throw new FormatterException("Something went wrong", e);
        }
    }
}
