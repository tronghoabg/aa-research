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
public abstract class aegf<V> extends aege<V> implements Serializable, Map<Integer, V>, aehj {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aegf() {
    }

    @Override // defpackage.aege, defpackage.aegu
    public boolean c(int i) {
        throw null;
    }

    @Override // defpackage.aehj, java.util.Map
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

    @Override // defpackage.aege, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return adzo.C(this, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        aety aetyVarA = t().iterator();
        while (aetyVarA.hasNext()) {
            if (((aehh) aetyVarA.next()).getValue() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public aekf keySet() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public aetv values() {
        throw null;
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        return f();
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

    @Override // defpackage.aehj
    public /* synthetic */ aeum f() {
        return t();
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(final BiConsumer biConsumer) {
        aeum aeumVarL = t();
        Consumer consumer = new Consumer() { // from class: aehg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aehh aehhVar = (aehh) obj;
                biConsumer.accept(Integer.valueOf(aehhVar.a()), aehhVar.getValue());
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (aeumVarL instanceof aehi) {
            ((aehi) aeumVarL).h(consumer);
        } else {
            Iterable$EL.forEach(aeumVarL, consumer);
        }
    }

    @Override // defpackage.aehj
    public final /* synthetic */ Object g(Integer num, Object obj) {
        return adzo.A(this, num, obj);
    }

    @Override // defpackage.aege, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return adzo.z(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aehl.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aehh) aetyVarA.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Integer num, Object obj) {
        return g(num, obj);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Integer, ? extends V> map) {
        if (map instanceof aehj) {
            aety aetyVarA = aehl.a((aehj) map);
            while (aetyVarA.hasNext()) {
                aehh aehhVar = (aehh) aetyVarA.next();
                a(aehhVar.a(), aehhVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Integer, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Integer, ? extends V> next = it.next();
            adzo.A(this, next.getKey(), next.getValue());
        }
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        aety aetyVarA = aehl.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            size--;
            aehh aehhVar = (aehh) aetyVarA.next();
            sb.append(String.valueOf(aehhVar.a()));
            sb.append("=>");
            if (this == aehhVar.getValue()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aehhVar.getValue()));
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adzo.B(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
