package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class sgc {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.SETUP");
    private final android.content.Context b;
    private final defpackage.sgb c;

    public sgc(android.content.Context context, defpackage.sgb sgbVar) {
        this.b = context;
        this.c = sgbVar;
    }

    public abstract void a(defpackage.zaj zajVar, defpackage.zak zakVar);

    public abstract void b();

    public final void c(defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        a.g().ai(8881).T("ProjectionErrorCode = %s(%d), ProjectionErrorDetail = %s(%d), %s", zajVar == null ? "unknown" : zajVar.name(), java.lang.Integer.valueOf(zajVar == null ? 0 : zajVar.D), zakVar != null ? zakVar.name() : "unknown", java.lang.Integer.valueOf(zakVar != null ? zakVar.az : 0), str);
        qsp.n(this.b, zajVar, this.c.a(), zakVar);
        a(zajVar, zakVar);
    }

    public final void d(defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        defpackage.ypu ypuVarAi = a.h().ai(8882);
        int i = zakVar.az;
        ypuVarAi.T("ProjectionErrorCode = %s(%d), ProjectionErrorDetail = %s(%d), %s", zajVar.name(), java.lang.Integer.valueOf(zajVar.D), zakVar.name(), java.lang.Integer.valueOf(i), str);
        a(zajVar, zakVar);
    }
}
