package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class ylr<K, V> extends java.util.AbstractMap<K, V> {
    public abstract java.util.Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        defpackage.ysr.ac(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return new defpackage.ylq(this);
    }
}
