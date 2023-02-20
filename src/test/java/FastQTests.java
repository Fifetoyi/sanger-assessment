import com.fifetoyi.fastq.AnalysisResult;
import com.fifetoyi.fastq.AnalyticsGenerator;
import com.fifetoyi.fastq.FastQSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FastQTests {
    @Test
    void givenValidSingleSequence_analyse_returnValidResults() {
        //Given
        String line1 = "@ee15a423-b008-44be-a4b2-5441d11b0b94 runid=fa1d76e661ac2bbb53a002e85e75a30e91827c51 sampleid=1 read=5087 ch=53 start_time=2019-10-18T22:14:05Z";
        String line2 = "GTTGTACTTCGTTCAATCGGTAGGTGTTTAACCGGATGGTCACGCCTACCGTGACAAAGAGATTGTCGGTGTCTTTGTGTTTCTGTTGGTGCTGATATTGCATTATGCATGAACGTAATGCCCATTAGTTGTGAATCCACCATGCGCGGAAGATAGAGCGACAGGCAAGTCACAAAGACACCGACAACTGTC";
        String line3 = "+";
        String line4 = "##$&$&/035881()'$0&*('-.=;685()$.%($'%%&#&)+..0,&+&%.-/+,%&()$3:0&@09BF=>CC8(78029F7=<=)+@+.6CCFFC@-8%2579<B8;88412134,,;:8./,#1#&(%((09;B=??48<=<@79*-:B540,8=B=444:<571-B5=ED2.56;110.5+,*)%%*";

        // When
        FastQSequence sequence = new FastQSequence(line1, line2, line3, line4);
        AnalysisResult result = AnalyticsGenerator.analyse(sequence);

        assertEquals(1, result.getTotalSequences());
        assertEquals(192, result.getTotalNucleotides());
    }
}
