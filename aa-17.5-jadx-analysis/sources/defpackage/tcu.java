package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tcu<T> implements Set<T>, afgh, afgc {
    final /* synthetic */ tcs a;
    private final Set b;

    public tcu(tcs tcsVar, Set set) {
        this.a = tcsVar;
        set.getClass();
        this.b = set;
    }

    protected final void a() {
        this.a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        boolean zAdd = this.b.add(t);
        a();
        return zAdd;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        collection.getClass();
        boolean zAddAll = this.b.addAll(collection);
        a();
        return zAddAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.clear();
        a();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new tct(this, this.b.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove = this.b.remove(obj);
        a();
        return zRemove;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean zRemoveAll = this.b.removeAll(collection);
        a();
        return zRemoveAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean zRetainAll = this.b.retainAll(collection);
        a();
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) afet.b(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return afet.a(this);
    }
}
