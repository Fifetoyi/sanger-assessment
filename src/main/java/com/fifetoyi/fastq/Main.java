package com.fifetoyi.fastq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Read 4 lines at a time
        // Build Sequence instance
        // Run analytics on sequence
        // Return and merge results

        String path = "src/main/resources/sample.fastq";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        // Base case
        AnalysisResult currentResult = new AnalysisResult(0, 0);

        while(reader.ready()) {
            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();
            String line4 = reader.readLine();

            FastQSequence sequence = new FastQSequence(line1, line2, line3, line4);
            currentResult = AnalyticsGenerator.analyseAndMerge(sequence, currentResult);
        }

        System.out.printf("Total sequences: %d\nTotal Nucleotides: %d\n", currentResult.getTotalSequences(), currentResult.getTotalNucleotides());
        reader.close();
    }
}