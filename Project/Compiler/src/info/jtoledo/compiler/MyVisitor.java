package info.jtoledo.compiler;

import info.jtoledo.parser.DemoBaseVisitor;
import info.jtoledo.parser.DemoParser.AdditionContext;

public class MyVisitor extends DemoBaseVisitor<String>
{
@Override
	public String visitAddition(AdditionContext ctx) 
	{
		visitChildren(ctx);
		if (ctx.getChildCount()==1)
		{
			System.out.println(ctx.getChild(0));
		}
		else
		{
			System.out.println(ctx.getChild(2));
			System.out.println("addition");
		}
		return null;
	}
}
