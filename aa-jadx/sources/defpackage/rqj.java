package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rqj {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public rqj(defpackage.aau aauVar, java.lang.String str, defpackage.afer aferVar) {
        this.a = aauVar;
        this.c = str;
        this.b = aferVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, pu] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, rqk] */
    public final void a(int i, boolean z) {
        defpackage.ysr.bj(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "onProjectionLifetimeStateChanged");
        }
        ?? r4 = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!((java.lang.Boolean) r4.a(numValueOf)).booleanValue()) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "Projection lifetime not at correct state: %s", numValueOf);
                return;
            }
            return;
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "Projection lifetime at correct state %s. Running action. startedLifetimeVerified:%b", numValueOf, java.lang.Boolean.valueOf(z));
        }
        java.lang.Object obj = this.c;
        defpackage.ysr.bj(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "unregisterProjectionLifetimeCallback");
        }
        defpackage.rqm rqmVar = (defpackage.rqm) obj;
        java.util.Set set = rqmVar.e;
        set.remove(this);
        if (!rqmVar.b && set.isEmpty()) {
            rqmVar.c();
        }
        this.b.a(z);
    }

    public final void b() {
        defpackage.aau aauVar = (defpackage.aau) this.a;
        java.lang.Object obj = this.c;
        java.util.List list = (java.util.List) aauVar.i(obj);
        if (list != null) {
            list.remove(this.b);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        aauVar.m(obj, list);
    }

    public /* synthetic */ rqj(defpackage.mdl mdlVar, defpackage.vlu vluVar, defpackage.rrw rrwVar) {
        this.a = mdlVar;
        this.b = vluVar;
        this.c = rrwVar;
    }

    public rqj(defpackage.rqm rqmVar, defpackage.pu puVar, defpackage.rqk rqkVar) {
        this.a = puVar;
        this.b = rqkVar;
        this.c = rqmVar;
    }
}
