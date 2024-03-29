// Generated from D:/School/CMPILER/PE1/Code/CMPILERMP1\Grammar.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link GrammarParser#sym}.
	 * @param ctx the parse tree
	 */
	void enterSym(GrammarParser.SymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sym}.
	 * @param ctx the parse tree
	 */
	void exitSym(GrammarParser.SymContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(GrammarParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(GrammarParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accTerms}.
	 * @param ctx the parse tree
	 */
	void enterAccTerms(GrammarParser.AccTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accTerms}.
	 * @param ctx the parse tree
	 */
	void exitAccTerms(GrammarParser.AccTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void enterEps(GrammarParser.EpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void exitEps(GrammarParser.EpsContext ctx);
}