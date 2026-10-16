package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yec extends java.util.AbstractCollection {
    final /* synthetic */ defpackage.yed a;

    public yec(defpackage.yed yedVar) {
        this.a = yedVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.yed yedVar = this.a;
        java.util.Map mapN = yedVar.n();
        return mapN != null ? mapN.values().iterator() : new defpackage.ydx(yedVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
