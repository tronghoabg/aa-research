package com.google.d.d;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class fv<E> extends fu<E> implements ListIterator<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f7629a;

    /* renamed from: b, reason: collision with root package name */
    private int f7630b;

    fv(int i2, int i3) {
        com.google.d.b.an.E(i3, i2);
        this.f7629a = i2;
        this.f7630b = i3;
    }

    abstract Object a(int i2);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7630b < this.f7629a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7630b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f7630b;
        this.f7630b = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7630b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f7630b - 1;
        this.f7630b = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7630b - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}
