package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccf<K, V> extends defpackage.afbw<K> implements java.util.Set<K>, defpackage.afhh {
    private final defpackage.ccc a;

    public ccf(defpackage.ccc cccVar) {
        this.a = cccVar;
    }

    @Override // defpackage.afbw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.afbw
    public final int getSize() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<K> iterator() {
        defpackage.ccl[] cclVarArr = new defpackage.ccl[8];
        for (int i = 0; i < 8; i++) {
            cclVarArr[i] = new defpackage.ccn();
        }
        return new defpackage.ccd(this.a, cclVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        defpackage.ccc cccVar = this.a;
        if (!cccVar.containsKey(obj)) {
            return false;
        }
        cccVar.remove(obj);
        return true;
    }
}
