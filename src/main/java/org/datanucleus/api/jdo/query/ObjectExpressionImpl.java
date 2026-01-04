package org.datanucleus.api.jdo.query;

import org.apache.jdo.tck.pc.company.Address;
import org.apache.jdo.tck.pc.company.QPerson;

import javax.jdo.query.ObjectExpression;
import javax.jdo.query.PersistableExpression;

public class ObjectExpressionImpl<T> extends ExpressionImpl<T> implements ObjectExpression<T> {
    public ObjectExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }
}
