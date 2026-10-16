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
public abstract class aekz<V> extends aeky<V> implements Serializable, Map<Long, V>, aens {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aekz() {
    }

    @Override // defpackage.aeky, defpackage.aene
    public boolean c(long j) {
        throw null;
    }

    @Override // defpackage.aens, java.util.Map
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

    @Override // defpackage.aeky, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return adqq.aE(this, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        aetu it = ((aenn) t()).iterator();
        while (it.hasNext()) {
            if (((aenm) it.next()).getValue() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public aepx keySet() {
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

    @Override // defpackage.aens
    public /* synthetic */ aeum f() {
        throw null;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(final BiConsumer biConsumer) {
        aeum aeumVarL = t();
        Consumer consumer = new Consumer() { // from class: aenr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aenm aenmVar = (aenm) obj;
                biConsumer.accept(Long.valueOf(aenmVar.a()), aenmVar.getValue());
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarL instanceof aenn)) {
            Iterable$EL.forEach(aeumVarL, consumer);
            return;
        }
        aenq aenqVar = ((aenn) aeumVarL).a;
        aenm aenmVar = new aenm(aenqVar);
        long[] jArr = aenqVar.g;
        int i = aenqVar.k;
        int i2 = aenqVar.e;
        while (i != 0) {
            i--;
            aenmVar.a = i2;
            i2 = (int) jArr[i2];
            consumer.accept(aenmVar);
        }
    }

    @Override // defpackage.aens
    public final /* synthetic */ Object g(Long l, Object obj) {
        return adqq.aC(this, l, obj);
    }

    @Override // defpackage.aeky, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return adqq.aB(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aenu.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aenm) aetyVarA.next()).hashCode();
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
    public final /* bridge */ /* synthetic */ Object put(Long l, Object obj) {
        return g(l, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Long, ? extends V> map) {
        if (map instanceof aens) {
            aety aetyVarA = aenu.a((aens) map);
            while (aetyVarA.hasNext()) {
                aenm aenmVar = (aenm) aetyVarA.next();
                a(aenmVar.a(), aenmVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends V> next = it.next();
            adqq.aC(this, next.getKey(), next.getValue());
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

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        aety aetyVarA = aenu.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            size--;
            aenm aenmVar = (aenm) aetyVarA.next();
            sb.append(String.valueOf(aenmVar.a()));
            sb.append("=>");
            if (this == aenmVar.getValue()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aenmVar.getValue()));
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adqq.aD(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
