package org.datanucleus.api.jdo.query;

import org.apache.jdo.tck.pc.company.QPerson;

import javax.jdo.query.*;
import java.util.Map;

public class MapExpressionImpl<T extends Map<K, V>, K, V> extends ExpressionImpl<T> implements MapExpression<T, K, V> {
    public MapExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }

    @Override
    public Expression<V> get(Expression<K> key) {
        return null;
    }

    @Override
    public Expression<V> get(K key) {
        return null;
    }

    @Override
    public BooleanExpression containsKey(Expression<K> expr) {
        return null;
    }

    @Override
    public BooleanExpression containsKey(K key) {
        return null;
    }

    @Override
    public BooleanExpression containsValue(Expression<V> expr) {
        return null;
    }

    @Override
    public BooleanExpression containsValue(V value) {
        return null;
    }

    @Override
    public BooleanExpression containsEntry(Expression<Map.Entry<K, V>> expr) {
        return null;
    }

    @Override
    public BooleanExpression containsEntry(Map.Entry<K, V> entry) {
        return null;
    }

    @Override
    public BooleanExpression isEmpty() {
        return null;
    }

    @Override
    public NumericExpression<Integer> size() {
        return null;
    }
}
