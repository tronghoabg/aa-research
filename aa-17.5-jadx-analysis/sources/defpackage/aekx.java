package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class aekx extends aekw implements Serializable, Map, aemo {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aekx() {
    }

    @Override // java.util.Map
    public /* synthetic */ void clear() {
        throw new UnsupportedOperationException();
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
    public final /* synthetic */ boolean containsValue(Object obj) {
        return adqq.aU(this, obj);
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final /* synthetic */ Long d(Object obj) {
        return adqq.aW(this, obj);
    }

    @Override // defpackage.aekw, defpackage.aemj
    public boolean e(long j) {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return h();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (map.size() != size()) {
            return false;
        }
        return u().containsAll(map.entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public aepb values() {
        throw null;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        adqq.aT(this, biConsumer);
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public aepx keySet() {
        throw null;
    }

    @Override // defpackage.aekw, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return d(obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return l(obj, (Long) obj2);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ aeum h() {
        return u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aemr.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aemx) aetyVarA.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long i(Long l, BiFunction biFunction) {
        return adqq.aF(this, l, biFunction);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long j(Long l, Function function) {
        return adqq.aG(this, l, function);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long k(Long l, BiFunction biFunction) {
        return adqq.aH(this, l, biFunction);
    }

    @Override // defpackage.aemo
    public final /* synthetic */ Long l(Object obj, Long l) {
        return adqq.aI(this, obj, l);
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
        return adqq.aY(this, obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return n((Long) obj, (Long) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Long, ? extends Long> map) {
        if (map instanceof aemo) {
            aety aetyVarA = aemr.a((aemo) map);
            while (aetyVarA.hasNext()) {
                aemx aemxVar = (aemx) aetyVarA.next();
                b(aemxVar.a(), aemxVar.b());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends Long>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends Long> next = it.next();
            adqq.aX(this, next.getKey(), next.getValue());
        }
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
    public boolean r(long j) {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return p(obj);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        aety aetyVarA = aemr.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            aemx aemxVar = (aemx) aetyVarA.next();
            sb.append(String.valueOf(aemxVar.a()));
            sb.append("=>");
            sb.append(String.valueOf(aemxVar.b()));
            size--;
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return s((Long) obj, (Long) obj2, (Long) obj3);
    }
}
