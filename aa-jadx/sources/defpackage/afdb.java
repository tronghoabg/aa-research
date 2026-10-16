package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afdb<V> extends defpackage.afbt<V> implements java.util.Collection<V>, defpackage.afhd {
    private final defpackage.afcy a;

    public afdb(defpackage.afcy afcyVar) {
        this.a = afcyVar;
    }

    @Override // defpackage.afbt
    public final int a() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends V> collection) {
        collection.getClass();
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return new defpackage.afcx(this.a, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.afcy afcyVar = this.a;
        afcyVar.f();
        int iC = afcyVar.c(obj);
        if (iC < 0) {
            return false;
        }
        afcyVar.g(iC);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}
