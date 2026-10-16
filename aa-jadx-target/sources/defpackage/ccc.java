package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ccc<K, V> extends defpackage.afbv<K, V> implements java.util.Map<K, V>, j$.util.Map<K, V>, defpackage.afhg {
    public defpackage.cck a;
    public java.lang.Object b;
    public int c;
    public int d;
    public defpackage.bzo e = new defpackage.bzo();
    private defpackage.cca f;

    public ccc(defpackage.cca ccaVar) {
        this.f = ccaVar;
        defpackage.cca ccaVar2 = this.f;
        this.a = ccaVar2.b;
        this.d = ccaVar2.a();
    }

    @Override // defpackage.afbv
    public final int a() {
        return this.d;
    }

    public defpackage.cca b() {
        defpackage.cck cckVar = this.a;
        defpackage.cca ccaVar = this.f;
        if (cckVar != ccaVar.b) {
            this.e = new defpackage.bzo();
            ccaVar = new defpackage.cca(cckVar, a());
        }
        this.f = ccaVar;
        return ccaVar;
    }

    @Override // defpackage.afbv
    public final java.util.Collection c() {
        return new defpackage.ccg(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = defpackage.cck.a;
        f(0);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.a.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.afbv
    public final java.util.Set d() {
        return new defpackage.cbx(this);
    }

    @Override // defpackage.afbv
    public final java.util.Set e() {
        return new defpackage.ccf(this);
    }

    public final void f(int i) {
        this.d = i;
        this.c++;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        return (V) this.a.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.b = null;
        this.a = this.a.e(k != null ? k.hashCode() : 0, k, v, 0, this);
        return (V) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        defpackage.cca ccaVarB = map instanceof defpackage.cca ? (defpackage.cca) map : null;
        if (ccaVarB == null) {
            defpackage.ccc cccVar = map instanceof defpackage.ccc ? (defpackage.ccc) map : null;
            ccaVarB = cccVar != null ? cccVar.b() : null;
        }
        if (ccaVarB == null) {
            super.putAll(map);
            return;
        }
        defpackage.ccs ccsVar = new defpackage.ccs(null);
        int iA = a();
        defpackage.cck cckVar = this.a;
        defpackage.cck cckVar2 = ccaVarB.b;
        cckVar2.getClass();
        this.a = cckVar.f(cckVar2, 0, ccsVar, this);
        int iA2 = (ccaVarB.a() + iA) - ccsVar.a;
        if (iA != iA2) {
            f(iA2);
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iA = a();
        defpackage.cck cckVarH = this.a.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (cckVarH == null) {
            cckVarH = defpackage.cck.a;
        }
        this.a = cckVarH;
        return iA != a();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.-CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        this.b = null;
        defpackage.cck cckVarG = this.a.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (cckVarG == null) {
            cckVarG = defpackage.cck.a;
        }
        this.a = cckVarG;
        return (V) this.b;
    }
}
