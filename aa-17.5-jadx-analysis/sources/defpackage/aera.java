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
public abstract class aera<K> extends aeqz<K> implements Serializable, Map<K, Integer>, aeve {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aera() {
    }

    @Override // defpackage.aeqz, defpackage.aeva
    public final /* synthetic */ Integer c(Object obj) {
        return adqs.az(this, obj);
    }

    @Override // java.util.Map
    public /* synthetic */ void clear() {
        throw new UnsupportedOperationException();
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

    @Override // defpackage.aeqz, defpackage.aeee
    public boolean containsKey(Object obj) {
        aety it = p().iterator();
        while (it.hasNext()) {
            if (((aevn) it.next()).getKey() == obj) {
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

    @Override // defpackage.aeve
    public final /* synthetic */ aeum e() {
        return p();
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
        return p().containsAll(map.entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public aexn keySet() {
        throw null;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(final BiConsumer biConsumer) {
        aeum aeumVarP = p();
        Consumer consumer = new Consumer() { // from class: aevd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aevn aevnVar = (aevn) obj;
                biConsumer.accept(aevnVar.getKey(), Integer.valueOf(aevnVar.a()));
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarP instanceof aevo)) {
            Iterable$EL.forEach(aeumVarP, consumer);
            return;
        }
        aevt aevtVar = ((aevo) aeumVarP).a;
        aevn aevnVar = new aevn(aevtVar);
        if (aevtVar.d) {
            aevnVar.a = aevtVar.e;
            consumer.accept(aevnVar);
        }
        Object[] objArr = aevtVar.a;
        int i = aevtVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                aevnVar.a = i;
                consumer.accept(aevnVar);
            }
        }
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer g(Object obj, Integer num) {
        return (Integer) Map.CC.$default$getOrDefault(this, obj, num);
    }

    @Override // defpackage.aeqz, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return c(obj);
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return g(obj, (Integer) obj2);
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer h(Object obj, Integer num, BiFunction biFunction) {
        return adqs.ar(this, obj, num, biFunction);
    }

    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aevg.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aevn) aetyVarA.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer i(Object obj, Integer num) {
        return adqs.aA(this, obj, num);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer j(Object obj, Integer num) {
        return adqs.as(this, obj, num);
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer k(Object obj) {
        return adqs.aB(this, obj);
    }

    @Override // defpackage.aeve
    public final /* synthetic */ Integer l(Object obj, Integer num) {
        return adqs.at(this, obj, num);
    }

    @Override // defpackage.aeve
    public boolean m(int i) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Integer put(Object obj, Integer num) {
        return i(obj, num);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends Integer> map) {
        if (map instanceof aeve) {
            aety aetyVarA = aevg.a((aeve) map);
            while (aetyVarA.hasNext()) {
                aevn aevnVar = (aevn) aetyVarA.next();
                a(aevnVar.getKey(), aevnVar.a());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends Integer>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends K, ? extends Integer> next = it.next();
            adqs.aA(this, next.getKey(), next.getValue());
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
        aety aetyVarA = aevg.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            aevn aevnVar = (aevn) aetyVarA.next();
            if (this == aevnVar.getKey()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aevnVar.getKey()));
            }
            sb.append("=>");
            sb.append(String.valueOf(aevnVar.a()));
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
