package com.fifetoyi.fastq;

public class AnalysisResult {
    private int totalSequences;
    private int totalNucleotides;

    public AnalysisResult(int totalSequences, int totalNucleotides) {
        this.totalSequences = totalSequences;
        this.totalNucleotides = totalNucleotides;
    }

    public int getTotalSequences() {
        return totalSequences;
    }

    public void setTotalSequences(int totalSequences) {
        this.totalSequences = totalSequences;
    }

    public int getTotalNucleotides() {
        return totalNucleotides;
    }

    public void setTotalNucleotides(int totalNucleotides) {
        this.totalNucleotides = totalNucleotides;
    }
}
