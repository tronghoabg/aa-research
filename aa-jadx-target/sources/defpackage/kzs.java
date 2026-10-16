package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kzs implements kzq {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AssistantScrimMan");
    private static final j$.time.Duration c = j$.time.Duration.ofSeconds(5);
    private boolean d;
    private final java.lang.Runnable e = new defpackage.img(9);
    public defpackage.noz b = null;
    private final android.os.Handler f = new android.os.Handler(android.os.Looper.getMainLooper());

    public static defpackage.kzs b() {
        return (defpackage.kzs) defpackage.mkp.a.b(defpackage.kzs.class, new defpackage.jqx(18));
    }

    public static com.google.android.gms.car.display.CarRegionId c(defpackage.nta ntaVar) {
        return defpackage.nte.c().b().r(ntaVar);
    }

    public static /* synthetic */ void e() {
        if (!defpackage.kit.b().r()) {
            ((defpackage.yqj) a.l().ai((char) 3664)).u("Projection stopping, no need to tear down assistant activities");
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3667)).u("Assistant took too long to dismiss, tearing down the activities");
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        defpackage.zbe zbeVar = defpackage.zbe.ASSISTANT_SCRIM;
        defpackage.zbd zbdVar = defpackage.zbd.Ln;
        oimVarU.F(defpackage.rrw.h(yzdVar, zbeVar, zbdVar).l());
        defpackage.kgu.d(new nsa(1), "GH.AssistantScrimMan", zbeVar, zbdVar, "Unable to tear down assistant", new java.lang.Object[0]);
    }

    public static void f(com.google.android.gms.car.display.CarRegionId carRegionId) throws defpackage.qst {
        defpackage.mkp.a.g();
        defpackage.oml.E(defpackage.kit.b().e(), carRegionId);
    }

    public final void a(defpackage.zbd zbdVar) {
        ((defpackage.yqj) a.l().ai((char) 3661)).u("Dismissing assistant");
        defpackage.kxi kxiVarC = defpackage.kpu.c();
        java.lang.Integer num = (java.lang.Integer) kxiVarC.i().e();
        kxiVarC.j(defpackage.yxp.SCRIM_CLICKED);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT_SCRIM, zbdVar).l());
        if (this.d) {
            return;
        }
        if (!j$.util.Objects.equals(num, 2)) {
            e();
        } else {
            this.f.postDelayed(this.e, c.toMillis());
            this.d = true;
        }
    }

    public final void d() {
        if (this.b == null) {
            ((defpackage.yqj) a.l().ai((char) 3663)).u("No fragment, nothing to hide");
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 3662)).u("Hiding");
        defpackage.noz nozVar = this.b;
        nozVar.getClass();
        nozVar.d();
        this.b = null;
        this.f.removeCallbacks(this.e);
        this.d = false;
    }
}
