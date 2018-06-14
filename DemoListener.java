// Generated from Demo.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(DemoParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(DemoParser.AdditionContext ctx);
}