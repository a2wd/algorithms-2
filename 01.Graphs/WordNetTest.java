import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * A JUnit test case class for WordNet
 */
public class WordNetTest extends TestCase {    
    //public WordNet(String synsets, String hypernyms)
    //public Iterable<String> nouns()
    //public boolean isNoun(String word)
    //public int distance(String nounA, String nounB)
    //public String sap(String nounA, String nounB)
    //public static void main(String[] args)
    public void testmain() {
        String expectedOutput = "TODO\n";
        
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        
        WordNet wordNet = new WordNet("", "");
        wordNet.main(new String[0]);
        
        assertEquals("Check for main() output", expectedOutput, byteArrayOutputStream.toString());
    }    
}
