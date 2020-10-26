package com.company;

import com.company.GrammarParser.AdditiveExprContext;
import com.company.GrammarParser.ExponentialExprContext;
import com.company.GrammarParser.MultiplicativeExprContext;
import com.company.GrammarParser.NumberExprContext;
import com.company.GrammarParser.ParenthesizedExprContext;
import com.company.GrammarParser.SinExprContext;
import com.company.GrammarParser.ConstExprContext;

public class VisitorClass extends GrammarBaseVisitor<Double>{
    @Override
    public Double visitMultiplicativeExpr(MultiplicativeExprContext ctx) throws ArithmeticException {
        double left = super.visit(ctx.expression(0));
        double right = super.visit(ctx.expression(1));

        if (ctx.operatorToken.getType()==GrammarLexer.MULTIPLY)
            return left*right;
        else {
            if (Math.abs(right) < 0.0000001) {
                throw new ArithmeticException("Divizion by sezo");
            }
            return left/right;
        }
    }
    @Override
    public Double visitExponentialExpr(ExponentialExprContext ctx) {
        double left = super.visit(ctx.expression(0));
        double right = super.visit(ctx.expression(1));

        return Math.pow(left, right);
    }
    @Override
    public Double visitAdditiveExpr(AdditiveExprContext ctx) {
        double left = visit(ctx.expression(0));
        double right = visit(ctx.expression(1));

        if (ctx.operatorToken.getType()==GrammarLexer.ADD)
            return left+right;
        else return left-right;
    }
    @Override
    public Double visitNumberExpr(NumberExprContext ctx) {
        return Double.parseDouble(ctx.getText());
    }
    @Override
    public Double visitParenthesizedExpr(ParenthesizedExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitSinExpr(SinExprContext ctx) {
        double value = super.visit(ctx.expression());
        switch (ctx.operatorToken.getType()) {
            case GrammarLexer.SIN:
                return Math.sin(value);
            case GrammarLexer.COS:
                return Math.cos(value);
            case GrammarLexer.TAN:
                return Math.tan(value);
            case GrammarLexer.LN:
                return Math.log(value);
            case GrammarLexer.EXP:
                return Math.exp(value);
            case GrammarLexer.ABS:
                return Math.abs(value);
            case GrammarLexer.SQRT:
                return Math.sqrt(value);
        }
        return value;
    }
    @Override
    public Double visitConstExpr(ConstExprContext ctx) {
        if (ctx.getText() == "E") {
            return Math.E;
        } else {
            return Math.PI;
        }
    }
}