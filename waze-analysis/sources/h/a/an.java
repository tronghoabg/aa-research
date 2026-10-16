package h.a;

import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an implements ListIterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f47978a;

    /* renamed from: b, reason: collision with root package name */
    private final ListIterator f47979b;

    an(ao aoVar, int i2) {
        this.f47978a = aoVar;
        this.f47979b = aoVar.f47980a.listIterator(i.C(aoVar, i2));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f47979b;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f47979b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47979b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f47979b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return i.B(this.f47978a, this.f47979b.previousIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f47979b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return i.B(this.f47978a, this.f47979b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f47979b.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f47979b.set(obj);
    }
}
