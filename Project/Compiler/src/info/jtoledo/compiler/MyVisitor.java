package info.jtoledo.compiler;

import info.jtoledo.parser.DemoBaseVisitor;
import info.jtoledo.parser.DemoParser.AdditionContext;
import info.jtoledo.parser.DemoParser.NumberContext;
import info.jtoledo.parser.DemoParser.PlusContext;

public class MyVisitor extends DemoBaseVisitor<String>
{
	
	@Override
	public String visitPlus(PlusContext ctx) 
	{
		return visitChildren(ctx) + "\n" +
		ctx.right.getText() + "\n" +
		"addition";
	}
	@Override
	public String visitNumber(NumberContext ctx) 
	{
		return ctx.number.getText();
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate==null)
			return nextResult;
		else if (nextResult==null)
			return aggregate;
		else
			return aggregate + "\n" + nextResult;
	}
	
}
