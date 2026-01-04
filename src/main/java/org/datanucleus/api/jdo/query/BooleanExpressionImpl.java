package org.datanucleus.api.jdo.query;

import javax.jdo.query.BooleanExpression;
import javax.jdo.query.PersistableExpression;

public class BooleanExpressionImpl<T> extends ComparableExpressionImpl<Boolean> implements BooleanExpression {
    public BooleanExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }

    @Override
    public BooleanExpression and(BooleanExpression expr) {
        return this;
    }

    @Override
    public BooleanExpression or(BooleanExpression expr) {
        return this;
    }

    @Override
    public BooleanExpression not() {
        return this;
    }

    @Override
    public BooleanExpression neg() {
        return this;
    }
}
