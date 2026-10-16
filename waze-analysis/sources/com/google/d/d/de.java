package com.google.d.d;

import j$.util.Objects;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class de implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    boolean f7531a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ListIterator f7532b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ df f7533c;

    de(df dfVar, ListIterator listIterator) {
        this.f7532b = listIterator;
        Objects.requireNonNull(dfVar);
        this.f7533c = dfVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f7532b;
        listIterator.add(obj);
        listIterator.previous();
        this.f7531a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7532b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7532b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7531a = true;
        return this.f7532b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7533c.d(this.f7532b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f7531a = true;
        return this.f7532b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        fo.ag(this.f7531a);
        this.f7532b.remove();
        this.f7531a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        com.google.d.b.an.u(this.f7531a);
        this.f7532b.set(obj);
    }
}
