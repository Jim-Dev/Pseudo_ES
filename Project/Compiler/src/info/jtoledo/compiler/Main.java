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
		System.out.println(createJasminFile(new MyVisitor().visit(tree)));
	}
	
	private static String createJasminFile(String instructions)
	{
		return ".class public TestClass\r\n" + 
				".super java/lang/Object\r\n" + 
				"\r\n" + 
				".method public static main([Ljava/lang/String;)V\r\n" + 
				"    .limit stack 100\r\n" + 
				"    .limit locals 100\r\n" + 
				"\r\n" + 
				"    getstatic java/lang/System/out Ljava/io/PrintStream;\r\n" +
				
				instructions + "\r\n"+
				
				"    invokevirtual java/io/PrintStream/println(I)V\r\n" + 
				"    return\r\n" + 
				"\r\n" + 
				".end method";
		
	}

}
