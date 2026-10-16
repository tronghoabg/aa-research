package com.google.d.d;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class bs<K, V> implements Map<K, V>, Serializable, j$.util.Map<K, V> {

    /* renamed from: a, reason: collision with root package name */
    static final Map.Entry[] f7466a = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* renamed from: b, reason: collision with root package name */
    private transient ci f7467b;

    /* renamed from: c, reason: collision with root package name */
    private transient ci f7468c;

    /* renamed from: d, reason: collision with root package name */
    private transient bh f7469d;

    bs() {
    }

    public static bq c(int i2) {
        fo.ah(i2, "expectedSize");
        return new bq(i2);
    }

    public static bs d(Iterable iterable) {
        bq bqVar = new bq(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bqVar.e(iterable);
        return bqVar.b();
    }

    public static bs e(Map map) {
        if ((map instanceof bs) && !(map instanceof SortedMap)) {
            bs bsVar = (bs) map;
            if (!bsVar.k()) {
                return bsVar;
            }
        }
        return d(map.entrySet());
    }

    public static bs f() {
        return ex.f7594b;
    }

    public static bs l(Object obj, Object obj2) {
        fo.af("Content-Type", obj);
        fo.af("Content-Length", obj2);
        return ex.m(2, new Object[]{"Content-Type", obj, "Content-Length", obj2}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract bh a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bh values() {
        bh bhVar = this.f7469d;
        if (bhVar != null) {
            return bhVar;
        }
        bh bhVarA = a();
        this.f7469d = bhVarA;
        return bhVarA;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return fo.B(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    abstract ci g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    abstract ci h();

    @Override // java.util.Map
    public final int hashCode() {
        return fo.b(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ci entrySet() {
        ci ciVar = this.f7467b;
        if (ciVar != null) {
            return ciVar;
        }
        ci ciVarG = g();
        this.f7467b = ciVarG;
        return ciVarG;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ci keySet() {
        ci ciVar = this.f7468c;
        if (ciVar != null) {
            return ciVar;
        }
        ci ciVarH = h();
        this.f7468c = ciVarH;
        return ciVarH;
    }

    abstract boolean k();

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        return fo.y(this);
    }

    Object writeReplace() {
        return new br(this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }
}
