package org.datanucleus.api.jdo.query;

import javax.jdo.query.*;
import java.util.Collection;

public class CollectionExpressionImpl <T extends Collection<E>, E> extends ExpressionImpl<T> implements CollectionExpression<T, E> {
    public CollectionExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }

    @Override
    public BooleanExpression contains(Expression<E> expr) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression contains(E elem) {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public BooleanExpression isEmpty() {
        return new BooleanExpressionImpl(parent, name);
    }

    @Override
    public NumericExpression<Integer> size() {
        return new NumericExpressionImpl(parent, name);
    }
}
