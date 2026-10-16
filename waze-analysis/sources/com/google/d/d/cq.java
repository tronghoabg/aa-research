package com.google.d.d;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class cq<E> extends ci<E> implements NavigableSet<E>, SortedSet<E>, fn {
    private static final long serialVersionUID = 912559;

    /* renamed from: a, reason: collision with root package name */
    final transient Comparator f7508a;

    /* renamed from: b, reason: collision with root package name */
    transient cq f7509b;

    cq(Comparator comparator) {
        this.f7508a = comparator;
    }

    static fc E(Comparator comparator) {
        if (eo.f7570a.equals(comparator)) {
            return fc.f7615c;
        }
        int i2 = bn.f7456d;
        return new fc(es.f7582a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static cq z() {
        return fc.f7615c;
    }

    @Override // java.util.NavigableSet
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final cq subSet(Object obj, boolean z, Object obj2, boolean z2) {
        com.google.d.b.an.B(obj);
        com.google.d.b.an.B(obj2);
        com.google.d.b.an.l(this.f7508a.compare(obj, obj2) <= 0);
        return B(obj, z, obj2, z2);
    }

    abstract cq B(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final cq tailSet(Object obj, boolean z) {
        com.google.d.b.an.B(obj);
        return D(obj, z);
    }

    abstract cq D(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract fu descendingIterator();

    final int a(Object obj, Object obj2) {
        return this.f7508a.compare(obj, obj2);
    }

    @Deprecated
    public final void addFirst(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return fo.P(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.d.d.fn
    public final Comparator comparator() {
        return this.f7508a;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return listIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return fo.I(headSet(obj, true).descendingIterator(), null);
    }

    public final E getFirst() {
        return (E) first();
    }

    public final E getLast() {
        return (E) last();
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public abstract fu listIterator();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return fo.P(tailSet(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return fo.I(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    abstract cq v();

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final cq descendingSet() {
        cq cqVar = this.f7509b;
        if (cqVar != null) {
            return cqVar;
        }
        cq cqVarV = v();
        this.f7509b = cqVarV;
        cqVarV.f7509b = this;
        return cqVarV;
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return new cp(this.f7508a, toArray());
    }

    @Override // java.util.NavigableSet
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final cq headSet(Object obj, boolean z) {
        com.google.d.b.an.B(obj);
        return y(obj, z);
    }

    abstract cq y(Object obj, boolean z);
}
