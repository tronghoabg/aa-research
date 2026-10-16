package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class igk implements defpackage.dzr {
    private final defpackage.igj a;
    private final defpackage.igm b;
    private final defpackage.dzr c;

    public igk(defpackage.dzr dzrVar, defpackage.igj igjVar, defpackage.igm igmVar) {
        this.c = dzrVar;
        this.a = igjVar;
        this.b = igmVar;
    }

    @Override // defpackage.dzr
    public final java.lang.Object a() {
        java.lang.Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
            if (android.util.Log.isLoggable("FactoryPools", 2)) {
                android.util.Log.v("FactoryPools", "Created new ".concat(java.lang.String.valueOf(java.lang.String.valueOf(objA.getClass()))));
            }
        }
        if (objA instanceof defpackage.igl) {
            ((defpackage.igl) objA).f().a = false;
        }
        return objA;
    }

    @Override // defpackage.dzr
    public final boolean b(java.lang.Object obj) {
        if (obj instanceof defpackage.igl) {
            ((defpackage.igl) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
