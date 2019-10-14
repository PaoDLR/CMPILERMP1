import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


public class AntlrParser {

    public static void main (String[] args) throws IOException{

        CharStream cs = CharStreams.fromFileName("./test.cc");
        GrammarLexer gl = new GrammarLexer(cs);
        CommonTokenStream cts = new CommonTokenStream(gl);
        GrammarParser gp = new GrammarParser(cts);

        ParseTree pt = gp.output();

        System.out.println("end");

    }



}
