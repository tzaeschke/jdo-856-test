package org.datanucleus.api.jdo.query;

import javax.jdo.query.BooleanExpression;
import javax.jdo.query.ComparableExpression;
import javax.jdo.query.OrderExpression;
import javax.jdo.query.PersistableExpression;

public class ComparableExpressionImpl<T> extends ExpressionImpl<T> implements ComparableExpression<T> {
    public ComparableExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }

    @Override
    public BooleanExpression lt(ComparableExpression<? extends T> expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression lt(T t) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression lteq(ComparableExpression<? extends T> expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression lteq(T t) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression gt(ComparableExpression<? extends T> expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression gt(T t) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression gteq(ComparableExpression<? extends T> expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression gteq(T t) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public ComparableExpression<T> min() {
        return null;
    }

    @Override
    public ComparableExpression<T> max() {
        return null;
    }

    @Override
    public OrderExpression<T> asc() {
        return null;
    }

    @Override
    public OrderExpression<T> desc() {
        return null;
    }
}
