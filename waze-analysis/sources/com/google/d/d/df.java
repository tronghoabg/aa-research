package com.google.d.d;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class df<T> extends AbstractList<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List f7534a;

    df(List list) {
        com.google.d.b.an.B(list);
        this.f7534a = list;
    }

    private final int c(int i2) {
        int size = size();
        com.google.d.b.an.A(i2, size);
        return (size - 1) - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(int i2) {
        int size = size();
        com.google.d.b.an.E(i2, size);
        return size - i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, T t) {
        this.f7534a.add(d(i2), t);
    }

    final List b() {
        return this.f7534a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f7534a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i2) {
        return (T) this.f7534a.get(c(i2));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i2) {
        return new de(this, this.f7534a.listIterator(d(i2)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i2) {
        return (T) this.f7534a.remove(c(i2));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        subList(i2, i3).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i2, T t) {
        return (T) this.f7534a.set(c(i2), t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7534a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<T> subList(int i2, int i3) {
        com.google.d.b.an.t(i2, i3, size());
        return fo.F(this.f7534a.subList(d(i3), d(i2)));
    }
}
