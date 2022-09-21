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
	 * Enter a parse tree produced by {@link fspowParser#rootSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterRootSpecifier(fspowParser.RootSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fspowParser#rootSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitRootSpecifier(fspowParser.RootSpecifierContext ctx);
}