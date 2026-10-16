package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aewq<K, V> extends aewm<K, V> implements Serializable, Cloneable, Map<K, V>, aewp {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aewp
    public final /* synthetic */ aeum a() {
        throw null;
    }

    @Override // defpackage.aewm
    public final Object clone() {
        return aewr.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return adqs.Z(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return adqs.aa(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // defpackage.aewp
    public final aeum d() {
        return aeuq.a;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return aeuq.a;
    }

    @Override // defpackage.aewm, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aewm, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set keySet() {
        return aexp.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return adqs.ab(this, obj, obj2, biFunction);
    }

    @Override // defpackage.aewp, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return adqs.ag();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return adqs.ac(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return adqs.ae(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return adqs.ad(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aewm
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection values() {
        return aexp.a;
    }

    @Override // defpackage.aewp, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adqs.ah();
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return adqs.af(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
    }

    @Override // j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }
}
