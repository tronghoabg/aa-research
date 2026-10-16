package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aemp extends aemk implements Serializable, Cloneable, Map, aemo {
    private static final long serialVersionUID = -7046029254386353129L;

    @Override // defpackage.aemk
    public final Object clone() {
        return aemr.a;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return i((Long) obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j((Long) obj, function);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return k((Long) obj, biFunction);
    }

    @Override // defpackage.aekw, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return adqq.aZ(this, obj);
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final /* synthetic */ Long d(Object obj) {
        return adqq.aW(this, obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return aeuq.a;
    }

    @Override // defpackage.aemk, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.aemo
    /* renamed from: f */
    public final aepb values() {
        throw null;
    }

    @Override // defpackage.aemo
    /* renamed from: g */
    public final aepx keySet() {
        throw null;
    }

    @Override // defpackage.aekw, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return adqq.aW(this, obj);
    }

    @Override // j$.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return (Long) obj2;
    }

    @Override // defpackage.aemo
    public final /* synthetic */ aeum h() {
        throw null;
    }

    @Override // defpackage.aemk, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long i(Long l, BiFunction biFunction) {
        return adqq.aF(this, l, biFunction);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long j(Long l, Function function) {
        return adqq.aG(this, l, function);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long k(Long l, BiFunction biFunction) {
        return adqq.aH(this, l, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Set keySet() {
        return aeqa.a;
    }

    @Override // defpackage.aemo
    @Deprecated
    public final Long l(Object obj, Long l) {
        throw null;
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long m(Long l, Long l2, BiFunction biFunction) {
        return adqq.aJ(this, l, l2, biFunction);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return m((Long) obj, (Long) obj2, biFunction);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long n(Long l, Long l2) {
        return adqq.aX(this, l, l2);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long o(Long l, Long l2) {
        return adqq.aK(this, l, l2);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long p(Object obj) {
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return n((Long) obj, (Long) obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends Long, ? extends Long> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return o((Long) obj, (Long) obj2);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long q(Long l, Long l2) {
        return adqq.aL(this, l, l2);
    }

    @Override // defpackage.aemo
    public final boolean r(long j) {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adqq.aY(this, obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        return q((Long) obj, (Long) obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ boolean s(Long l, Long l2, Long l3) {
        return Map.CC.$default$replace(this, l, l2, l3);
    }

    @Override // defpackage.aemk
    public final String toString() {
        return "{}";
    }

    @Override // defpackage.aemo
    public final aeum u() {
        return aeuq.a;
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection values() {
        return aeqa.a;
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return s((Long) obj, (Long) obj2, (Long) obj3);
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
    }
}
