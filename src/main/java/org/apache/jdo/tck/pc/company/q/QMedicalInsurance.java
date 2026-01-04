package org.apache.jdo.tck.pc.company.q;

import org.apache.jdo.tck.pc.company.MedicalInsurance;
import org.datanucleus.api.jdo.query.ExpressionType;
import org.datanucleus.api.jdo.query.StringExpressionImpl;

import javax.jdo.query.PersistableExpression;
import javax.jdo.query.StringExpression;

public class QMedicalInsurance extends QInsurance
{
    public static final QMedicalInsurance jdoCandidate = candidate("this");

    public static QMedicalInsurance candidate(String name)
    {
        return new QMedicalInsurance(null, name, 5);
    }

    public static QMedicalInsurance candidate()
    {
        return jdoCandidate;
    }

    public static QMedicalInsurance parameter(String name)
    {
        return new QMedicalInsurance(MedicalInsurance.class, name, ExpressionType.PARAMETER);
    }

    public static QMedicalInsurance variable(String name)
    {
        return new QMedicalInsurance(MedicalInsurance.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression planType;

    public QMedicalInsurance(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.planType = new StringExpressionImpl(this, "planType");
    }

    public QMedicalInsurance(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.planType = new StringExpressionImpl(this, "planType");
    }
}
