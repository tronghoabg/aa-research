package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afbs<K, V> implements java.util.Map<K, V>, j$.util.Map<K, V>, defpackage.afhc {
    protected afbs() {
    }

    private final java.util.Map.Entry b(java.lang.Object obj) {
        java.lang.Object next;
        java.util.Iterator it = d().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (defpackage.afga.f(((java.util.Map.Entry) next).getKey(), obj)) {
                return (java.util.Map.Entry) next;
            }
        }
        next = null;
        return (java.util.Map.Entry) next;
    }

    public int a() {
        throw null;
    }

    public java.util.Collection c() {
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.a.aU();
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.a.aU();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set setD = d();
        if (setD.isEmpty()) {
            return false;
        }
        java.util.Iterator it = setD.iterator();
        while (it.hasNext()) {
            if (defpackage.afga.f(((java.util.Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract java.util.Set d();

    public java.util.Set e() {
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (a() != map.size()) {
            return false;
        }
        java.util.Set<java.util.Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof java.util.Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (entry != null) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                V v = get(key);
                if (defpackage.afga.f(value, v) && (v != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        java.util.Map.Entry entryB = b(obj);
        if (entryB != null) {
            return (V) entryB.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$getOrDefault(this, obj, obj2);
    }

    public final java.lang.String h(java.lang.Object obj) {
        return obj == this ? "(this Map)" : java.lang.String.valueOf(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return e();
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.aU();
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return a();
    }

    public final java.lang.String toString() {
        return defpackage.afga.bo(d(), ", ", "{", "}", new xss(this, 20), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        return c();
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.aU();
    }
}
