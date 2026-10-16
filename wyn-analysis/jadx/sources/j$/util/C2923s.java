package j$.util;

import j$.util.Map;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2923s implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map f37942a;

    /* renamed from: b, reason: collision with root package name */
    private transient java.util.Set f37943b;

    /* renamed from: c, reason: collision with root package name */
    private transient java.util.Set f37944c;

    /* renamed from: d, reason: collision with root package name */
    private transient java.util.Collection f37945d;

    C2923s(java.util.Map map) {
        map.getClass();
        this.f37942a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f37942a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f37942a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f37942a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f37942a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f37942a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f37943b == null) {
            this.f37943b = DesugarCollections.unmodifiableSet(this.f37942a.keySet());
        }
        return this.f37943b;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f37944c == null) {
            this.f37944c = new r(this.f37942a.entrySet());
        }
        return this.f37944c;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f37945d == null) {
            this.f37945d = DesugarCollections.unmodifiableCollection(this.f37942a.values());
        }
        return this.f37945d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f37942a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f37942a.hashCode();
    }

    public final String toString() {
        return this.f37942a.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.getOrDefault(this.f37942a, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.a(this.f37942a, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
