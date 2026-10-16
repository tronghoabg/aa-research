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
public abstract class aegi<V> extends aegh<V> implements Serializable, Map<Integer, V>, aeie {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aegi() {
    }

    @Override // defpackage.aegh, defpackage.aeia
    public boolean c(int i) {
        throw null;
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

    @Override // defpackage.aegh, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return adzo.x(this, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        aety it = i().iterator();
        while (it.hasNext()) {
            if (((aein) it.next()).getValue() == obj) {
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

    @Override // defpackage.aeie
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
        Consumer consumer = new Consumer() { // from class: aeid
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aein aeinVar = (aein) obj;
                biConsumer.accept(Integer.valueOf(aeinVar.a()), aeinVar.getValue());
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarI instanceof aeio)) {
            Iterable$EL.forEach(aeumVarI, consumer);
            return;
        }
        aeit aeitVar = ((aeio) aeumVarI).a;
        aein aeinVar = new aein(aeitVar);
        if (aeitVar.d) {
            aeinVar.a = aeitVar.e;
            consumer.accept(aeinVar);
        }
        int[] iArr = aeitVar.a;
        int i = aeitVar.e;
        while (i != 0) {
            i--;
            if (iArr[i] != 0) {
                aeinVar.a = i;
                consumer.accept(aeinVar);
            }
        }
    }

    @Override // defpackage.aeie
    public final /* synthetic */ Object g(Integer num, Object obj) {
        return adzo.v(this, num, obj);
    }

    @Override // defpackage.aegh, defpackage.aeee
    public final /* synthetic */ Object get(Object obj) {
        return adzo.u(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public int hashCode() {
        aety aetyVarA = aeig.a(this);
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iHashCode += ((aein) aetyVarA.next()).hashCode();
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Integer, ? extends V> map) {
        if (map instanceof aeie) {
            aety aetyVarA = aeig.a((aeie) map);
            while (aetyVarA.hasNext()) {
                aein aeinVar = (aein) aetyVarA.next();
                a(aeinVar.a(), aeinVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Integer, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Integer, ? extends V> next = it.next();
            adzo.v(this, next.getKey(), next.getValue());
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
        aety aetyVarA = aeig.a(this);
        int size = size();
        boolean z = true;
        while (size != 0) {
            if (!z) {
                sb.append(", ");
            }
            size--;
            aein aeinVar = (aein) aetyVarA.next();
            sb.append(String.valueOf(aeinVar.a()));
            sb.append("=>");
            if (this == aeinVar.getValue()) {
                sb.append("(this map)");
            } else {
                sb.append(String.valueOf(aeinVar.getValue()));
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        return adzo.w(this, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
