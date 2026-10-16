package h.a.a;

import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final i f47958a;

    public j(i iVar) {
        x.f(iVar, "backing");
        this.f47958a = iVar;
    }

    @Override // h.a.a.a
    public final boolean a(Map.Entry entry) {
        x.f(entry, "element");
        return this.f47958a.k(entry);
    }

    @Override // h.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        x.f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        x.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // h.a.a.a
    public final boolean b(Map.Entry entry) {
        x.f(entry, "element");
        return this.f47958a.m(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47958a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        x.f(collection, "elements");
        return this.f47958a.j(collection);
    }

    @Override // h.a.q
    public final int getSize() {
        return this.f47958a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47958a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new e(this.f47958a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47958a.i();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        x.f(collection, "elements");
        this.f47958a.i();
        return super.retainAll(collection);
    }
}
