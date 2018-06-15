package info.jtoledo.compiler;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import info.jtoledo.parser.DemoLexer;
import info.jtoledo.parser.DemoParser;

public class Main {

	public static void main(String[] args) throws Exception 
	{
		ANTLRInputStream input = new ANTLRFileStream("code.demo");
		DemoLexer lexer = new DemoLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DemoParser parser = new DemoParser(tokens);
		
		ParseTree tree = parser.addition();
		System.out.println(new MyVisitor().visit(tree));
	}

}
