package org.datanucleus.api.jdo.query;

import javax.jdo.query.DateTimeExpression;
import javax.jdo.query.NumericExpression;
import javax.jdo.query.PersistableExpression;
import java.util.Date;

public class DateTimeExpressionImpl extends ComparableExpressionImpl<Date> implements DateTimeExpression {
    public DateTimeExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }

    @Override
    public NumericExpression<Integer> getYear() {
        return null;
    }

    @Override
    public NumericExpression<Integer> getMonth() {
        return null;
    }

    @Override
    public NumericExpression<Integer> getDay() {
        return null;
    }

    @Override
    public NumericExpression<Integer> getHour() {
        return null;
    }

    @Override
    public NumericExpression<Integer> getMinute() {
        return null;
    }

    @Override
    public NumericExpression<Integer> getSecond() {
        return null;
    }
}
