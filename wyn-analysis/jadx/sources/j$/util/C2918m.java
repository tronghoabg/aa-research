package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* renamed from: j$.util.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2918m implements ListIterator, InterfaceC3058y {

    /* renamed from: a, reason: collision with root package name */
    private final ListIterator f37924a;

    C2918m(C2919n c2919n, int i5) {
        this.f37924a = c2919n.f37925b.listIterator(i5);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f37924a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f37924a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37924a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f37924a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37924a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37924a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3058y
    public final void forEachRemaining(Consumer consumer) {
        S.q(this.f37924a, consumer);
    }
}
