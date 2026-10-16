package com.google.v.b;

import h.g.b.x;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f<E> implements ListIterator<E>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ListIterator f12691a;

    public f(ListIterator listIterator) {
        x.f(listIterator, "delegate");
        this.f12691a = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12691a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12691a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        return (E) this.f12691a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12691a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        return (E) this.f12691a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12691a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
