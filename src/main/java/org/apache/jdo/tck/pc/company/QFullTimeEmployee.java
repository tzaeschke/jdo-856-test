package org.apache.jdo.tck.pc.company;

import org.datanucleus.api.jdo.query.*;

import javax.jdo.query.*;

public class QFullTimeEmployee extends org.apache.jdo.tck.pc.company.QEmployee
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
