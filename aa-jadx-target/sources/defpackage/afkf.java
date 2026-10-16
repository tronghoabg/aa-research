package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class afkf<V> extends defpackage.afjv<V> {
    private final j$.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, V> cache;
    private final defpackage.affc<java.lang.Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public afkf(defpackage.affc<? super java.lang.Class<?>, ? extends V> affcVar) {
        affcVar.getClass();
        this.compute = affcVar;
        this.cache = new j$.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // defpackage.afjv
    public void clear() {
        this.cache.clear();
    }

    @Override // defpackage.afjv
    public V get(java.lang.Class<?> cls) {
        cls.getClass();
        java.util.concurrent.ConcurrentMap concurrentMap = (j$.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, V>) this.cache;
        V v = (V) concurrentMap.get(cls);
        if (v != null) {
            return v;
        }
        V vInvoke = this.compute.invoke(cls);
        V v2 = (V) concurrentMap.putIfAbsent(cls, vInvoke);
        return v2 == null ? vInvoke : v2;
    }
}
