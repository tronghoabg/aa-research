package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yea extends java.util.AbstractSet {
    final /* synthetic */ defpackage.yed a;

    public yea(defpackage.yed yedVar) {
        this.a = yedVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        defpackage.yed yedVar = this.a;
        java.util.Map mapN = yedVar.n();
        return mapN != null ? mapN.keySet().iterator() : new defpackage.ydv(yedVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        defpackage.yed yedVar = this.a;
        java.util.Map mapN = yedVar.n();
        if (mapN != null) {
            return mapN.keySet().remove(obj);
        }
        return yedVar.h(obj) != defpackage.yed.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
