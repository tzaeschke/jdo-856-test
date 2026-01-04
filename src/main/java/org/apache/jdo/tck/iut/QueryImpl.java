package org.apache.jdo.tck.iut;

import javax.jdo.Extent;
import javax.jdo.FetchPlan;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class QueryImpl<T> implements Query<T> {

    private Object result = List.of();

    @Override
    public void setClass(Class<T> cls) {

    }

    @Override
    public void setCandidates(Extent<T> pcs) {

    }

    @Override
    public void setCandidates(Collection<T> pcs) {

    }

    @Override
    public void setFilter(String filter) {

    }

    @Override
    public void declareImports(String imports) {

    }

    @Override
    public void declareParameters(String parameters) {

    }

    @Override
    public void declareVariables(String variables) {

    }

    @Override
    public void setOrdering(String ordering) {

    }

    @Override
    public void setIgnoreCache(boolean ignoreCache) {

    }

    @Override
    public boolean getIgnoreCache() {
        return false;
    }

    @Override
    public void compile() {

    }

    @Override
    public Object execute() {
        return result;
    }

    @Override
    public Object execute(Object p1) {
        return execute();
    }

    @Override
    public Object execute(Object p1, Object p2) {
        return null;
    }

    @Override
    public Object execute(Object p1, Object p2, Object p3) {
        return execute();
    }

    @Override
    public Object executeWithMap(Map parameters) {
        return execute();
    }

    @Override
    public Object executeWithArray(Object... parameters) {
        return execute();
    }

    @Override
    public PersistenceManager getPersistenceManager() {
        return null;
    }

    @Override
    public void close(Object queryResult) {

    }

    @Override
    public void closeAll() {

    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public void setGrouping(String group) {

    }

    @Override
    public void setUnique(boolean unique) {

    }

    @Override
    public void setResult(String data) {
        if (data.equals("salary")) {
            result = 1.0;
        } else        if (data.equals("avg(salary)")) {
            result = 1.0;
        } else if (data.equals("avg(salary), sum(salary)")) {
            result = new Object[1];
        }
    }

    @Override
    public void setResultClass(Class cls) {

    }

    @Override
    public void setRange(long fromIncl, long toExcl) {

    }

    @Override
    public void setRange(String fromInclToExcl) {

    }

    @Override
    public void addExtension(String key, Object value) {

    }

    @Override
    public void setExtensions(Map extensions) {

    }

    @Override
    public FetchPlan getFetchPlan() {
        return null;
    }

    @Override
    public long deletePersistentAll(Object... parameters) {
        return 0;
    }

    @Override
    public long deletePersistentAll(Map parameters) {
        return 0;
    }

    @Override
    public long deletePersistentAll() {
        return 0;
    }

    @Override
    public void setUnmodifiable() {

    }

    @Override
    public boolean isUnmodifiable() {
        return false;
    }

    @Override
    public void addSubquery(Query sub, String variableDeclaration, String candidateCollectionExpression) {

    }

    @Override
    public void addSubquery(Query sub, String variableDeclaration, String candidateCollectionExpression, String parameter) {

    }

    @Override
    public void addSubquery(Query sub, String variableDeclaration, String candidateCollectionExpression, String... parameters) {

    }

    @Override
    public void addSubquery(Query sub, String variableDeclaration, String candidateCollectionExpression, Map parameters) {

    }

    @Override
    public void setDatastoreReadTimeoutMillis(Integer interval) {

    }

    @Override
    public Integer getDatastoreReadTimeoutMillis() {
        return 0;
    }

    @Override
    public void setDatastoreWriteTimeoutMillis(Integer interval) {

    }

    @Override
    public Integer getDatastoreWriteTimeoutMillis() {
        return 0;
    }

    @Override
    public void cancelAll() {

    }

    @Override
    public void cancel(Thread thread) {

    }

    @Override
    public void setSerializeRead(Boolean serialize) {

    }

    @Override
    public Boolean getSerializeRead() {
        return null;
    }

    @Override
    public Query<T> saveAsNamedQuery(String name) {
        return null;
    }

    @Override
    public Query<T> filter(String filter) {
        return null;
    }

    @Override
    public Query<T> orderBy(String ordering) {
        return null;
    }

    @Override
    public Query<T> groupBy(String group) {
        return null;
    }

    @Override
    public Query<T> result(String result) {
        return null;
    }

    @Override
    public Query<T> range(long fromIncl, long toExcl) {
        return null;
    }

    @Override
    public Query<T> range(String fromInclToExcl) {
        return null;
    }

    @Override
    public Query<T> subquery(Query sub, String variableDeclaration, String candidateCollectionExpression) {
        return null;
    }

    @Override
    public Query<T> subquery(Query sub, String variableDeclaration, String candidateCollectionExpression, String parameter) {
        return null;
    }

    @Override
    public Query<T> subquery(Query sub, String variableDeclaration, String candidateCollectionExpression, String... parameters) {
        return null;
    }

    @Override
    public Query<T> subquery(Query sub, String variableDeclaration, String candidateCollectionExpression, Map parameters) {
        return null;
    }

    @Override
    public Query<T> imports(String imports) {
        return null;
    }

    @Override
    public Query<T> parameters(String parameters) {
        return null;
    }

    @Override
    public Query<T> variables(String variables) {
        return null;
    }

    @Override
    public Query<T> datastoreReadTimeoutMillis(Integer interval) {
        return null;
    }

    @Override
    public Query<T> datastoreWriteTimeoutMillis(Integer interval) {
        return null;
    }

    @Override
    public Query<T> serializeRead(Boolean serialize) {
        return null;
    }

    @Override
    public Query<T> unmodifiable() {
        return null;
    }

    @Override
    public Query<T> ignoreCache(boolean flag) {
        return null;
    }

    @Override
    public Query<T> extension(String key, Object value) {
        return null;
    }

    @Override
    public Query<T> extensions(Map values) {
        return null;
    }

    @Override
    public Query<T> setNamedParameters(Map<String, ?> namedParamMap) {
        return null;
    }

    @Override
    public Query<T> setParameters(Object... paramValues) {
        return null;
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
        return List.of(new Object[0]);
    }

    @Override
    public Object executeResultUnique() {
        return null;
    }
}
