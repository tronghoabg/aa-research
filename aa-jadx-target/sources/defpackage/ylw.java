package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class ylw<K, V> extends java.util.AbstractMap<K, V> {
    private transient java.util.Set a;
    private transient java.util.Set b;
    private transient java.util.Collection c;

    public abstract java.util.Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.a;
        if (set != null) {
            return set;
        }
        java.util.Set<java.util.Map.Entry<K, V>> setB = b();
        this.a = setB;
        return setB;
    }

    public java.util.Set g() {
        return new defpackage.yls(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.b;
        if (set != null) {
            return set;
        }
        java.util.Set<K> setG = g();
        this.b = setG;
        return setG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        ylv ylvVar = new ylv(this);
        this.c = ylvVar;
        return ylvVar;
    }
}
