package org.datanucleus.api.jdo.query;

import javax.jdo.query.*;
import java.util.List;

public class ListExpressionImpl<T extends List<E>, E>extends CollectionExpressionImpl<T, E> implements ListExpression<T, E> {
    public ListExpressionImpl(PersistableExpression exp, String str) {
        super(exp, str);
    }

    @Override
    public Expression<E> get(NumericExpression<Integer> posExpr) {
        return null;
    }

    @Override
    public Expression<E> get(int pos) {
        return null;
    }
}
