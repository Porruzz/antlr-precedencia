// Generated from grammars/ExprStd.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprStdParser}.
 */
public interface ExprStdListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprStdParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprStdParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprStdParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprStdParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprStdParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprStdParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprStdParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprStdParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprStdParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ExprStdParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprStdParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ExprStdParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprStdParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ExprStdParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprStdParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ExprStdParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprStdParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExprStdParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprStdParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExprStdParser.AtomContext ctx);
}