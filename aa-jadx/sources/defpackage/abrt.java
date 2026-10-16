package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abrt<K, V> implements java.util.Map.Entry<K, V>, defpackage.afhc {
    private final /* synthetic */ java.util.Map.Entry a;

    public abrt(java.util.Map.Entry entry) {
        entry.getClass();
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
