// Generated from D:/School/CMPILER/PE1/Code/CMPILERMP1\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(GrammarParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(GrammarParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#accTerms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccTerms(GrammarParser.AccTermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#eps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEps(GrammarParser.EpsContext ctx);
}