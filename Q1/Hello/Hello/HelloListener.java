// Generated from Hello.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#wisdom}.
	 * @param ctx the parse tree
	 */
	void enterWisdom(HelloParser.WisdomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#wisdom}.
	 * @param ctx the parse tree
	 */
	void exitWisdom(HelloParser.WisdomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#wombat}.
	 * @param ctx the parse tree
	 */
	void enterWombat(HelloParser.WombatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#wombat}.
	 * @param ctx the parse tree
	 */
	void exitWombat(HelloParser.WombatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#hello}.
	 * @param ctx the parse tree
	 */
	void enterHello(HelloParser.HelloContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#hello}.
	 * @param ctx the parse tree
	 */
	void exitHello(HelloParser.HelloContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#goodbye}.
	 * @param ctx the parse tree
	 */
	void enterGoodbye(HelloParser.GoodbyeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#goodbye}.
	 * @param ctx the parse tree
	 */
	void exitGoodbye(HelloParser.GoodbyeContext ctx);
}