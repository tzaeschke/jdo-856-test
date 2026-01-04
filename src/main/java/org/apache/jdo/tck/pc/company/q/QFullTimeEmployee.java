package org.apache.jdo.tck.pc.company.q;

import org.apache.jdo.tck.pc.company.FullTimeEmployee;
import org.datanucleus.api.jdo.query.ExpressionType;
import org.datanucleus.api.jdo.query.NumericExpressionImpl;

import javax.jdo.query.NumericExpression;
import javax.jdo.query.PersistableExpression;

public class QFullTimeEmployee extends QEmployee
{
    public static final QFullTimeEmployee jdoCandidate = candidate("this");

    public static QFullTimeEmployee candidate(String name)
    {
        return new QFullTimeEmployee(null, name, 5);
    }

    public static QFullTimeEmployee candidate()
    {
        return jdoCandidate;
    }

    public static QFullTimeEmployee parameter(String name)
    {
        return new QFullTimeEmployee(FullTimeEmployee.class, name, ExpressionType.PARAMETER);
    }

    public static QFullTimeEmployee variable(String name)
    {
        return new QFullTimeEmployee(FullTimeEmployee.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Double> salary;

    public QFullTimeEmployee(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.salary = new NumericExpressionImpl(this, "salary");
    }

    public QFullTimeEmployee(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.salary = new NumericExpressionImpl(this, "salary");
    }
}
