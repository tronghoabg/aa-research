package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tdq<T> implements java.util.Set<T>, defpackage.afhh, defpackage.afhc {
    final /* synthetic */ defpackage.tdo a;
    private final java.util.Set b;

    public tdq(defpackage.tdo tdoVar, java.util.Set set) {
        this.a = tdoVar;
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
    public final boolean addAll(java.util.Collection<? extends T> collection) {
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
    public final boolean contains(java.lang.Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new defpackage.tdp(this, this.b.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        boolean zRemove = this.b.remove(obj);
        a();
        return zRemove;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        boolean zRemoveAll = this.b.removeAll(collection);
        a();
        return zRemoveAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
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
        return (T[]) defpackage.afft.b(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.afft.a(this);
    }
}
