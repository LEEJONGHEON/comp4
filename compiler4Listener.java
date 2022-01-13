// Generated from compiler4.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiler4Parser}.
 */
public interface compiler4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(compiler4Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(compiler4Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(compiler4Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(compiler4Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(compiler4Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(compiler4Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(compiler4Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(compiler4Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(compiler4Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(compiler4Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(compiler4Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(compiler4Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiler4Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiler4Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(compiler4Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(compiler4Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(compiler4Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(compiler4Parser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(compiler4Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(compiler4Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(compiler4Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(compiler4Parser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(compiler4Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(compiler4Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(compiler4Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(compiler4Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(compiler4Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(compiler4Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler4Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(compiler4Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler4Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(compiler4Parser.NumberContext ctx);
}