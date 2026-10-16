package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ydy extends java.util.AbstractSet {
    final /* synthetic */ defpackage.yed a;

    public ydy(defpackage.yed yedVar) {
        this.a = yedVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        defpackage.yed yedVar = this.a;
        java.util.Map mapN = yedVar.n();
        if (mapN != null) {
            return mapN.entrySet().contains(obj);
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int iF = yedVar.f(entry.getKey());
            if (iF != -1 && j$.util.Objects.equals(yedVar.j(iF), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry> iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iE;
        int iAC;
        defpackage.yed yedVar = this.a;
        java.util.Map mapN = yedVar.n();
        if (mapN != null) {
            return mapN.entrySet().remove(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (yedVar.u() || (iAC = defpackage.ysr.aC(entry.getKey(), entry.getValue(), (iE = yedVar.e()), yedVar.i(), yedVar.v(), yedVar.w(), yedVar.x())) == -1) {
            return false;
        }
        yedVar.r(iAC, iE);
        yedVar.f--;
        yedVar.o();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
