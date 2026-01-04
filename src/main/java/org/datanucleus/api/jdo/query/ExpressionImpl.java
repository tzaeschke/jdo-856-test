package org.datanucleus.api.jdo.query;

import javax.jdo.query.BooleanExpression;
import javax.jdo.query.Expression;
import javax.jdo.query.NumericExpression;
import javax.jdo.query.PersistableExpression;

public class ExpressionImpl<T> implements Expression<T> {

    protected final PersistableExpression<T> parent;
    protected final String name;

    public ExpressionImpl(PersistableExpression<T> parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    public ExpressionImpl(Class cls, String name, ExpressionType type) {
        this.parent = null;
        this.name = name;    }

    @Override
    public BooleanExpression eq(Expression expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression eq(T t) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression ne(Expression expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression ne(T t) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public NumericExpression<Long> count() {
        return new NumericExpressionImpl(parent, null);
    }

    @Override
    public NumericExpression<Long> countDistinct() {
        return new NumericExpressionImpl(parent, null);
    }

    @Override
    public BooleanExpression instanceOf(Class cls) {
        return null;
    }

    @Override
    public Expression cast(Class cls) {
        return null;
    }

    @Override
    public Expression as(String alias) {
        return null;
    }
}
