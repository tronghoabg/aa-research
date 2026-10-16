package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
class ynb<K, V> extends ynd implements Map<K, V> {
    private static final long serialVersionUID = 0;
    transient Set c;
    transient Collection d;
    transient Set e;

    public ynb(Map map, Object obj) {
        super(map, obj);
    }

    final Map a() {
        return (Map) this.f;
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.g) {
            zContainsKey = a().containsKey(obj);
        }
        return zContainsKey;
    }

    public boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.g) {
            zContainsValue = a().containsValue(obj);
        }
        return zContainsValue;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set;
        Object obj = this.g;
        synchronized (obj) {
            if (this.e == null) {
                this.e = new yng(a().entrySet(), obj);
            }
            set = this.e;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    public V get(Object obj) {
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
    public final Set<K> keySet() {
        Set<K> set;
        Object obj = this.g;
        synchronized (obj) {
            if (this.c == null) {
                this.c = new yng(a().keySet(), obj);
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
    public final void putAll(Map<? extends K, ? extends V> map) {
        synchronized (this.g) {
            a().putAll(map);
        }
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
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

    public Collection<V> values() {
        Collection<V> collection;
        Object obj = this.g;
        synchronized (obj) {
            if (this.d == null) {
                this.d = new ymz(a().values(), obj);
            }
            collection = this.d;
        }
        return collection;
    }
}
