// Generated from EDTFLevel1.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EDTFLevel1Parser}.
 */
public interface EDTFLevel1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(EDTFLevel1Parser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(EDTFLevel1Parser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#qualifiedDate}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDate(EDTFLevel1Parser.QualifiedDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#qualifiedDate}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDate(EDTFLevel1Parser.QualifiedDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(EDTFLevel1Parser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(EDTFLevel1Parser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#dateTime}.
	 * @param ctx the parse tree
	 */
	void enterDateTime(EDTFLevel1Parser.DateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#dateTime}.
	 * @param ctx the parse tree
	 */
	void exitDateTime(EDTFLevel1Parser.DateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#dateOrInterval}.
	 * @param ctx the parse tree
	 */
	void enterDateOrInterval(EDTFLevel1Parser.DateOrIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#dateOrInterval}.
	 * @param ctx the parse tree
	 */
	void exitDateOrInterval(EDTFLevel1Parser.DateOrIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#gregorianDate}.
	 * @param ctx the parse tree
	 */
	void enterGregorianDate(EDTFLevel1Parser.GregorianDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#gregorianDate}.
	 * @param ctx the parse tree
	 */
	void exitGregorianDate(EDTFLevel1Parser.GregorianDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#julianDate}.
	 * @param ctx the parse tree
	 */
	void enterJulianDate(EDTFLevel1Parser.JulianDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#julianDate}.
	 * @param ctx the parse tree
	 */
	void exitJulianDate(EDTFLevel1Parser.JulianDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#julianDay}.
	 * @param ctx the parse tree
	 */
	void enterJulianDay(EDTFLevel1Parser.JulianDayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#julianDay}.
	 * @param ctx the parse tree
	 */
	void exitJulianDay(EDTFLevel1Parser.JulianDayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EDTFLevel1Parser#dateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDateSpecification(EDTFLevel1Parser.DateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EDTFLevel1Parser#dateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDateSpecification(EDTFLevel1Parser.DateSpecificationContext ctx);
}