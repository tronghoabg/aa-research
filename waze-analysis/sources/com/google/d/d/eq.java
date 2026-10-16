package com.google.d.d;

import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class eq<T> implements Comparator<T> {
    protected eq() {
    }

    public static eq c(Comparator comparator) {
        return comparator instanceof eq ? (eq) comparator : new ap(comparator);
    }

    public static eq d() {
        return eo.f7570a;
    }

    public eq a() {
        return new fe(this);
    }

    public final eq b(Comparator comparator) {
        return new at(this, comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public final eq e(com.google.d.b.t tVar) {
        return new ad(tVar, this);
    }
}
