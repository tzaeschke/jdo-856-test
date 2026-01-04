package org.apache.jdo.tck.iut;

import javax.jdo.FetchGroup;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.datastore.DataStoreCache;
import javax.jdo.listener.InstanceLifecycleListener;
import javax.jdo.metadata.JDOMetadata;
import javax.jdo.metadata.TypeMetadata;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class PersistenceManagerFactoryImpl implements PersistenceManagerFactory {

    private final PersistenceManager pm = new PersistenceManagerImpl();

    @Override
    public void close() {

    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public PersistenceManager getPersistenceManager() {
        return pm;
    }

    @Override
    public PersistenceManager getPersistenceManagerProxy() {
        return null;
    }

    @Override
    public PersistenceManager getPersistenceManager(String userid, String password) {
        return null;
    }

    @Override
    public void setConnectionUserName(String userName) {

    }

    @Override
    public String getConnectionUserName() {
        return "";
    }

    @Override
    public void setConnectionPassword(String password) {

    }

    @Override
    public void setConnectionURL(String url) {

    }

    @Override
    public String getConnectionURL() {
        return "";
    }

    @Override
    public void setConnectionDriverName(String driverName) {

    }

    @Override
    public String getConnectionDriverName() {
        return "";
    }

    @Override
    public void setConnectionFactoryName(String connectionFactoryName) {

    }

    @Override
    public String getConnectionFactoryName() {
        return "";
    }

    @Override
    public void setConnectionFactory(Object connectionFactory) {

    }

    @Override
    public Object getConnectionFactory() {
        return null;
    }

    @Override
    public void setConnectionFactory2Name(String connectionFactoryName) {

    }

    @Override
    public String getConnectionFactory2Name() {
        return "";
    }

    @Override
    public void setConnectionFactory2(Object connectionFactory) {

    }

    @Override
    public Object getConnectionFactory2() {
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
    public void setMapping(String mapping) {

    }

    @Override
    public String getMapping() {
        return "";
    }

    @Override
    public void setOptimistic(boolean flag) {

    }

    @Override
    public boolean getOptimistic() {
        return false;
    }

    @Override
    public void setRetainValues(boolean flag) {

    }

    @Override
    public boolean getRetainValues() {
        return false;
    }

    @Override
    public void setRestoreValues(boolean restoreValues) {

    }

    @Override
    public boolean getRestoreValues() {
        return false;
    }

    @Override
    public void setNontransactionalRead(boolean flag) {

    }

    @Override
    public boolean getNontransactionalRead() {
        return false;
    }

    @Override
    public void setNontransactionalWrite(boolean flag) {

    }

    @Override
    public boolean getNontransactionalWrite() {
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
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setPersistenceUnitName(String name) {

    }

    @Override
    public String getPersistenceUnitName() {
        return "";
    }

    @Override
    public void setServerTimeZoneID(String timezoneid) {

    }

    @Override
    public String getServerTimeZoneID() {
        return "";
    }

    @Override
    public void setTransactionType(String name) {

    }

    @Override
    public String getTransactionType() {
        return "";
    }

    @Override
    public boolean getReadOnly() {
        return false;
    }

    @Override
    public void setReadOnly(boolean flag) {

    }

    @Override
    public String getTransactionIsolationLevel() {
        return "";
    }

    @Override
    public void setTransactionIsolationLevel(String level) {

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
    public Properties getProperties() {
        return null;
    }

    @Override
    public Collection<String> supportedOptions() {
        return List.of();
    }

    @Override
    public DataStoreCache getDataStoreCache() {
        return null;
    }

    @Override
    public void addInstanceLifecycleListener(InstanceLifecycleListener listener, Class[] classes) {

    }

    @Override
    public void removeInstanceLifecycleListener(InstanceLifecycleListener listener) {

    }

    @Override
    public void addFetchGroups(FetchGroup... groups) {

    }

    @Override
    public void removeFetchGroups(FetchGroup... groups) {

    }

    @Override
    public void removeAllFetchGroups() {

    }

    @Override
    public FetchGroup getFetchGroup(Class cls, String name) {
        return null;
    }

    @Override
    public Set getFetchGroups() {
        return Set.of();
    }

    @Override
    public void registerMetadata(JDOMetadata metadata) {

    }

    @Override
    public JDOMetadata newMetadata() {
        return null;
    }

    @Override
    public TypeMetadata getMetadata(String className) {
        return null;
    }

    @Override
    public Collection<Class> getManagedClasses() {
        return List.of();
    }
}
