package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yfy<K, V> extends java.util.AbstractMap<V, K> implements java.io.Serializable, defpackage.ydi {
    final defpackage.yge a;
    private transient java.util.Set b;

    public yfy(defpackage.yge ygeVar) {
        this.a = ygeVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // defpackage.ydi
    public final defpackage.ydi a() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<V, K>> entrySet() {
        java.util.Set<java.util.Map.Entry<V, K>> set = this.b;
        if (set != null) {
            return set;
        }
        yfz yfzVar = new yfz(this.a);
        this.b = yfzVar;
        return yfzVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K get(java.lang.Object obj) {
        defpackage.yge ygeVar = this.a;
        int iD = ygeVar.d(obj);
        if (iD == -1) {
            return null;
        }
        return (K) ygeVar.a[iD];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<V> keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K put(V v, K k) {
        return (K) this.a.k(v, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K remove(java.lang.Object obj) {
        defpackage.yge ygeVar = this.a;
        int iAA = defpackage.ysr.aA(obj);
        int iE = ygeVar.e(obj, iAA);
        if (iE == -1) {
            return null;
        }
        K k = (K) ygeVar.a[iE];
        ygeVar.h(iE, iAA);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return this.a.keySet();
    }
}
