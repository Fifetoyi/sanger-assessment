package com.fifetoyi.fastq;

public class AnalyticsGenerator {
    public static AnalysisResult analyse(FastQSequence sequence) {
        return new AnalysisResult(1, sequence.getField2().length());
    }
}
