package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class afjf<V> extends afiv<V> {
    private final ConcurrentHashMap<Class<?>, V> cache;
    private final afec<Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public afjf(afec<? super Class<?>, ? extends V> afecVar) {
        afecVar.getClass();
        this.compute = afecVar;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // defpackage.afiv
    public void clear() {
        this.cache.clear();
    }

    @Override // defpackage.afiv
    public V get(Class<?> cls) {
        cls.getClass();
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.cache;
        V v = (V) concurrentHashMap.get(cls);
        if (v != null) {
            return v;
        }
        V vInvoke = this.compute.invoke(cls);
        V v2 = (V) concurrentHashMap.putIfAbsent(cls, vInvoke);
        return v2 == null ? vInvoke : v2;
    }
}
