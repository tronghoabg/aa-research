package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public class cbw<K, V> extends afav<K, V> implements Map<K, V>, j$.util.Map<K, V>, afgg {
    public cce a;
    public Object b;
    public int c;
    public int d;
    public czz e = new czz();
    private cbu f;

    public cbw(cbu cbuVar) {
        this.f = cbuVar;
        cbu cbuVar2 = this.f;
        this.a = cbuVar2.b;
        this.d = cbuVar2.a();
    }

    @Override // defpackage.afav
    public final int a() {
        return this.d;
    }

    public cbu b() {
        cce cceVar = this.a;
        cbu cbuVar = this.f;
        if (cceVar != cbuVar.b) {
            this.e = new czz();
            cbuVar = new cbu(cceVar, a());
        }
        this.f = cbuVar;
        return cbuVar;
    }

    @Override // defpackage.afav
    public final Collection c() {
        return new cca(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = cce.a;
        f(0);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.afav
    public final Set d() {
        return new cbr(this);
    }

    @Override // defpackage.afav
    public final Set e() {
        return new cbz(this);
    }

    public final void f(int i) {
        this.d = i;
        this.c++;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.a.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.b = null;
        this.a = this.a.e(k != null ? k.hashCode() : 0, k, v, 0, this);
        return (V) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        cbu cbuVarB = map instanceof cbu ? (cbu) map : null;
        if (cbuVarB == null) {
            cbw cbwVar = map instanceof cbw ? (cbw) map : null;
            cbuVarB = cbwVar != null ? cbwVar.b() : null;
        }
        if (cbuVarB == null) {
            super.putAll(map);
            return;
        }
        ccm ccmVar = new ccm(null);
        int iA = a();
        cce cceVar = this.a;
        cce cceVar2 = cbuVarB.b;
        cceVar2.getClass();
        this.a = cceVar.f(cceVar2, 0, ccmVar, this);
        int iA2 = (cbuVarB.a() + iA) - ccmVar.a;
        if (iA != iA2) {
            f(iA2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iA = a();
        cce cceVarH = this.a.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (cceVarH == null) {
            cceVarH = cce.a;
        }
        this.a = cceVarH;
        return iA != a();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.b = null;
        cce cceVarG = this.a.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (cceVarG == null) {
            cceVarG = cce.a;
        }
        this.a = cceVarG;
        return (V) this.b;
    }
}
