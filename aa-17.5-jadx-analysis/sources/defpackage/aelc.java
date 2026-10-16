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
public abstract class aelc<V> extends aelb<V> implements Serializable, Map<Long, V>, aeoa {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aelc() {
    }

    @Override // defpackage.aelb, defpackage.aenw
    public boolean c(long j) {
        throw null;
    }

    @Override // defpackage.aeoa, java.util.Map
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

    @Override // defpackage.aelb, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return adqq.az(this, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        aety it = i().iterator();
        while (it.hasNext()) {
            if (((aeoj) it.next()).getValue() == obj) {
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

    @Override // defpackage.aeoa
    public final /* synthetic */ aeum e() {
        return i();
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
        return i().containsAll(map.entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public aexk values() {
        throw null;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(final BiConsumer biConsumer) {
        aeum aeumVarI = i();
        Consumer consumer = new Consumer() { // from class: aenz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aeoj aeojVar = (aeoj) obj;
                biConsumer.accept(Long.valueOf(aeojVar.a()), aeojVar.getValue());
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarI instanceof aeok)) {
            Iterable$EL.forEach(aeumVarI, consumer);
            return;
        }
        aeop aeopVar = ((aeok) aeumVarI).a;
        aeoj aeojVar = new aeoj(aeopVar);
        if (aeopVar.d) {
            aeojVar.a = aeopVar.e;
            consumer.accept(aeojVar);
        }
        long[] jArr = aeopVar.a;
        int i = aeopVar.e;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
                aeojVar.a = i;
                consumer.accept(aeojVar);
            }
        }
    }

    @Override // defpackage.aeoa
    public final /* synthetic */ Object g(Long l, Object obj) {
        return adqq.ax(this, l, obj);
    }

    @Override // defpackage.aelb, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return adqq.aw(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aeoc.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aeoj) aetyVarA.next()).hashCode();
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
        if (map instanceof aeoa) {
            aety aetyVarA = aeoc.a((aeoa) map);
            while (aetyVarA.hasNext()) {
                aeoj aeojVar = (aeoj) aetyVarA.next();
                a(aeojVar.a(), aeojVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends V> next = it.next();
            adqq.ax(this, next.getKey(), next.getValue());
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
        aety aetyVarA = aeoc.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            size--;
            aeoj aeojVar = (aeoj) aetyVarA.next();
            sb.append(String.valueOf(aeojVar.a()));
            sb.append("=>");
            if (this == aeojVar.getValue()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aeojVar.getValue()));
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adqq.ay(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
