package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lrz extends defpackage.lhm {
    public static final defpackage.yhe c;
    public final android.content.Context d;
    public android.content.ComponentName e;
    public android.content.ComponentName f;
    public j$.time.Instant g;
    public j$.time.Instant h;
    private final defpackage.eqt k = new defpackage.lnj(this, 11);
    private final defpackage.eqp l = defpackage.tcu.C(defpackage.tcu.w(defpackage.tcu.C(defpackage.lhe.b().a(defpackage.mqg.MEDIA), new defpackage.lqi(15)), new defpackage.lqi(16)), new defpackage.lqi(17));
    private static final defpackage.yqm i = defpackage.yqm.c("GH.MediaPBErrNotifier");
    public static final j$.time.Duration a = j$.time.Duration.ofSeconds(30);
    public static final j$.time.Duration b = j$.time.Duration.ofSeconds(60);

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(1, 2132084015);
        yhaVar.f(2, 2132084021);
        yhaVar.f(3, 2132084016);
        yhaVar.f(4, 2132084023);
        yhaVar.f(5, 2132084017);
        yhaVar.f(6, 2132084022);
        yhaVar.f(7, 2132084020);
        yhaVar.f(8, 2132084018);
        yhaVar.f(9, 2132084024);
        yhaVar.f(10, 2132084014);
        yhaVar.f(11, 2132084019);
        c = yhaVar.d(true);
    }

    public lrz(android.content.Context context) {
        this.d = context;
        defpackage.loo.b().eM(this, new defpackage.lnj(this, 12));
    }

    public final void a(java.lang.String str, android.content.ComponentName componentName, boolean z, boolean z2) {
        if (!z) {
            ((defpackage.yqj) i.l().ai((char) 4253)).u("A non-fatal playback error occurred, background app toast request not allowed.");
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.gT);
            rrvVarH.p(componentName);
            oimVarU.F(rrvVarH.l());
            return;
        }
        defpackage.ocn.a().g(this.d, componentName, str, 1);
        ((defpackage.yqj) i.l().ai(4254)).N("An error toast was requested: <%s> isCustom=%b", str, z2);
        defpackage.oim oimVarU2 = defpackage.omf.u();
        defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.gS);
        rrvVarH2.p(componentName);
        oimVarU2.F(rrvVarH2.l());
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        if (defpackage.actz.E()) {
            this.l.k(this.k);
            this.g = null;
            this.f = null;
            this.h = null;
        }
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        if (defpackage.actz.E()) {
            defpackage.ojm.a();
            this.h = j$.time.Instant.now();
            this.l.eM(this, this.k);
        }
    }
}
