package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aevf<K> extends aevb<K> implements Serializable, Cloneable, Map<K, Integer>, aeve {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aeqz, defpackage.aeva
    public final /* synthetic */ Integer c(Object obj) {
        return adqs.az(this, obj);
    }

    @Override // defpackage.aevb
    public final Object clone() {
        return aevg.a;
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

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // defpackage.aeve
    public final /* synthetic */ aeum e() {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return aeuq.a;
    }

    @Override // defpackage.aevb, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aeve
    @Deprecated
    public final Integer g(Object obj, Integer num) {
        throw null;
    }

    @Override // defpackage.aeqz, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return adqs.az(this, obj);
    }

    @Override // j$.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return (Integer) obj2;
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer h(Object obj, Integer num, BiFunction biFunction) {
        return adqs.ar(this, obj, num, biFunction);
    }

    @Override // defpackage.aevb, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer i(Object obj, Integer num) {
        return adqs.aA(this, obj, num);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer j(Object obj, Integer num) {
        return adqs.as(this, obj, num);
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer k(Object obj) {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set keySet() {
        return aexp.a;
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer l(Object obj, Integer num) {
        return adqs.at(this, obj, num);
    }

    @Override // defpackage.aeve
    public final boolean m(int i) {
        throw null;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return h(obj, (Integer) obj2, biFunction);
    }

    @Override // defpackage.aeve
    public final /* synthetic */ boolean n(Object obj, Integer num, Integer num2) {
        return Map.CC.$default$replace(this, obj, num, num2);
    }

    @Override // defpackage.aeve
    public final aeum p() {
        return aeuq.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Integer put(Object obj, Integer num) {
        return i(obj, num);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends Integer> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j(obj, (Integer) obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ Integer remove(Object obj) {
        return adqs.aB(this, obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        return l(obj, (Integer) obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aevb
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection<Integer> values() {
        return aekj.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return n(obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
    }
}
