import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class WordNet {

   // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) {
        if(synsets == null || hypernyms == null)
            throw new java.lang.NullPointerException("Null arguments");
        
        In inSynsets = new In(synsets);
        In inHypernyms = new In(hypernyms);
        
        while(!inSynsets.isEmpty()) {
            String s = inSynsets.readLine();
            String[] set = s.split(",");
        }
        
        while(!inHypernyms.isEmpty()) {
            String s = inHypernyms.readLine();
            String[] nyms = s.split(",");
        }
    }

   // returns all WordNet nouns
    public Iterable<String> nouns() {
        return new ArrayList<String>();
    }

   // is the word a WordNet noun?
    public boolean isNoun(String word) {
        if(word == null)
            throw new java.lang.NullPointerException("Null arguments");
        return false;
    }

   // distance between nounA and nounB (defined below)
    public int distance(String nounA, String nounB) {
        if(nounA == null || nounB == null)
            throw new java.lang.NullPointerException("Null arguments");
        
        return 0;
    }

   // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
   // in a shortest ancestral path (defined below)
    public String sap(String nounA, String nounB) {
        if(nounA == null || nounB == null)
            throw new java.lang.NullPointerException("Null arguments");
        
        return "";
    }

   // do unit testing of this class
    public static void main(String[] args) {
        if(args == null)
            throw new java.lang.NullPointerException("Null arguments");
        StdOut.print("TODO\n");
    }
}