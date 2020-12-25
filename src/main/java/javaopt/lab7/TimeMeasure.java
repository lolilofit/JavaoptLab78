package javaopt.lab7;

import org.openjdk.jmh.annotations.*;

import java.util.regex.Pattern;

@BenchmarkMode(Mode.All)
@Warmup(iterations = 2)
@Measurement(iterations = 5, batchSize = 3)
@State(Scope.Benchmark)
public class TimeMeasure {
    @Param({"8767", "65sdds"})
    public String src;

    @Benchmark
    public boolean parseIntCheck() {
        try {
            Integer.parseInt(src);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Benchmark
    public boolean isDigitCheck() {
        for (int i = 0; i < src.length(); i++) {
            if(!Character.isDigit(src.charAt(i)))
                return false;
        }
        return true;
    }

    @Benchmark
    public boolean regCheck() {
        return Pattern.matches(src, "^\\d+$");
    }
}
