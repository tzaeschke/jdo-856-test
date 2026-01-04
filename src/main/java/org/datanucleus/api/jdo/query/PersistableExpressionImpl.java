package org.datanucleus.api.jdo.query;

import javax.jdo.query.Expression;
import javax.jdo.query.PersistableExpression;

public class PersistableExpressionImpl<T> extends ExpressionImpl<T> implements PersistableExpression<T> {
    public PersistableExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);

    }

    public PersistableExpressionImpl(Class type, String name, ExpressionType exprType) {
        super(type, name, exprType);
    }

    @Override
    public Expression jdoObjectId() {
        return null;
    }

    @Override
    public Expression jdoVersion() {
        return null;
    }
}
