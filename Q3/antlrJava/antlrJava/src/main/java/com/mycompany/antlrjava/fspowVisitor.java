// Generated from fspow.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fspowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fspowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fspowParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(fspowParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(fspowParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#fcCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcCreation(fspowParser.FcCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#fcCreationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcCreationName(fspowParser.FcCreationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#newFileCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewFileCollection(fspowParser.NewFileCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#rootSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootSpecifier(fspowParser.RootSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#selCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelCreation(fspowParser.SelCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#selCreationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelCreationName(fspowParser.SelCreationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#filterSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterSpecifier(fspowParser.FilterSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#selfilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfilter(fspowParser.SelfilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(fspowParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(fspowParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#filterFcCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterFcCreation(fspowParser.FilterFcCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#fcApplySelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcApplySelector(fspowParser.FcApplySelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fspowParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(fspowParser.ExpressionContext ctx);
}