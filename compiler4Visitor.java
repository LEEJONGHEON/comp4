// Generated from compiler4.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiler4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiler4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(compiler4Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(compiler4Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(compiler4Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(compiler4Parser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(compiler4Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(compiler4Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiler4Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(compiler4Parser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(compiler4Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(compiler4Parser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(compiler4Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(compiler4Parser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(compiler4Parser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(compiler4Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler4Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(compiler4Parser.NumberContext ctx);
}