package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccg<K, V> extends defpackage.afbt<V> implements java.util.Collection<V>, defpackage.afhd {
    private final defpackage.ccc a;

    public ccg(defpackage.ccc cccVar) {
        this.a = cccVar;
    }

    @Override // defpackage.afbt
    public final int a() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        defpackage.ccl[] cclVarArr = new defpackage.ccl[8];
        for (int i = 0; i < 8; i++) {
            cclVarArr[i] = new defpackage.ccp();
        }
        return new defpackage.ccd(this.a, cclVarArr);
    }
}
