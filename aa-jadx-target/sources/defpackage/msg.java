package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class msg implements defpackage.lhn, defpackage.ntd {
    public static final defpackage.msf a = new defpackage.msf();
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 16);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.CarCompatManager");
    public final android.content.Context d;
    public boolean e;
    private boolean f;
    private final defpackage.eqt g = new defpackage.kkr(this, 3);

    public msg(android.content.Context context) {
        this.d = context;
    }

    private static final boolean e() {
        if (!defpackage.acyc.a.fF().Z()) {
            c.l().u("Compat mode kill switch is enabled, compat mode not allowed");
            return false;
        }
        defpackage.yqm yqmVar = defpackage.nte.a;
        if (((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).g) {
            return true;
        }
        c.l().u("No car controls, compat mode not allowed");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    public final void a(com.google.android.gms.car.display.CarDisplay carDisplay) {
        boolean z;
        java.lang.Integer num;
        if (this.e || !e()) {
            return;
        }
        if (carDisplay == null) {
            defpackage.yqm yqmVar = defpackage.nte.a;
            carDisplay = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().t;
        }
        boolean z2 = ((long) android.os.Build.VERSION.SDK_INT) < defpackage.acyc.d();
        boolean z3 = ((long) ((android.os.Build.VERSION.SDK_INT < 29 || (num = (java.lang.Integer) defpackage.ojl.a.a().e.e()) == null) ? 0 : num.intValue())) >= defpackage.acyc.e();
        if (carDisplay != null) {
            android.graphics.Point point = carDisplay.d;
            java.lang.Integer numValueOf = point != null ? java.lang.Integer.valueOf(point.y) : null;
            z = numValueOf != null && numValueOf.intValue() <= 720;
        }
        ((defpackage.yqj) c.f()).R("Checking compat mode: osVersionLow=%b, thermalHigh=%b, videoLow=%b", java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z3), java.lang.Boolean.valueOf(z));
        if (z2 || z3 || z) {
            b(z3);
        }
    }

    public final void b(boolean z) {
        if (this.e) {
            return;
        }
        ((defpackage.yqj) c.f()).u("Entering compat mode");
        int i = 1;
        this.e = true;
        defpackage.nji njiVarA = defpackage.nji.a();
        njiVarA.j(false);
        njiVarA.l(false);
        njiVarA.k(false);
        defpackage.wfp.d(new defpackage.img(13), 300L);
        if (z) {
            defpackage.wfp.d(new defpackage.mta(this, i), 1000L);
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.f) {
            ((defpackage.yqj) c.f()).u("Stopping CarCompatManager");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                defpackage.ojl.a.a().e.k(this.g);
            }
            this.f = false;
        }
        if (this.e) {
            ((defpackage.yqj) c.f()).u("Exiting compat mode");
            this.e = false;
            defpackage.nte.c().f(false);
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (!e()) {
            c.l().u("Not starting CarCompatManager, compat mode not allowed");
            return;
        }
        ((defpackage.yqj) c.f()).u("Starting CarCompatManager");
        a(null);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.ojl.a.a().e.i(this.g);
        }
        this.f = true;
    }
}
