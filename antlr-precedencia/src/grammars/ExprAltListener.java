// Generated from grammars/ExprAlt.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprAltParser}.
 */
public interface ExprAltListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprAltParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprAltParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprAltParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprAltParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprAltParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprAltParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprAltParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprAltParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprAltParser#addHigher}.
	 * @param ctx the parse tree
	 */
	void enterAddHigher(ExprAltParser.AddHigherContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprAltParser#addHigher}.
	 * @param ctx the parse tree
	 */
	void exitAddHigher(ExprAltParser.AddHigherContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprAltParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExprAltParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprAltParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExprAltParser.AtomContext ctx);
}