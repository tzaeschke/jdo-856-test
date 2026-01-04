package org.datanucleus.api.jdo.query;

import javax.jdo.query.*;

public class StringExpressionImpl extends ComparableExpressionImpl<String> implements StringExpression {
    public StringExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }

    @Override
    public StringExpression add(Expression expr) {
        return null;
    }

    @Override
    public StringExpression add(String str) {
        return null;
    }

    @Override
    public CharacterExpression charAt(int pos) {
        return null;
    }

    @Override
    public CharacterExpression charAt(NumericExpression<Integer> pos) {
        return null;
    }

    @Override
    public BooleanExpression endsWith(StringExpression expr) {
        return null;
    }

    @Override
    public BooleanExpression endsWith(String str) {
        return null;
    }

    @Override
    public BooleanExpression equalsIgnoreCase(StringExpression expr) {
        return null;
    }

    @Override
    public BooleanExpression equalsIgnoreCase(String str) {
        return null;
    }

    @Override
    public NumericExpression<Integer> indexOf(StringExpression expr) {
        return null;
    }

    @Override
    public NumericExpression<Integer> indexOf(String str) {
        return null;
    }

    @Override
    public NumericExpression<Integer> indexOf(StringExpression expr, NumericExpression<Integer> pos) {
        return null;
    }

    @Override
    public NumericExpression<Integer> indexOf(String str, NumericExpression<Integer> pos) {
        return null;
    }

    @Override
    public NumericExpression<Integer> indexOf(String str, int pos) {
        return null;
    }

    @Override
    public NumericExpression<Integer> indexOf(StringExpression expr, int pos) {
        return null;
    }

    @Override
    public NumericExpression<Integer> length() {
        return new NumericExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression matches(StringExpression expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression matches(String str) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression startsWith(StringExpression expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression startsWith(String str) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression startsWith(StringExpression expr, int index) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression startsWith(String str, int index) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public StringExpression substring(NumericExpression<Integer> pos) {
        return null;
    }

    @Override
    public StringExpression substring(int pos) {
        return null;
    }

    @Override
    public StringExpression substring(NumericExpression<Integer> startPos, NumericExpression<Integer> endPos) {
        return null;
    }

    @Override
    public StringExpression substring(int startPos, int endPos) {
        return null;
    }

    @Override
    public StringExpression toLowerCase() {
        return null;
    }

    @Override
    public StringExpression toUpperCase() {
        return null;
    }

    @Override
    public StringExpression trim() {
        return null;
    }
}
