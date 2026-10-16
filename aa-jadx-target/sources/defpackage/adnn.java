package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adnn {
    public final int a;
    public final adoe b;
    public final defpackage.adox c;
    public final defpackage.adnr d;
    public final java.util.concurrent.ScheduledExecutorService e;
    public final java.util.concurrent.Executor f;
    private final defpackage.adjy g;
    private final adni h;
    private final defpackage.adnu i;
    private final java.util.IdentityHashMap j;

    public adnn(adnl adnlVar) {
        java.lang.Integer num = adnlVar.a;
        num.getClass();
        num.intValue();
        this.a = 443;
        adoe adoeVar = adnlVar.b;
        adoeVar.getClass();
        this.b = adoeVar;
        defpackage.adox adoxVar = adnlVar.c;
        adoxVar.getClass();
        this.c = adoxVar;
        defpackage.adnr adnrVar = adnlVar.d;
        adnrVar.getClass();
        this.d = adnrVar;
        this.e = adnlVar.e;
        this.g = adnlVar.f;
        this.f = adnlVar.g;
        adnk adnkVar = adnlVar.h;
        this.h = adnkVar == null ? new adnk() : adnkVar;
        this.i = adnlVar.i;
        java.util.IdentityHashMap identityHashMap = adnlVar.j;
        this.j = identityHashMap != null ? new java.util.IdentityHashMap(identityHashMap) : null;
    }

    public final java.lang.Object a(defpackage.adnm adnmVar) {
        java.util.IdentityHashMap identityHashMap = this.j;
        if (identityHashMap != null) {
            return identityHashMap.get(adnmVar);
        }
        return null;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.f("defaultPort", this.a);
        xymVarBy.b("proxyDetector", this.b);
        xymVarBy.b("syncContext", this.c);
        xymVarBy.b("serviceConfigParser", this.d);
        xymVarBy.b("customArgs", this.j);
        xymVarBy.b("scheduledExecutorService", this.e);
        xymVarBy.b("channelLogger", this.g);
        xymVarBy.b("executor", this.f);
        xymVarBy.b("overrideAuthority", null);
        xymVarBy.b("metricRecorder", this.h);
        xymVarBy.b("nameResolverRegistry", this.i);
        return xymVarBy.toString();
    }
}
