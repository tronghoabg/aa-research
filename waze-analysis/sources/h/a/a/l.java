package h.a.a;

import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l<V> extends h.a.n<V> implements Collection<V>, h.g.b.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final i f47960a;

    public l(i iVar) {
        x.f(iVar, "backing");
        this.f47960a = iVar;
    }

    @Override // h.a.n, java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        x.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f47960a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f47960a.containsValue(obj);
    }

    @Override // h.a.n
    public final int getSize() {
        return this.f47960a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f47960a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new h(this.f47960a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f47960a.o(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47960a.i();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47960a.i();
        return super.retainAll(collection);
    }
}
