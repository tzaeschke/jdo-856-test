package org.apache.jdo.tck.iut;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;
import javax.transaction.Synchronization;

public class TransactionImpl implements Transaction {
    @Override
    public void begin() {

    }

    @Override
    public void commit() {

    }

    @Override
    public void rollback() {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public boolean getRollbackOnly() {
        return false;
    }

    @Override
    public void setRollbackOnly() {

    }

    @Override
    public void setNontransactionalRead(boolean nontransactionalRead) {

    }

    @Override
    public boolean getNontransactionalRead() {
        return false;
    }

    @Override
    public void setNontransactionalWrite(boolean nontransactionalWrite) {

    }

    @Override
    public boolean getNontransactionalWrite() {
        return false;
    }

    @Override
    public void setRetainValues(boolean retainValues) {

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
    public void setOptimistic(boolean optimistic) {

    }

    @Override
    public boolean getOptimistic() {
        return false;
    }

    @Override
    public String getIsolationLevel() {
        return "";
    }

    @Override
    public void setIsolationLevel(String level) {

    }

    @Override
    public void setSynchronization(Synchronization sync) {

    }

    @Override
    public Synchronization getSynchronization() {
        return null;
    }

    @Override
    public PersistenceManager getPersistenceManager() {
        return null;
    }

    @Override
    public void setSerializeRead(Boolean serialize) {

    }

    @Override
    public Boolean getSerializeRead() {
        return null;
    }
}
