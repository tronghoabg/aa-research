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
public abstract class aerc<K, V> extends aerb<K, V> implements Serializable, Map<K, V>, aevy {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aerc() {
    }

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aetv values() {
        throw null;
    }

    @Override // defpackage.aevy
    public final /* synthetic */ aeum b() {
        return d();
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public aexn keySet() {
        throw null;
    }

    @Override // java.util.Map
    public /* synthetic */ void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return adqs.ai(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return adqs.aj(this, obj, biFunction);
    }

    @Override // defpackage.aerb, defpackage.aeee
    public boolean containsKey(Object obj) {
        aety it = d().iterator();
        while (it.hasNext()) {
            if (((aewx) it.next()).getKey() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        aety it = d().iterator();
        while (it.hasNext()) {
            if (((aewx) it.next()).getValue() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        return b();
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
        return d().containsAll(map.entrySet());
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(final BiConsumer biConsumer) {
        aeum aeumVarD = d();
        Consumer consumer = new Consumer() { // from class: aevx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aewx aewxVar = (aewx) obj;
                biConsumer.accept(aewxVar.getKey(), aewxVar.getValue());
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarD instanceof aewg)) {
            Iterable$EL.forEach(aeumVarD, consumer);
            return;
        }
        aewk aewkVar = ((aewg) aeumVarD).a;
        aewx aewxVar = new aewx(aewkVar, 1, (byte[]) null);
        if (aewkVar.d) {
            aewxVar.a = aewkVar.e;
            consumer.accept(aewxVar);
        }
        Object[] objArr = aewkVar.a;
        int i = aewkVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                aewxVar.a = i;
                consumer.accept(aewxVar);
            }
        }
    }

    @Override // j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return (v != null || containsKey(obj)) ? v : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aewa.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aewx) aetyVarA.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return adqs.ak(this, obj, obj2, biFunction);
    }

    @Override // defpackage.aevy, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return adqs.ap();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        if (map instanceof aevy) {
            aety aetyVarA = aewa.a((aevy) map);
            while (aetyVarA.hasNext()) {
                aewx aewxVar = (aewx) aetyVarA.next();
                put(aewxVar.getKey(), aewxVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends K, ? extends V> next = it.next();
            put(next.getKey(), next.getValue());
        }
    }

    @Override // j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return adqs.al(this, obj, obj2);
    }

    @Override // j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return adqs.an(this, obj, obj2);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return adqs.am(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        aety aetyVarA = aewa.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            aewx aewxVar = (aewx) aetyVarA.next();
            if (this == aewxVar.getKey()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aewxVar.getKey()));
            }
            size--;
            sb.append("=>");
            if (this == aewxVar.getValue()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aewxVar.getValue()));
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.aevy, java.util.Map
    public /* synthetic */ Object remove(Object obj) {
        return adqs.aq();
    }

    @Override // j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return adqs.ao(this, obj, obj2, obj3);
    }
}
