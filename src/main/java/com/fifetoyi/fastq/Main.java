package com.fifetoyi.fastq;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Read 4 lines at a time
        // Build Sequence instance
        // Run analytics on sequence
        // Return and merge results

//        String path = "src/main/resources/sample.fastq";
//        String path = "src/main/resources/sample.fastq.gz";
        String path = "src/main/resources/" + args[0];

        BufferedReader reader;

        if (path.endsWith(".gz")) {
            reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(path))));
        } else {
            reader = new BufferedReader(new FileReader(path));
        }

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