package it.sevenbits.packages.reader.implementation;

import it.sevenbits.packages.reader.IReader;

import java.io.IOException;

/**
 * StringReader class
 * Created by marina on 15.05.16.
 */
public class StringReader implements IReader {

    private StringBuffer stringBuffer;

    /**
     * Constructor
     * @param stringBuffer input string
     */
    public StringReader(final StringBuffer stringBuffer) {
        this.stringBuffer = new StringBuffer(stringBuffer);
    }

    @Override
    public char readCharacter() {
        char temp = stringBuffer.charAt(0);
        stringBuffer.deleteCharAt(0);
        return temp;
    }

    @Override
    public boolean isNextCharacterExist() throws ReaderException {
        return stringBuffer.length() > 0;
    }

    @Override
    public void close() throws IOException {

    }
}
