package pl.homework.tools;

import java.util.Locale;

public class Loops {
    private double startRange;
    private double endRange;
    private double step;

    public Loops() {
        startRange = 0;
        endRange = 3;
        step = 0.1;
    }

    public Loops(double startRange, double endRange, double step) {
        this.startRange = startRange;
        this.endRange = endRange;
        this.step = step;
    }

    public void whileLoop() {
        double i = startRange;
        int licznik = 0;
        while (i < endRange) {
            System.out.printf(Locale.US,"%.1f, ", i);
            licznik++;
            i = licznik*step;
        }
        if (i == endRange)
            System.out.printf(Locale.US,"%.1f%n", i);
    }

    public void doWhileLoop() {
        double i = startRange;
        int licznik = 0;
        do {
            System.out.printf(Locale.US,"%.1f, ", i);
            licznik++;
            i = licznik*step;
        } while (i < endRange);
        if (i == endRange)
            System.out.printf(Locale.US,"%.1f%n", i);
    }
}
