package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class aekv extends aeku implements Serializable, Map, aels {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aekv() {
    }

    @Override // defpackage.aeku, defpackage.aelo
    public final /* synthetic */ Integer c(Object obj) {
        return aeec.J(this, obj);
    }

    @Override // java.util.Map
    public /* synthetic */ void clear() {
        throw new UnsupportedOperationException();
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
    public final /* synthetic */ boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return q(((Integer) obj).intValue());
    }

    @Override // defpackage.aeku, defpackage.aelo
    public boolean d(long j) {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public aejf values() {
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return g();
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
        return t().containsAll(map.entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public aepx keySet() {
        throw null;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(final BiConsumer biConsumer) {
        aeum aeumVarT = t();
        Consumer consumer = new Consumer() { // from class: aelr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aemc aemcVar = (aemc) obj;
                biConsumer.accept(Long.valueOf(aemcVar.b()), Integer.valueOf(aemcVar.a()));
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarT instanceof aemd)) {
            Iterable$EL.forEach(aeumVarT, consumer);
            return;
        }
        aemi aemiVar = ((aemd) aeumVarT).a;
        aemc aemcVar = new aemc(aemiVar);
        if (aemiVar.d) {
            aemcVar.a = aemiVar.e;
            consumer.accept(aemcVar);
        }
        long[] jArr = aemiVar.a;
        int i = aemiVar.e;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
                aemcVar.a = i;
                consumer.accept(aemcVar);
            }
        }
    }

    @Override // defpackage.aels
    public final /* synthetic */ aeum g() {
        return t();
    }

    @Override // defpackage.aeku, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return c(obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return k(obj, (Integer) obj2);
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer h(Long l, BiFunction biFunction) {
        return aeec.v(this, l, biFunction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aelu.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aemc) aetyVarA.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer i(Long l, Function function) {
        return aeec.w(this, l, function);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer j(Long l, BiFunction biFunction) {
        return aeec.x(this, l, biFunction);
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer k(Object obj, Integer num) {
        return (Integer) Map.CC.$default$getOrDefault(this, obj, num);
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
        return aeec.L(this, obj);
    }

    @Override // defpackage.aels
    public final /* synthetic */ Integer p(Long l, Integer num) {
        return aeec.A(this, l, num);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m((Long) obj, (Integer) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Long, ? extends Integer> map) {
        if (map instanceof aels) {
            aety aetyVarA = aelu.a((aels) map);
            while (aetyVarA.hasNext()) {
                aemc aemcVar = (aemc) aetyVarA.next();
                a(aemcVar.b(), aemcVar.a());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends Integer>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends Integer> next = it.next();
            aeec.K(this, next.getKey(), next.getValue());
        }
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return n((Long) obj, (Integer) obj2);
    }

    @Override // defpackage.aels
    public boolean q(int i) {
        throw null;
    }

    @Override // defpackage.aels
    public final /* synthetic */ boolean r(Long l, Integer num, Integer num2) {
        return Map.CC.$default$replace(this, l, num, num2);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return o(obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        return p((Long) obj, (Integer) obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        aety aetyVarA = aelu.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            aemc aemcVar = (aemc) aetyVarA.next();
            sb.append(String.valueOf(aemcVar.b()));
            sb.append("=>");
            sb.append(String.valueOf(aemcVar.a()));
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
        return r((Long) obj, (Integer) obj2, (Integer) obj3);
    }
}
