package org.apache.jdo.tck.iut;

import javax.jdo.query.*;

public class JDOQLTypedSubqueryImpl<T> implements javax.jdo.JDOQLTypedSubquery<T> {
    @Override
    public PersistableExpression<T> candidate() {
        return null;
    }

    @Override
    public javax.jdo.JDOQLTypedSubquery<T> filter(BooleanExpression expr) {
        return null;
    }

    @Override
    public javax.jdo.JDOQLTypedSubquery<T> groupBy(Expression<?>... exprs) {
        return null;
    }

    @Override
    public javax.jdo.JDOQLTypedSubquery<T> having(Expression<?> expr) {
        return null;
    }

    @Override
    public <S> NumericExpression<S> selectUnique(NumericExpression<S> expr) {
        return null;
    }

    @Override
    public StringExpression selectUnique(StringExpression expr) {
        return null;
    }

    @Override
    public DateExpression selectUnique(DateExpression expr) {
        return null;
    }

    @Override
    public DateTimeExpression selectUnique(DateTimeExpression expr) {
        return null;
    }

    @Override
    public TimeExpression selectUnique(TimeExpression expr) {
        return null;
    }

    @Override
    public CharacterExpression selectUnique(CharacterExpression expr) {
        return null;
    }

    @Override
    public CollectionExpression<?, ?> select(CollectionExpression<?, ?> expr) {
        return null;
    }
}
