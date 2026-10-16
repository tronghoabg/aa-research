package com.google.d.d;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class dj<F, T> extends AbstractSequentialList<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final List f7539a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.d.b.t f7540b;

    dj(List list, com.google.d.b.t tVar) {
        com.google.d.b.an.B(list);
        this.f7539a = list;
        this.f7540b = tVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7539a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i2) {
        return new di(this, this.f7539a.listIterator(i2));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        this.f7539a.subList(i2, i3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7539a.size();
    }
}
