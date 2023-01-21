// Generated from database.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link databaseParser}.
 */
public interface databaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link databaseParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(databaseParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(databaseParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#func_pay}.
	 * @param ctx the parse tree
	 */
	void enterFunc_pay(databaseParser.Func_payContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#func_pay}.
	 * @param ctx the parse tree
	 */
	void exitFunc_pay(databaseParser.Func_payContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#pay}.
	 * @param ctx the parse tree
	 */
	void enterPay(databaseParser.PayContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#pay}.
	 * @param ctx the parse tree
	 */
	void exitPay(databaseParser.PayContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(databaseParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(databaseParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(databaseParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(databaseParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#emplid}.
	 * @param ctx the parse tree
	 */
	void enterEmplid(databaseParser.EmplidContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#emplid}.
	 * @param ctx the parse tree
	 */
	void exitEmplid(databaseParser.EmplidContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(databaseParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(databaseParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#wage}.
	 * @param ctx the parse tree
	 */
	void enterWage(databaseParser.WageContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#wage}.
	 * @param ctx the parse tree
	 */
	void exitWage(databaseParser.WageContext ctx);
	/**
	 * Enter a parse tree produced by {@link databaseParser#hours}.
	 * @param ctx the parse tree
	 */
	void enterHours(databaseParser.HoursContext ctx);
	/**
	 * Exit a parse tree produced by {@link databaseParser#hours}.
	 * @param ctx the parse tree
	 */
	void exitHours(databaseParser.HoursContext ctx);
}