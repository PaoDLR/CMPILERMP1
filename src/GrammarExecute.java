/*
 * @authors De Castro, Delos Reyes
 */

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class GrammarExecute {
    public static void main(String args[]){
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString("a U b"));
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
    }
}
