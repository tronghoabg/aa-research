package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aelt extends aelp implements Serializable, Cloneable, Map, aels {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aeku, defpackage.aelo
    public final /* synthetic */ Integer c(Object obj) {
        return aeec.J(this, obj);
    }

    @Override // defpackage.aelp
    public final Object clone() {
        return aelu.a;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return h((Long) obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return i((Long) obj, function);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j((Long) obj, biFunction);
    }

    @Override // defpackage.aeku, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return aeec.M(this, obj);
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return aeuq.a;
    }

    @Override // defpackage.aelp, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aels
    public final /* synthetic */ aeum g() {
        throw null;
    }

    @Override // defpackage.aeku, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return aeec.J(this, obj);
    }

    @Override // j$.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return (Integer) obj2;
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer h(Long l, BiFunction biFunction) {
        return aeec.v(this, l, biFunction);
    }

    @Override // defpackage.aelp, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer i(Long l, Function function) {
        return aeec.w(this, l, function);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer j(Long l, BiFunction biFunction) {
        return aeec.x(this, l, biFunction);
    }

    @Override // defpackage.aels
    @Deprecated
    public final Integer k(Object obj, Integer num) {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set keySet() {
        return aeqa.a;
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer l(Long l, Integer num, BiFunction biFunction) {
        return aeec.y(this, l, num, biFunction);
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer m(Long l, Integer num) {
        return aeec.K(this, l, num);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return l((Long) obj, (Integer) obj2, biFunction);
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer n(Long l, Integer num) {
        return aeec.z(this, l, num);
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer o(Object obj) {
        throw null;
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer p(Long l, Integer num) {
        return aeec.A(this, l, num);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m((Long) obj, (Integer) obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends Long, ? extends Integer> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return n((Long) obj, (Integer) obj2);
    }

    @Override // defpackage.aels
    public final boolean q(int i) {
        throw null;
    }

    @Override // defpackage.aels
    public final /* synthetic */ boolean r(Long l, Integer num, Integer num2) {
        return Map.CC.$default$replace(this, l, num, num2);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return aeec.L(this, obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        return p((Long) obj, (Integer) obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aels
    public final aeum t() {
        return aeuq.a;
    }

    @Override // defpackage.aelp
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection values() {
        return aekj.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return r((Long) obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
    }
}
