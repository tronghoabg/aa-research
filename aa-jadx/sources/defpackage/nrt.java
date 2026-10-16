package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nrt {
    public java.lang.Object a;
    private final java.lang.Object b;
    private final java.lang.Object c;
    private final java.lang.Object d;
    private final boolean e;

    public nrt(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = z;
        ((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fV(new defpackage.nrs(this));
    }

    public final java.lang.Object a() {
        defpackage.yqm yqmVar = defpackage.kit.a;
        java.lang.Object obj = null;
        if (((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).r()) {
            java.lang.Object obj2 = this.a;
            if (obj2 == null) {
                try {
                    defpackage.qsh qshVarE = ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).e();
                    qshVarE.getClass();
                    boolean z = false;
                    defpackage.row rowVar = (defpackage.row) defpackage.khg.u(new defpackage.wde("GH.InputCheckingFlag", defpackage.zbe.SYSTEM_UI, defpackage.zbd.oN, "Cannot access car", new java.lang.Object[0]), new defpackage.npq(qshVarE, 13));
                    if (rowVar.b() || (((com.google.android.gms.car.CarUiInfo) rowVar.a).f && rowVar.a())) {
                        z = true;
                    }
                    boolean zC = rowVar.c();
                    if (z && zC) {
                        obj = this.d;
                    } else {
                        obj = (this.e || !z) ? this.b : this.c;
                    }
                } catch (java.lang.IllegalStateException unused) {
                }
            } else {
                obj = obj2;
            }
        }
        java.lang.Object obj3 = this.a;
        if (obj3 == null && obj != null) {
            this.a = obj;
            obj3 = obj;
        }
        if (this.e) {
            return this.b;
        }
        if (obj == null) {
            return obj3 == null ? this.b : obj3;
        }
        return obj;
    }
}
