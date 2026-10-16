package com.google.protobuf;

import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class Z1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public ListIterator f27642a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f27642a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27642a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f27642a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27642a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f27642a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27642a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
