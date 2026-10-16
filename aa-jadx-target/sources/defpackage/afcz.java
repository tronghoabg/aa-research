package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afcz<K, V> extends defpackage.afcq<java.util.Map.Entry<K, V>, K, V> {
    private final defpackage.afcy a;

    public afcz(defpackage.afcy afcyVar) {
        this.a = afcyVar;
    }

    @Override // defpackage.afcq
    public final boolean a(java.util.Map.Entry entry) {
        return this.a.i(entry);
    }

    @Override // defpackage.afbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        ((java.util.Map.Entry) obj).getClass();
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> collection) {
        collection.getClass();
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.afcq
    public final boolean b(java.util.Map.Entry entry) {
        entry.getClass();
        defpackage.afcy afcyVar = this.a;
        afcyVar.f();
        int iB = afcyVar.b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        java.lang.Object[] objArr = afcyVar.c;
        objArr.getClass();
        if (!defpackage.afga.f(objArr[iB], entry.getValue())) {
            return false;
        }
        afcyVar.g(iB);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // defpackage.afbw
    public final int getSize() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new defpackage.afcu(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}
