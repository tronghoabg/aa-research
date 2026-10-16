package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class okz extends defpackage.okb {
    final /* synthetic */ defpackage.ola a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okz(defpackage.ola olaVar) {
        super(olaVar);
        this.a = olaVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.oky(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.startup_diagnostic_heading);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.startup_diagnostic_message);
    }

    @Override // defpackage.okf
    public final boolean e() {
        return !this.a.e();
    }

    @Override // defpackage.okf
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.okf
    public final int g() {
        return defpackage.acyl.e() ? 2 : 0;
    }

    @Override // defpackage.okf
    public final int h() {
        return defpackage.acyl.e() ? 1 : -1;
    }

    @Override // defpackage.okf
    public final defpackage.xyn i() {
        android.content.Intent intentC = defpackage.ola.c();
        intentC.addFlags(335544320);
        return defpackage.xyn.h(intentC);
    }

    @Override // defpackage.okf
    public final defpackage.xyn j() {
        return defpackage.xyn.h(defpackage.yyn.TROUBLESHOOTER_STARTUP_DIAGNOSTIC_DETECTED);
    }

    @Override // defpackage.okf
    public final defpackage.xyn l() {
        return defpackage.xyn.h(defpackage.yyn.TROUBLESHOOTER_STARTUP_DIAGNOSTIC_NOTIFIED);
    }

    @Override // defpackage.okf
    public final defpackage.xyn m() {
        return defpackage.xyn.h(defpackage.yyn.TROUBLESHOOTER_STARTUP_DIAGNOSTIC_RESOLVED);
    }

    @Override // defpackage.okf
    public final java.lang.String o() {
        if (defpackage.acyl.e()) {
            defpackage.maz.c();
            return "gearhead_alerts";
        }
        defpackage.maz.c();
        return "gearhead_connection_status";
    }

    @Override // defpackage.okf
    public final int q() {
        return 2;
    }
}
