package org.apache.jdo.tck.iut;

import javax.jdo.*;
import javax.jdo.datastore.JDOConnection;
import javax.jdo.datastore.Sequence;
import javax.jdo.listener.InstanceLifecycleListener;
import java.util.*;

public class PersistenceManagerImpl implements PersistenceManager {

    private final Transaction tx = new TransactionImpl();

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public void close() {

    }

    @Override
    public Transaction currentTransaction() {
        return tx;
    }

    @Override
    public void evict(Object pc) {

    }

    @Override
    public void evictAll(Object... pcs) {

    }

    @Override
    public void evictAll(Collection pcs) {

    }

    @Override
    public void evictAll(boolean subclasses, Class pcClass) {

    }

    @Override
    public void evictAll() {

    }

    @Override
    public void refresh(Object pc) {

    }

    @Override
    public void refreshAll(Object... pcs) {

    }

    @Override
    public void refreshAll(Collection pcs) {

    }

    @Override
    public void refreshAll() {

    }

    @Override
    public void refreshAll(JDOException jdoe) {

    }

    @Override
    public Query newQuery() {
        return new QueryImpl<>();
    }

    @Override
    public Query newQuery(Object compiled) {
        return new QueryImpl<>();
    }

    @Override
    public Query newQuery(String query) {
        return new QueryImpl<>();
    }

    @Override
    public Query newQuery(String language, Object query) {
        return new QueryImpl<>();
    }

    @Override
    public <T> Query<T> newQuery(Class<T> cls) {
        return new QueryImpl<>();
    }

    @Override
    public <T> Query<T> newQuery(Extent<T> cln) {
        return new QueryImpl<>();
    }

    @Override
    public <T> Query<T> newQuery(Class<T> cls, Collection<T> cln) {
        return new QueryImpl<>();
    }

    @Override
    public <T> Query<T> newQuery(Class<T> cls, String filter) {
        return new QueryImpl<>();
    }

    @Override
    public <T> Query<T> newQuery(Class<T> cls, Collection<T> cln, String filter) {
        return new QueryImpl<>();
    }

    @Override
    public <T> Query<T> newQuery(Extent<T> cln, String filter) {
        return new QueryImpl<>();
    }

    @Override
    public <T> JDOQLTypedQuery<T> newJDOQLTypedQuery(Class<T> cls) {
        return new JDOQLTypedQueryImpl<>();
    }

    @Override
    public <T> Query<T> newNamedQuery(Class<T> cls, String queryName) {
        return new QueryImpl<>();
    }

    @Override
    public <T> Extent<T> getExtent(Class<T> persistenceCapableClass, boolean subclasses) {
        return null;
    }

    @Override
    public <T> Extent<T> getExtent(Class<T> persistenceCapableClass) {
        return null;
    }

    @Override
    public Object getObjectById(Object oid, boolean validate) {
        return null;
    }

    @Override
    public <T> T getObjectById(Class<T> cls, Object key) {
        return null;
    }

    @Override
    public Object getObjectById(Object oid) {
        return null;
    }

    @Override
    public Object getObjectId(Object pc) {
        return null;
    }

    @Override
    public Object getTransactionalObjectId(Object pc) {
        return null;
    }

    @Override
    public Object newObjectIdInstance(Class pcClass, Object key) {
        return null;
    }

    @Override
    public Collection getObjectsById(Collection oids, boolean validate) {
        return List.of();
    }

    @Override
    public Collection getObjectsById(Collection oids) {
        return List.of();
    }

    @Override
    public Object[] getObjectsById(boolean validate, Object... oids) {
        return new Object[0];
    }

    @Override
    public Object[] getObjectsById(Object... oids) {
        return new Object[0];
    }

    @Override
    public <T> T makePersistent(T pc) {
        return null;
    }

    @Override
    public <T> T[] makePersistentAll(T... pcs) {
        return null;
    }

    @Override
    public <T> Collection<T> makePersistentAll(Collection<T> pcs) {
        return List.of();
    }

    @Override
    public void deletePersistent(Object pc) {

    }

    @Override
    public void deletePersistentAll(Object... pcs) {

    }

    @Override
    public void deletePersistentAll(Collection pcs) {

    }

    @Override
    public void makeTransient(Object pc) {

    }

    @Override
    public void makeTransientAll(Object... pcs) {

    }

    @Override
    public void makeTransientAll(Collection pcs) {

    }

    @Override
    public void makeTransient(Object pc, boolean useFetchPlan) {

    }

    @Override
    public void makeTransientAll(boolean useFetchPlan, Object... pcs) {

    }

    @Override
    public void makeTransientAll(Collection pcs, boolean useFetchPlan) {

    }

    @Override
    public void makeTransactional(Object pc) {

    }

    @Override
    public void makeTransactionalAll(Object... pcs) {

    }

    @Override
    public void makeTransactionalAll(Collection pcs) {

    }

    @Override
    public void makeNontransactional(Object pc) {

    }

    @Override
    public void makeNontransactionalAll(Object... pcs) {

    }

    @Override
    public void makeNontransactionalAll(Collection pcs) {

    }

    @Override
    public void retrieve(Object pc) {

    }

    @Override
    public void retrieve(Object pc, boolean useFetchPlan) {

    }

    @Override
    public void retrieveAll(Collection pcs) {

    }

    @Override
    public void retrieveAll(Collection pcs, boolean useFetchPlan) {

    }

    @Override
    public void retrieveAll(Object... pcs) {

    }

    @Override
    public void retrieveAll(boolean useFetchPlan, Object... pcs) {

    }

    @Override
    public void setUserObject(Object o) {

    }

    @Override
    public Object getUserObject() {
        return null;
    }

    @Override
    public PersistenceManagerFactory getPersistenceManagerFactory() {
        return null;
    }

    @Override
    public Class getObjectIdClass(Class cls) {
        return null;
    }

    @Override
    public void setMultithreaded(boolean flag) {

    }

    @Override
    public boolean getMultithreaded() {
        return false;
    }

    @Override
    public void setIgnoreCache(boolean flag) {

    }

    @Override
    public boolean getIgnoreCache() {
        return false;
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
    public boolean getDetachAllOnCommit() {
        return false;
    }

    @Override
    public void setDetachAllOnCommit(boolean flag) {

    }

    @Override
    public boolean getCopyOnAttach() {
        return false;
    }

    @Override
    public void setCopyOnAttach(boolean flag) {

    }

    @Override
    public <T> T detachCopy(T pc) {
        return null;
    }

    @Override
    public <T> Collection<T> detachCopyAll(Collection<T> pcs) {
        return List.of();
    }

    @Override
    public <T> T[] detachCopyAll(T... pcs) {
        return null;
    }

    @Override
    public Object putUserObject(Object key, Object val) {
        return null;
    }

    @Override
    public Object getUserObject(Object key) {
        return null;
    }

    @Override
    public Object removeUserObject(Object key) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public void checkConsistency() {

    }

    @Override
    public FetchPlan getFetchPlan() {
        return null;
    }

    @Override
    public <T> T newInstance(Class<T> pcClass) {
        return null;
    }

    @Override
    public Sequence getSequence(String name) {
        return null;
    }

    @Override
    public JDOConnection getDataStoreConnection() {
        return null;
    }

    @Override
    public void addInstanceLifecycleListener(InstanceLifecycleListener listener, Class... classes) {

    }

    @Override
    public void removeInstanceLifecycleListener(InstanceLifecycleListener listener) {

    }

    @Override
    public Date getServerDate() {
        return null;
    }

    @Override
    public Set getManagedObjects() {
        return Set.of();
    }

    @Override
    public Set getManagedObjects(EnumSet<ObjectState> states) {
        return Set.of();
    }

    @Override
    public Set getManagedObjects(Class... classes) {
        return Set.of();
    }

    @Override
    public Set getManagedObjects(EnumSet<ObjectState> states, Class... classes) {
        return Set.of();
    }

    @Override
    public FetchGroup getFetchGroup(Class cls, String name) {
        return null;
    }

    @Override
    public void setProperty(String propertyName, Object value) {

    }

    @Override
    public Map<String, Object> getProperties() {
        return Map.of();
    }

    @Override
    public Set<String> getSupportedProperties() {
        return Set.of();
    }
}
