/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*; 
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



/**
 *
 * @author K1907860
 */
public class Main {
        public static void main(String[] args) throws Exception { 



        Scanner inpname = new Scanner(System.in); 
        Java8Lexer java8Lexer = new Java8Lexer(CharStreams.fromString(javaClassContent));

        Java8Lexer lexer = new Java8Lexer(inpname);
        CommonTokenStream tokenstream = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokenstream);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        fspowVisitor visitor = new fspowVisitor();
        visitor.visit(tree);






    




    }
}
