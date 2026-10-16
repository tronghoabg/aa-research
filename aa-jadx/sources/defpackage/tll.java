package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tll<K, V> implements java.util.Map<K, V>, defpackage.afhg {
    private final java.util.Map a;
    private final defpackage.afer b;

    public tll(java.util.Map map, defpackage.afer aferVar) {
        this.a = map;
        this.b = aferVar;
    }

    private final void c() {
        if (!((java.lang.Boolean) this.b.invoke()).booleanValue()) {
            throw new java.lang.IllegalStateException("CheckedMutableMap used in wrong context");
        }
    }

    public final java.util.Collection a() {
        c();
        return this.a.values();
    }

    public final java.util.Set b() {
        c();
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        c();
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        c();
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        c();
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final V get(java.lang.Object obj) {
        c();
        return (V) this.a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        c();
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        c();
        return (V) this.a.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        map.getClass();
        c();
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        c();
        return (V) this.a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        c();
        return this.a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        return a();
    }
}
