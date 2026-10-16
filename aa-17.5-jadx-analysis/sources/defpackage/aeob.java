package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aeob<V> extends aenx<V> implements Serializable, Cloneable, Map<Long, V>, aeoa {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aenx
    public final Object clone() {
        return aeoc.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // defpackage.aelb, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return adqq.az(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // defpackage.aeoa
    public final /* synthetic */ aeum e() {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return aeuq.a;
    }

    @Override // defpackage.aenx, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aeoa
    /* renamed from: f */
    public final aexk values() {
        throw null;
    }

    @Override // defpackage.aeoa
    public final /* synthetic */ Object g(Long l, Object obj) {
        return adqq.ax(this, l, obj);
    }

    @Override // defpackage.aelb, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return adqq.aw(this, obj);
    }

    @Override // defpackage.aenx, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.aeoa
    public final aeum i() {
        return aeuq.a;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set<Long> keySet() {
        return aeqa.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Long l, Object obj) {
        return g(l, obj);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends Long, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aenx
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection values() {
        return aexp.a;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adqq.ay(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
    }

    @Override // j$.util.Map
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }
}
