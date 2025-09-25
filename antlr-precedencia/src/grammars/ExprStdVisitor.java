// Generated from grammars/ExprStd.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprStdParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprStdVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprStdParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprStdParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprStdParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprStdParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprStdParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ExprStdParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprStdParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(ExprStdParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprStdParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ExprStdParser.AtomContext ctx);
}