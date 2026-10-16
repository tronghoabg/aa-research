package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aevz<K, V> extends aevv<K, V> implements Serializable, Cloneable, Map<K, V>, aevy {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aevy
    public final /* synthetic */ aeum b() {
        throw null;
    }

    @Override // defpackage.aevv
    public final Object clone() {
        return aewa.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return adqs.ai(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return adqs.aj(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // defpackage.aevy
    public final aeum d() {
        return aeuq.a;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return aeuq.a;
    }

    @Override // defpackage.aevv, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aevv, java.util.Map
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
        return adqs.ak(this, obj, obj2, biFunction);
    }

    @Override // defpackage.aevy, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return adqs.ap();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return adqs.al(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return adqs.an(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return adqs.am(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aevv
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection values() {
        return aeuq.a;
    }

    @Override // defpackage.aevy, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adqs.aq();
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return adqs.ao(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
    }

    @Override // j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }
}
