package com.medium.kl.generictypes;

import java.util.List;

public class ReaderPrinterComposite<T extends Reader & Printer> implements Reader, Printer {

    private final List<T> printers;

    public ReaderPrinterComposite(List<T> printers) {
        this.printers = printers;
    }

    @Override
    public void print() {
        printers.forEach(Printer::print);
    }

    @Override
    public void read() {
        printers.forEach(Reader::read);
    }
}
