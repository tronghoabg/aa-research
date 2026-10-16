package h.a.a;

import h.a.q;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k<E> extends q<E> implements Set<E>, h.g.b.a.f {

    /* renamed from: a, reason: collision with root package name */
    private final i f47959a;

    public k(i iVar) {
        x.f(iVar, "backing");
        this.f47959a = iVar;
    }

    @Override // h.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        x.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47959a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47959a.containsKey(obj);
    }

    @Override // h.a.q
    public final int getSize() {
        return this.f47959a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47959a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new h(this.f47959a, 1, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f47959a.n(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47959a.i();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47959a.i();
        return super.retainAll(collection);
    }
}
