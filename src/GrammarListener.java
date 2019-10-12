// Generated from D:/School/CMPILER/PE1/Code/CMPILERMP1/src\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(GrammarParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(GrammarParser.UnionContext ctx);
}