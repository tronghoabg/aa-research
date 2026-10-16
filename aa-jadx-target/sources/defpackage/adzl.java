package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adzl extends defpackage.adrs {
    final /* synthetic */ defpackage.adzm a;
    private final defpackage.adrs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adzl(defpackage.adzm adzmVar, defpackage.adrs adrsVar) {
        super(null);
        this.a = adzmVar;
        this.b = adrsVar;
    }

    @Override // defpackage.adrs
    public final defpackage.ador A(defpackage.adnq adnqVar) {
        defpackage.ador adorVarA = this.b.A(adnqVar);
        boolean zG = adorVarA.g();
        defpackage.adzm adzmVar = this.a;
        if (zG) {
            adzmVar.c.a();
            return adorVarA;
        }
        java.lang.Runnable adxwVar = new adxw(adzmVar, 10);
        defpackage.adst adstVar = (defpackage.adst) adzmVar.c;
        defpackage.adox adoxVar = adstVar.c;
        adoxVar.c();
        if (adstVar.d == null) {
            adstVar.d = new defpackage.adup();
        }
        defpackage.aecg aecgVar = adstVar.e;
        if (aecgVar != null && aecgVar.i()) {
            return adorVarA;
        }
        long jA = adstVar.d.a();
        adstVar.e = adoxVar.d(adxwVar, jA, java.util.concurrent.TimeUnit.NANOSECONDS, adstVar.b);
        defpackage.adst.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", java.lang.Long.valueOf(jA));
        return adorVarA;
    }
}
