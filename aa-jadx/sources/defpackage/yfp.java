package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfp<K, V> extends defpackage.yfr implements java.util.Map.Entry<K, V> {
    protected yfp() {
    }

    protected abstract java.util.Map.Entry a();

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        return a().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) a().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) a().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        return (V) a().setValue(v);
    }
}
