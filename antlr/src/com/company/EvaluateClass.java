package com.company;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class EvaluateClass {
    public static double evaluate(String expression) {
        GrammarLexer lexer = new GrammarLexer(
                CharStreams.fromString(expression));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        GrammarParser parser = new GrammarParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        ParseTree tree = parser.expression();
        VisitorClass visitor = new VisitorClass();

        return visitor.visit(tree);
    }
}