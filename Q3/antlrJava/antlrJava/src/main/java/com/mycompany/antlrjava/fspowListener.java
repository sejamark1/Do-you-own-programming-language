// Generated from fspow.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fspowParser}.
 */
public interface fspowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fspowParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(fspowParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(fspowParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(fspowParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(fspowParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#fcCreation}.
	 * @param ctx the parse tree
	 */
	void enterFcCreation(fspowParser.FcCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#fcCreation}.
	 * @param ctx the parse tree
	 */
	void exitFcCreation(fspowParser.FcCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#fcCreationName}.
	 * @param ctx the parse tree
	 */
	void enterFcCreationName(fspowParser.FcCreationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#fcCreationName}.
	 * @param ctx the parse tree
	 */
	void exitFcCreationName(fspowParser.FcCreationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#newFileCollection}.
	 * @param ctx the parse tree
	 */
	void enterNewFileCollection(fspowParser.NewFileCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#newFileCollection}.
	 * @param ctx the parse tree
	 */
	void exitNewFileCollection(fspowParser.NewFileCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#rootSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterRootSpecifier(fspowParser.RootSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#rootSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitRootSpecifier(fspowParser.RootSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#selCreation}.
	 * @param ctx the parse tree
	 */
	void enterSelCreation(fspowParser.SelCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#selCreation}.
	 * @param ctx the parse tree
	 */
	void exitSelCreation(fspowParser.SelCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#selCreationName}.
	 * @param ctx the parse tree
	 */
	void enterSelCreationName(fspowParser.SelCreationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#selCreationName}.
	 * @param ctx the parse tree
	 */
	void exitSelCreationName(fspowParser.SelCreationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#filterSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFilterSpecifier(fspowParser.FilterSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#filterSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFilterSpecifier(fspowParser.FilterSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void enterSelfilter(fspowParser.SelfilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 */
	void exitSelfilter(fspowParser.SelfilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(fspowParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(fspowParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(fspowParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(fspowParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#filterFcCreation}.
	 * @param ctx the parse tree
	 */
	void enterFilterFcCreation(fspowParser.FilterFcCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#filterFcCreation}.
	 * @param ctx the parse tree
	 */
	void exitFilterFcCreation(fspowParser.FilterFcCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#fcApplySelector}.
	 * @param ctx the parse tree
	 */
	void enterFcApplySelector(fspowParser.FcApplySelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#fcApplySelector}.
	 * @param ctx the parse tree
	 */
	void exitFcApplySelector(fspowParser.FcApplySelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(fspowParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(fspowParser.ExpressionContext ctx);
}