package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.formatter.implementation.Formatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.implementation.FileReader;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.implementation.FileWriter;

/**
 * Created by marina on 25.04.16.
 *
 */
public final class Bootstrap {

    private Bootstrap() {

    }

    /**
     * Main method
     * @param args - input parameters
     * @throws Throwable exception
     */
    public static void main(final String[] args) throws Throwable {
        IReader reader = new FileReader("src/main/resources/input.txt");
        IWriter writer = new FileWriter("src/main/resources/output.txt");
        IFormatter formatter = new Formatter();
        formatter.formatter(reader, writer);
        writer.closeStream();
        reader.closeStream();
    }

}
