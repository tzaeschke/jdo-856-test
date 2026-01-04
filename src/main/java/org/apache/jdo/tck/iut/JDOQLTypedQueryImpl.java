package org.apache.jdo.tck.iut;

import org.datanucleus.api.jdo.query.BooleanExpressionImpl;
import org.datanucleus.api.jdo.query.CollectionExpressionImpl;
import org.datanucleus.api.jdo.query.ListExpressionImpl;
import org.datanucleus.api.jdo.query.MapExpressionImpl;

import javax.jdo.FetchPlan;
import javax.jdo.JDOQLTypedQuery;
import javax.jdo.JDOQLTypedSubquery;
import javax.jdo.PersistenceManager;
import javax.jdo.query.*;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class JDOQLTypedQueryImpl<T> implements JDOQLTypedQuery<T> {

    @Override
    public PersistableExpression<T> candidate() {
        return null;
    }

    @Override
    public <P> Expression<P> parameter(String name, Class<P> type) {
        return null;
    }

    @Override
    public StringExpression stringParameter(String name) {
        return null;
    }

    @Override
    public CharacterExpression characterParameter(String name) {
        return null;
    }

    @Override
    public NumericExpression<?> numericParameter(String name) {
        return null;
    }

    @Override
    public DateExpression dateParameter(String name) {
        return null;
    }

    @Override
    public TimeExpression timeParameter(String name) {
        return null;
    }

    @Override
    public DateTimeExpression datetimeParameter(String name) {
        return null;
    }

    @Override
    public CollectionExpression<?, ?> collectionParameter(String name) {
        return new CollectionExpressionImpl(null, name);
    }

    @Override
    public MapExpression<?, ?, ?> mapParameter(String name) {
        return new MapExpressionImpl(null, name);
    }

    @Override
    public ListExpression<?, ?> listParameter(String name) {
        return new ListExpressionImpl(null, name);
    }

    @Override
    public <V> Expression<V> variable(String name, Class<V> type) {
        return null;
    }

    @Override
    public JDOQLTypedQuery<T> setCandidates(Collection<T> candidates) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> excludeSubclasses() {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> includeSubclasses() {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> filter(BooleanExpression expr) {
        return this;
    }

    @Override
    public <V> IfThenElseExpression<V> ifThenElse(Class<V> type, BooleanExpression cond, Expression<V> thenValueExpr, Expression<V> elseValueExpr) {
        return null;
    }

    @Override
    public <V> IfThenElseExpression<V> ifThenElse(BooleanExpression cond, V thenValue, Expression<V> elseValueExpr) {
        return null;
    }

    @Override
    public <V> IfThenElseExpression<V> ifThenElse(BooleanExpression cond, Expression<V> thenValueExpr, V elseValue) {
        return null;
    }

    @Override
    public <V> IfThenElseExpression<V> ifThenElse(BooleanExpression cond, V thenValue, V elseValue) {
        return null;
    }

    @Override
    public <V> IfThenElseExpression<V> ifThen(Class<V> type, BooleanExpression cond, Expression<V> thenValueExpr) {
        return null;
    }

    @Override
    public <V> IfThenElseExpression<V> ifThen(BooleanExpression cond, V thenValue) {
        return null;
    }

    @Override
    public JDOQLTypedQuery<T> groupBy(Expression<?>... exprs) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> having(Expression<?> expr) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> orderBy(OrderExpression<?>... orderExprs) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> result(boolean distinct, Expression<?>... exprs) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> range(NumericExpression<?> lowerInclExpr, NumericExpression<?> upperExclExpr) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> range(long lowerIncl, long upperExcl) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> range(Expression<?> paramLowerInclExpr, Expression<?> paramUpperExclExpr) {
        return this;
    }

    @Override
    public JDOQLTypedSubquery<T> subquery(String candidateAlias) {
        return new JDOQLTypedSubqueryImpl<>();
    }

    @Override
    public <S> JDOQLTypedSubquery<S> subquery(Class<S> candidate, String candidateAlias) {
        return new JDOQLTypedSubqueryImpl<>();
    }

    @Override
    public <E> JDOQLTypedSubquery<E> subquery(CollectionExpression<Collection<E>, E> candidateCollection, Class<E> candidate, String candidateAlias) {
        return new JDOQLTypedSubqueryImpl<>();
    }

    @Override
    public JDOQLTypedQuery<T> setParameters(Map<String, ?> namedParamMap) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> setParameter(Expression<?> paramExpr, Object value) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> setParameter(String paramName, Object value) {
        return this;
    }

    @Override
    public List<T> executeList() {
        return List.of();
    }

    @Override
    public T executeUnique() {
        return null;
    }

    @Override
    public <R> List<R> executeResultList(Class<R> resultCls) {
        return List.of();
    }

    @Override
    public <R> R executeResultUnique(Class<R> resultCls) {
        return null;
    }

    @Override
    public List<Object> executeResultList() {
        return List.of();
    }

    @Override
    public Object executeResultUnique() {
        return null;
    }

    @Override
    public long deletePersistentAll() {
        return 0;
    }

    @Override
    public Integer getDatastoreReadTimeoutMillis() {
        return 0;
    }

    @Override
    public JDOQLTypedQuery<T> datastoreReadTimeoutMillis(Integer interval) {
        return this;
    }

    @Override
    public Integer getDatastoreWriteTimeoutMillis() {
        return 0;
    }

    @Override
    public JDOQLTypedQuery<T> datastoreWriteTimeoutMillis(Integer interval) {
        return this;
    }

    @Override
    public Boolean getSerializeRead() {
        return null;
    }

    @Override
    public JDOQLTypedQuery<T> serializeRead(Boolean serialize) {
        return this;
    }

    @Override
    public boolean isUnmodifiable() {
        return false;
    }

    @Override
    public JDOQLTypedQuery<T> unmodifiable() {
        return null;
    }

    @Override
    public boolean getIgnoreCache() {
        return false;
    }

    @Override
    public JDOQLTypedQuery<T> ignoreCache(boolean flag) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> extension(String key, Object value) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> extensions(Map values) {
        return this;
    }

    @Override
    public JDOQLTypedQuery<T> saveAsNamedQuery(String name) {
        return this;
    }

    @Override
    public PersistenceManager getPersistenceManager() {
        return null;
    }

    @Override
    public FetchPlan getFetchPlan() {
        return null;
    }

    @Override
    public void cancelAll() {

    }

    @Override
    public void cancel(Thread thread) {

    }

    @Override
    public void close(Object result) {

    }

    @Override
    public void closeAll() {

    }

    @Override
    public void close() throws IOException {

    }
}
