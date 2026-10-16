package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class syw {
    public final defpackage.qof a;
    public final android.content.Context b;
    public final defpackage.syq c;
    public defpackage.ygw d;
    public final defpackage.ygw e;
    public final defpackage.yhe f;
    public final defpackage.syu g;
    public final boolean h;
    public final boolean i;

    public syw(defpackage.syv syvVar) {
        this.a = syvVar.a;
        android.content.Context context = syvVar.b;
        context.getClass();
        this.b = context;
        defpackage.syq syqVar = syvVar.c;
        syqVar.getClass();
        this.c = syqVar;
        this.d = syvVar.d;
        this.e = syvVar.e;
        this.f = defpackage.yhe.j(syvVar.f);
        this.g = syvVar.g;
        this.h = syvVar.h;
        this.i = syvVar.i;
    }

    public final defpackage.sys a(defpackage.qoh qohVar) {
        defpackage.sys sysVar = (defpackage.sys) this.f.get(qohVar);
        return sysVar == null ? new defpackage.sys(qohVar, 2) : sysVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ygw b() {
        defpackage.ygw ygwVar = this.d;
        if (ygwVar != null) {
            return ygwVar;
        }
        defpackage.rko rkoVar = new defpackage.rko(this.b);
        try {
            defpackage.ygw ygwVarO = defpackage.ygw.o((java.util.List) ((defpackage.zga) defpackage.zgh.f(((defpackage.whw) rkoVar.b).c(), new defpackage.ikt(20), rkoVar.a)).s());
            this.d = ygwVarO;
            return ygwVarO == null ? defpackage.ymx.a : ygwVarO;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalArgumentException("Retrieval of recent fix data failed", e);
        }
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("entry_point", this.a);
        xymVarBy.b("context", this.b);
        xymVarBy.b("appDoctorLogger", this.c);
        xymVarBy.b("recentFixes", this.d);
        xymVarBy.b("fixesExecutedThisIteration", this.e);
        xymVarBy.b("fixStatusesExecutedThisIteration", this.f);
        xymVarBy.b("currentFixer", this.g);
        xymVarBy.h("processRestartNeeded", this.h);
        xymVarBy.h("appRestartNeeded", this.i);
        return xymVarBy.toString();
    }
}
