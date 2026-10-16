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
public abstract class aeqo<K, V> extends aeqn<K, V> implements Serializable, Map<K, V>, aesy {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aeqo() {
    }

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aetv values() {
        throw null;
    }

    @Override // defpackage.aesy
    public /* synthetic */ aeum b() {
        return h();
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public aeum keySet() {
        throw null;
    }

    @Override // defpackage.aesy, java.util.Map
    public /* synthetic */ void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return adqq.G(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return adqq.H(this, obj, biFunction);
    }

    @Override // defpackage.aeqn, defpackage.aeee
    public boolean containsKey(Object obj) {
        aety it = h().iterator();
        while (it.hasNext()) {
            if (((aesw) it.next()).getKey() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        aety it = h().iterator();
        while (it.hasNext()) {
            if (((aesw) it.next()).getValue() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
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
        return h().containsAll(map.entrySet());
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(final BiConsumer biConsumer) {
        aeum aeumVarD = h();
        Consumer consumer = new Consumer() { // from class: aesv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aesw aeswVar = (aesw) obj;
                biConsumer.accept(aeswVar.getKey(), aeswVar.getValue());
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (aeumVarD instanceof aesx) {
            ((aesx) aeumVarD).i(consumer);
        } else {
            Iterable$EL.forEach(aeumVarD, consumer);
        }
    }

    @Override // j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return (v != null || containsKey(obj)) ? v : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aeta.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aesw) aetyVarA.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return adqq.I(this, obj, obj2, biFunction);
    }

    @Override // defpackage.aesy, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return adqq.N();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        if (map instanceof aesy) {
            aety aetyVarA = aeta.a((aesy) map);
            while (aetyVarA.hasNext()) {
                aesw aeswVar = (aesw) aetyVarA.next();
                put(aeswVar.getKey(), aeswVar.getValue());
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
        return adqq.J(this, obj, obj2);
    }

    @Override // j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return adqq.L(this, obj, obj2);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return adqq.K(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        aety aetyVarA = aeta.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            aesw aeswVar = (aesw) aetyVarA.next();
            if (this == aeswVar.getKey()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aeswVar.getKey()));
            }
            size--;
            sb.append("=>");
            if (this == aeswVar.getValue()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aeswVar.getValue()));
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.aesy, java.util.Map
    public /* synthetic */ Object remove(Object obj) {
        return adqq.O();
    }

    @Override // j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return adqq.M(this, obj, obj2, obj3);
    }
}
