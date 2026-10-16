package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ynf extends defpackage.yim {
    final /* synthetic */ defpackage.ynh a;

    public ynf(defpackage.ynh ynhVar) {
        this.a = ynhVar;
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.yon) {
            defpackage.yon yonVar = (defpackage.yon) obj;
            java.lang.Object objA = this.a.a(yonVar.b(), yonVar.a());
            if (objA != null && objA.equals(yonVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yim
    public final /* bridge */ /* synthetic */ java.lang.Object h(int i) {
        return this.a.i(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.f();
    }

    @Override // defpackage.yim, defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
