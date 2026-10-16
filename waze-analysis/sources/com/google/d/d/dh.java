package com.google.d.d;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class dh<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final List f7536a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.d.b.t f7537b;

    dh(List list, com.google.d.b.t tVar) {
        com.google.d.b.an.B(list);
        this.f7536a = list;
        this.f7537b = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final T get(int i2) {
        return (T) this.f7537b.apply(this.f7536a.get(i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7536a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i2) {
        return new dg(this, this.f7536a.listIterator(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i2) {
        return (T) this.f7537b.apply(this.f7536a.remove(i2));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        this.f7536a.subList(i2, i3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7536a.size();
    }
}
