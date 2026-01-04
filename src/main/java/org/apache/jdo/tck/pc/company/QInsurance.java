package org.apache.jdo.tck.pc.company;

import org.datanucleus.api.jdo.query.PersistableExpressionImpl;
import org.datanucleus.api.jdo.query.*;

import javax.jdo.query.*;

public class QInsurance extends PersistableExpressionImpl<Insurance> implements PersistableExpression<Insurance>
{
    public static final QInsurance jdoCandidate = candidate("this");

    public static QInsurance candidate(String name)
    {
        return new QInsurance(null, name, 5);
    }

    public static QInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QInsurance parameter(String name)
    {
        return new QInsurance(Insurance.class, name, ExpressionType.PARAMETER);
    }

    public static QInsurance variable(String name)
    {
        return new QInsurance(Insurance.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> insid;
    public final StringExpression carrier;
    public final QEmployee employee;

    public QInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.insid = new NumericExpressionImpl(this, "insid");
        this.carrier = new StringExpressionImpl(this, "carrier");
        if (depth > 0)
        {
            this.employee = new QEmployee(this, "employee", depth-1);
        }
        else
        {
            this.employee = null;
        }
    }

    public QInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.insid = new NumericExpressionImpl(this, "insid");
        this.carrier = new StringExpressionImpl(this, "carrier");
        this.employee = new QEmployee(this, "employee", 5);
    }
}
