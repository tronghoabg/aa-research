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
public abstract class aeqm<K> extends aeqk<K> implements Serializable, Map<K, Integer>, aert {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aeqm() {
    }

    @Override // defpackage.aeqk, defpackage.aern
    public final /* synthetic */ Integer c(Object obj) {
        return adqq.ab(this, obj);
    }

    @Override // java.util.Map
    public /* synthetic */ void clear() {
        adqq.aa();
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

    @Override // defpackage.aeqk, defpackage.aeee
    public boolean containsKey(Object obj) {
        aety it = entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return m(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public aejf values() {
        throw null;
    }

    @Override // defpackage.aert
    public final /* synthetic */ aeum e() {
        return entrySet();
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return e();
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
        return entrySet().containsAll(map.entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public aeum keySet() {
        throw null;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        adqq.Y(this, biConsumer);
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer g(Object obj, Integer num) {
        return adqq.P(this, obj, num);
    }

    @Override // defpackage.aeqk, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return c(obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return g(obj, (Integer) obj2);
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer h(Object obj, Integer num, BiFunction biFunction) {
        return adqq.Q(this, obj, num, biFunction);
    }

    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aerw.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aers) aetyVarA.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer i(Object obj, Integer num) {
        return adqq.ac(this, obj, num);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer j(Object obj, Integer num) {
        return adqq.R(this, obj, num);
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer k(Object obj) {
        return adqq.ad(this, obj);
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer l(Object obj, Integer num) {
        return adqq.S(this, obj, num);
    }

    @Override // defpackage.aert
    public boolean m(int i) {
        throw null;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return h(obj, (Integer) obj2, biFunction);
    }

    @Override // defpackage.aert
    public final /* synthetic */ boolean n(Object obj, Integer num, Integer num2) {
        return Map.CC.$default$replace(this, obj, num, num2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Integer put(Object obj, Integer num) {
        return i(obj, num);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends Integer> map) {
        if (map instanceof aert) {
            aety aetyVarA = aerw.a((aert) map);
            while (aetyVarA.hasNext()) {
                aers aersVar = (aers) aetyVarA.next();
                a(aersVar.getKey(), aersVar.a());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends Integer>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends K, ? extends Integer> next = it.next();
            adqq.ac(this, next.getKey(), next.getValue());
        }
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j(obj, (Integer) obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ Integer remove(Object obj) {
        return k(obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        return l(obj, (Integer) obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        aety aetyVarA = aerw.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            aers aersVar = (aers) aetyVarA.next();
            if (this == aersVar.getKey()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aersVar.getKey()));
            }
            sb.append("=>");
            sb.append(String.valueOf(aersVar.a()));
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
        return n(obj, (Integer) obj2, (Integer) obj3);
    }
}
