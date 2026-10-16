package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class yog<K, V> extends defpackage.yoi implements java.util.Map<K, V> {
    private static final long serialVersionUID = 0;
    transient java.util.Set c;
    transient java.util.Collection d;
    transient java.util.Set e;

    public yog(java.util.Map map, java.lang.Object obj) {
        super(map, obj);
    }

    final java.util.Map a() {
        return (java.util.Map) this.f;
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        boolean zContainsKey;
        synchronized (this.g) {
            zContainsKey = a().containsKey(obj);
        }
        return zContainsKey;
    }

    public boolean containsValue(java.lang.Object obj) {
        boolean zContainsValue;
        synchronized (this.g) {
            zContainsValue = a().containsValue(obj);
        }
        return zContainsValue;
    }

    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set;
        java.lang.Object obj = this.g;
        synchronized (obj) {
            if (this.e == null) {
                this.e = new defpackage.yol(a().entrySet(), obj);
            }
            set = this.e;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    public V get(java.lang.Object obj) {
        V v;
        synchronized (this.g) {
            v = (V) a().get(obj);
        }
        return v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.g) {
            zIsEmpty = a().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        java.util.Set<K> set;
        java.lang.Object obj = this.g;
        synchronized (obj) {
            if (this.c == null) {
                this.c = new defpackage.yol(a().keySet(), obj);
            }
            set = this.c;
        }
        return set;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        V v2;
        synchronized (this.g) {
            v2 = (V) a().put(k, v);
        }
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        synchronized (this.g) {
            a().putAll(map);
        }
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        V v;
        synchronized (this.g) {
            v = (V) a().remove(obj);
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    public java.util.Collection<V> values() {
        java.util.Collection<V> collection;
        java.lang.Object obj = this.g;
        synchronized (obj) {
            if (this.d == null) {
                this.d = new defpackage.yoe(a().values(), obj);
            }
            collection = this.d;
        }
        return collection;
    }
}
