# Sanger Assessment

Wellcome Sanger Institute take-home assessment

# Build
The code has been written using gradle and has an executable jar file. To build the project, enter `./gradlew jar` in the terminal.

# Run
To run the project, enter `java -jar build/libs/sanger-assessment-1.0-SNAPSHOT.jar ./sample.fastq` in the terminal.

Note that this includes the directory to the jar file followed by the directory to the sample fastq file in the project.

You can also choose to run the project with a gzipped file `java -jar build/libs/sanger-assessment-1.0-SNAPSHOT.jar sample.fastq.gz`

# Tests
Unit tests ahve also been written to verify results from the code.
