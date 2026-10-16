package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ymk extends defpackage.ynr {
    final /* synthetic */ defpackage.ydb b;

    public ymk(defpackage.ydb ydbVar) {
        this.b = ydbVar;
    }

    public defpackage.ymh a() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.ymg) {
            defpackage.ymg ymgVar = (defpackage.ymg) obj;
            if (ymgVar.a() > 0 && a().a(ymgVar.b()) == ymgVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return this.b.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ymg)) {
            return false;
        }
        defpackage.ymg ymgVar = (defpackage.ymg) obj;
        java.lang.Object objB = ymgVar.b();
        int iA = ymgVar.a();
        if (iA != 0) {
            return a().g(objB, iA);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.b();
    }
}
