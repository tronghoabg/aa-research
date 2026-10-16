package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
final class fue implements epf {
    final /* synthetic */ geu a;
    final /* synthetic */ fug b;

    public fue(fug fugVar, geu geuVar) {
        this.a = geuVar;
        this.b = fugVar;
    }

    private final void g(epr eprVar) {
        gmg gmgVar = this.b.b;
        if (gmgVar.i()) {
            gmgVar.c(eprVar);
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        g(epr.ON_STOP);
        this.a.z();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        fug fugVar = this.b;
        long j = fugVar.f;
        long j2 = jElapsedRealtime - j;
        if (j < 0 || j2 < 0) {
            gks.k("CarApp.H", "Negative duration %d or negative last start time %d", Long.valueOf(j2), Long.valueOf(fugVar.f));
            return;
        }
        gns gnsVar = fugVar.c;
        gnq gnqVarB = gnr.b(2, fugVar.b.c);
        gnqVarB.b = xxh.h(Long.valueOf(j2));
        gnsVar.d(gnqVarB);
        fugVar.f = -1L;
    }

    @Override // defpackage.epf
    public final void fM() {
        g(epr.ON_PAUSE);
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        g(epr.ON_RESUME);
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        this.a.z();
        this.b.f = SystemClock.elapsedRealtime();
        g(epr.ON_START);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }
}
