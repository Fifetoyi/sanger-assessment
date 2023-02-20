package com.fifetoyi.fastq;

public class AnalyticsGenerator {
    public static AnalysisResult analyse(FastQSequence sequence) {
        return new AnalysisResult(1, sequence.getField2().length());
    }

    public static AnalysisResult merge(AnalysisResult result1, AnalysisResult result2) {
        int totalSequences = result1.getTotalSequences() + result2.getTotalSequences();
        int totalNucleotides = result1.getTotalNucleotides() + result2.getTotalNucleotides();

        return new AnalysisResult(totalSequences, totalNucleotides);
    }
}
