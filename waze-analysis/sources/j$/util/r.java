package j$.util;

import j$.util.Map;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class r implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f50300a;

    /* renamed from: b, reason: collision with root package name */
    public transient java.util.Set f50301b;

    /* renamed from: c, reason: collision with root package name */
    public transient q f50302c;

    /* renamed from: d, reason: collision with root package name */
    public transient java.util.Collection f50303d;

    public r(java.util.Map map) {
        map.getClass();
        this.f50300a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
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

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f50300a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f50300a.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        q qVar = this.f50302c;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f50300a.entrySet());
        this.f50302c = qVar2;
        return qVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f50300a.equals(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.forEach(this.f50300a, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f50300a.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.getOrDefault(this.f50300a, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f50300a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f50300a.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.f50301b;
        if (set != null) {
            return set;
        }
        java.util.Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f50300a.keySet());
        this.f50301b = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f50300a.size();
    }

    public final String toString() {
        return this.f50300a.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.f50303d;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(this.f50300a.values());
        this.f50303d = collectionUnmodifiableCollection;
        return collectionUnmodifiableCollection;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
