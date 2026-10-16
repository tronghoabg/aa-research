package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lro implements defpackage.eqt, defpackage.epl {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.MediaPlayDurMetrics");
    defpackage.lor a;
    private android.content.ComponentName c;
    private com.google.android.apps.auto.components.media.compat.AaPlaybackState d;
    private boolean e;
    private long f;

    private static int g(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState) {
        return ((java.lang.Integer) new defpackage.nub((java.lang.Integer) defpackage.sqs.aJ(aaPlaybackState, new defpackage.lmd(15))).i(0)).intValue();
    }

    private static void h(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, long j, android.content.ComponentName componentName, boolean z) {
        defpackage.zbd zbdVar;
        int iG = g(aaPlaybackState);
        if (iG == 0) {
            zbdVar = defpackage.zbd.fR;
        } else if (iG == 1 || iG == 2) {
            zbdVar = defpackage.zbd.fU;
        } else if (iG == 3) {
            zbdVar = defpackage.zbd.fT;
        } else if (iG == 6) {
            zbdVar = defpackage.zbd.fS;
        } else if (iG != 7) {
            if (iG != 8) {
                return;
            }
            zbdVar = defpackage.zbd.fS;
        } else {
            zbdVar = defpackage.zbd.fQ;
        }
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        defpackage.zbe zbeVar = defpackage.zbe.MEDIA_FACET;
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, zbdVar);
        rrvVarH.p(componentName);
        rrvVarH.u(j);
        oimVarU.F(rrvVarH.l());
        if (z && iG == 3) {
            ((defpackage.yqj) b.l().ai(4220)).x("Exiting PLAYING state on remote session (%d ms)", j);
            defpackage.oim oimVarU2 = defpackage.omf.u();
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.fV);
            rrvVarH2.p(componentName);
            rrvVarH2.u(j);
            oimVarU2.F(rrvVarH2.l());
        }
    }

    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        defpackage.ojm.a();
        this.f = android.os.SystemClock.elapsedRealtime();
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        defpackage.ojm.a();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.content.ComponentName componentName = this.c;
        if (componentName == null || this.a != defpackage.lor.b) {
            return;
        }
        h(this.d, jElapsedRealtime - this.f, componentName, this.e);
    }

    @Override // defpackage.eqt
    public final /* synthetic */ void ea(java.lang.Object obj) {
        defpackage.lrk lrkVar = (defpackage.lrk) obj;
        android.content.ComponentName componentName = lrkVar.a;
        android.content.ComponentName componentName2 = this.c;
        defpackage.lor lorVar = this.a;
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = this.d;
        boolean z = this.e;
        this.c = componentName;
        this.a = lrkVar.b;
        this.d = lrkVar.c;
        this.e = lrkVar.d;
        defpackage.ojm.a();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean zEquals = j$.util.Objects.equals(componentName2, this.c);
        if (!zEquals && componentName2 != null && lorVar == defpackage.lor.b) {
            h(aaPlaybackState, jElapsedRealtime - this.f, componentName2, z);
        }
        if (this.c == null) {
            return;
        }
        boolean zEquals2 = j$.util.Objects.equals(lorVar, this.a);
        if (zEquals && zEquals2) {
            if (g(aaPlaybackState) != g(this.d)) {
                h(aaPlaybackState, jElapsedRealtime - this.f, this.c, this.e);
                this.f = jElapsedRealtime;
                return;
            }
            return;
        }
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 1) {
            this.f = jElapsedRealtime;
        } else if ((iOrdinal == 3 || iOrdinal == 5) && zEquals && lorVar == defpackage.lor.b) {
            h(aaPlaybackState, jElapsedRealtime - this.f, this.c, z);
        }
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }
}
