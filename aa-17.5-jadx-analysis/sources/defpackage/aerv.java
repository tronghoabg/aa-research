package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aerv<K> extends aerp<K> implements Serializable, Cloneable, Map<K, Integer>, aert {
    private static final long serialVersionUID = -7046029254386353129L;
    protected transient aeum b;
    protected transient aeum c;
    protected transient aejf d;

    public aerv(Object obj) {
        super(obj);
    }

    @Override // defpackage.aeqk, defpackage.aern
    public final /* synthetic */ Integer c(Object obj) {
        return adqq.ab(this, obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ void clear() {
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

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return ((Integer) obj).intValue() == 0;
    }

    @Override // defpackage.aert
    @Deprecated
    public final aeum e() {
        throw null;
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
        if (map.size() != 1) {
            return false;
        }
        return ((Map.Entry) map.entrySet().iterator().next()).equals(((aeuo) entrySet()).iterator().next());
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
        return adqq.ab(this, obj);
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
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer i(Object obj, Integer num) {
        return adqq.ac(this, obj, num);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer j(Object obj, Integer num) {
        return adqq.R(this, obj, num);
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer k(Object obj) {
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        if (this.c == null) {
            Object obj = this.a;
            aeun aeunVar = aeuq.a;
            this.c = new aeuo(obj);
        }
        return this.c;
    }

    @Override // defpackage.aert
    public final /* synthetic */ Integer l(Object obj, Integer num) {
        return adqq.S(this, obj, num);
    }

    @Override // defpackage.aert
    public final boolean m(int i) {
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

    @Override // java.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final aeum entrySet() {
        if (this.b == null) {
            aeql aeqlVar = new aeql(this.a);
            aeun aeunVar = aeuq.a;
            this.b = new aeuo(aeqlVar);
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Integer put(Object obj, Integer num) {
        return i(obj, num);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends Integer> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j(obj, (Integer) obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ Integer remove(Object obj) {
        return adqq.ad(this, obj);
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
        return "{" + this.a.toString() + "=>0}";
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection<Integer> values() {
        if (this.d == null) {
            aekg aekgVar = aekj.a;
            this.d = new aekh();
        }
        return this.d;
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
