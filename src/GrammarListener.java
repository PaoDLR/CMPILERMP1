// Generated from D:/School/CMPILER/PE1/Code/CMPILERMP1/src\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(GrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(GrammarParser.OutputContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link GrammarParser#epsilon}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon(GrammarParser.EpsilonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#epsilon}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon(GrammarParser.EpsilonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accterminals}.
	 * @param ctx the parse tree
	 */
	void enterAccterminals(GrammarParser.AccterminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accterminals}.
	 * @param ctx the parse tree
	 */
	void exitAccterminals(GrammarParser.AccterminalsContext ctx);
}