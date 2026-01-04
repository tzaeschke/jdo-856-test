package org.datanucleus.api.jdo.query;

import javax.jdo.query.*;

public class NumericExpressionImpl<T extends Number> extends ComparableExpressionImpl<Number> implements NumericExpression<Number> {
    public NumericExpressionImpl(PersistableExpression parent, String name) {
        super(parent, name);
    }

    @Override
    public NumericExpression<Number> add(Expression<Number> expr) {
        return null;
    }

    @Override
    public NumericExpression<Number> add(Number num) {
        return null;
    }

    @Override
    public NumericExpression<Number> sub(Expression<Number> expr) {
        return null;
    }

    @Override
    public NumericExpression<Number> sub(Number num) {
        return null;
    }

    @Override
    public NumericExpression<Number> mul(Expression<Number> expr) {
        return null;
    }

    @Override
    public NumericExpression<Number> mul(Number num) {
        return null;
    }

    @Override
    public NumericExpression<Number> div(Expression<Number> expr) {
        return null;
    }

    @Override
    public NumericExpression<Number> div(Number num) {
        return null;
    }

    @Override
    public NumericExpression<Number> mod(Expression<Number> expr) {
        return null;
    }

    @Override
    public NumericExpression<Number> mod(Number num) {
        return null;
    }

    @Override
    public NumericExpression<Number> neg() {
        return null;
    }

    @Override
    public NumericExpression<Number> com() {
        return null;
    }

    @Override
    public NumericExpression<Double> avg() {
        return null;
    }

    @Override
    public NumericExpression<Double> avgDistinct() {
        return null;
    }

    @Override
    public NumericExpression<Number> sum() {
        return null;
    }

    @Override
    public NumericExpression<Number> sumDistinct() {
        return null;
    }

    @Override
    public NumericExpression<Number> abs() {
        return null;
    }

    @Override
    public NumericExpression<Double> sqrt() {
        return null;
    }

    @Override
    public NumericExpression<Double> acos() {
        return null;
    }

    @Override
    public NumericExpression<Double> asin() {
        return null;
    }

    @Override
    public NumericExpression<Double> atan() {
        return null;
    }

    @Override
    public NumericExpression<Double> sin() {
        return null;
    }

    @Override
    public NumericExpression<Double> cos() {
        return null;
    }

    @Override
    public NumericExpression<Double> tan() {
        return null;
    }

    @Override
    public NumericExpression<Double> exp() {
        return null;
    }

    @Override
    public NumericExpression<Double> log() {
        return null;
    }

    @Override
    public NumericExpression<Number> ceil() {
        return null;
    }

    @Override
    public NumericExpression<Number> floor() {
        return null;
    }

    @Override
    public NumericExpression<Number> bAnd(NumericExpression<Number> bitExpr) {
        return null;
    }

    @Override
    public NumericExpression<Number> bOr(NumericExpression<Number> bitExpr) {
        return null;
    }

    @Override
    public NumericExpression<Number> bXor(NumericExpression<Number> bitExpr) {
        return null;
    }
}
