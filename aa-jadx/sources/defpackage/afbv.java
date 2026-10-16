package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class afbv<K, V> extends java.util.AbstractMap<K, V> implements java.util.Map<K, V>, defpackage.afhg {
    protected afbv() {
    }

    public /* bridge */ int a() {
        throw null;
    }

    public /* bridge */ java.util.Collection c() {
        throw null;
    }

    public abstract java.util.Set d();

    public /* bridge */ java.util.Set e() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        return c();
    }
}
