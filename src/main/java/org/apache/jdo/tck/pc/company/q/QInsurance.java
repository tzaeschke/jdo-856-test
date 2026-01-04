package org.apache.jdo.tck.pc.company.q;

import org.apache.jdo.tck.pc.company.Insurance;
import org.datanucleus.api.jdo.query.ExpressionType;
import org.datanucleus.api.jdo.query.NumericExpressionImpl;
import org.datanucleus.api.jdo.query.PersistableExpressionImpl;
import org.datanucleus.api.jdo.query.StringExpressionImpl;

import javax.jdo.query.NumericExpression;
import javax.jdo.query.PersistableExpression;
import javax.jdo.query.StringExpression;

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
