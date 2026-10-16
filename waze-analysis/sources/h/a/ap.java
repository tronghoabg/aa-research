package h.a;

import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap implements ListIterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f47981a;

    /* renamed from: b, reason: collision with root package name */
    private final ListIterator f47982b;

    ap(aq aqVar, int i2) {
        this.f47981a = aqVar;
        this.f47982b = aqVar.f47983a.listIterator(i.C(aqVar, i2));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f47982b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47982b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f47982b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return i.B(this.f47981a, this.f47982b.previousIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f47982b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return i.B(this.f47981a, this.f47982b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
