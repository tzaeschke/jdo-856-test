package org.apache.jdo.tck.pc.company.q;

import org.apache.jdo.tck.pc.company.MeetingRoom;
import org.datanucleus.api.jdo.query.ExpressionType;
import org.datanucleus.api.jdo.query.NumericExpressionImpl;
import org.datanucleus.api.jdo.query.PersistableExpressionImpl;
import org.datanucleus.api.jdo.query.StringExpressionImpl;

import javax.jdo.query.NumericExpression;
import javax.jdo.query.PersistableExpression;
import javax.jdo.query.StringExpression;

public class QMeetingRoom extends PersistableExpressionImpl<MeetingRoom> implements PersistableExpression<MeetingRoom>
{
    public static final QMeetingRoom jdoCandidate = candidate("this");

    public static QMeetingRoom candidate(String name)
    {
        return new QMeetingRoom(null, name, 5);
    }

    public static QMeetingRoom candidate()
    {
        return jdoCandidate;
    }

    public static QMeetingRoom parameter(String name)
    {
        return new QMeetingRoom(MeetingRoom.class, name, ExpressionType.PARAMETER);
    }

    public static QMeetingRoom variable(String name)
    {
        return new QMeetingRoom(MeetingRoom.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Long> roomid;
    public final StringExpression name;

    public QMeetingRoom(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.roomid = new NumericExpressionImpl(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }

    public QMeetingRoom(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.roomid = new NumericExpressionImpl(this, "roomid");
        this.name = new StringExpressionImpl(this, "name");
    }
}
