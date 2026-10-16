package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yma<K, V> extends defpackage.ylw<K, java.util.Collection<V>> {
    public final defpackage.ylx a;

    public yma(defpackage.ylx ylxVar) {
        this.a = ylxVar;
    }

    @Override // defpackage.ylw
    public final java.util.Set b() {
        return new defpackage.ylz(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        defpackage.yjl yjlVar = (defpackage.yjl) this.a;
        yjlVar.a = null;
        yjlVar.b = null;
        yjlVar.c.clear();
        yjlVar.d = 0;
        yjlVar.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.a.s(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (containsKey(obj)) {
            return new defpackage.yjb((defpackage.yjl) this.a, obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.a.A();
    }

    @Override // defpackage.ylw, java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        return this.a.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        if (containsKey(obj)) {
            return ((defpackage.yjl) this.a).g(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.x().size();
    }
}
