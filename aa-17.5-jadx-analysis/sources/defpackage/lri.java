package defpackage;

import android.content.ComponentName;
import android.os.SystemClock;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Objects;

/* loaded from: classes.dex */
final class lri implements eqn, epf {
    private static final yph b = yph.c("GH.MediaPlayDurMetrics");
    lok a;
    private ComponentName c;
    private AaPlaybackState d;
    private boolean e;
    private long f;

    private static int g(AaPlaybackState aaPlaybackState) {
        return ((Integer) new ntn((Integer) spu.aT(aaPlaybackState, new llx(15))).i(0)).intValue();
    }

    private static void h(AaPlaybackState aaPlaybackState, long j, ComponentName componentName, boolean z) {
        yzy yzyVar;
        int iG = g(aaPlaybackState);
        if (iG == 0) {
            yzyVar = yzy.fR;
        } else if (iG == 1 || iG == 2) {
            yzyVar = yzy.fU;
        } else if (iG == 3) {
            yzyVar = yzy.fT;
        } else if (iG == 6) {
            yzyVar = yzy.fS;
        } else if (iG != 7) {
            if (iG != 8) {
                return;
            }
            yzyVar = yzy.fS;
        } else {
            yzyVar = yzy.fQ;
        }
        ohs ohsVarJ = ebf.j();
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = yzz.MEDIA_FACET;
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzyVar);
        rrbVarH.p(componentName);
        rrbVarH.u(j);
        ohsVarJ.F(rrbVarH.l());
        if (z && iG == 3) {
            ((ype) b.l().ai(4217)).x("Exiting PLAYING state on remote session (%d ms)", j);
            ohs ohsVarJ2 = ebf.j();
            rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.fV);
            rrbVarH2.p(componentName);
            rrbVarH2.u(j);
            ohsVarJ2.F(rrbVarH2.l());
        }
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        lre lreVar = (lre) obj;
        ComponentName componentName = lreVar.a;
        ComponentName componentName2 = this.c;
        lok lokVar = this.a;
        AaPlaybackState aaPlaybackState = this.d;
        boolean z = this.e;
        this.c = componentName;
        this.a = lreVar.b;
        this.d = lreVar.c;
        this.e = lreVar.d;
        oit.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zEquals = Objects.equals(componentName2, this.c);
        if (!zEquals && componentName2 != null && lokVar == lok.b) {
            h(aaPlaybackState, jElapsedRealtime - this.f, componentName2, z);
        }
        if (this.c == null) {
            return;
        }
        boolean zEquals2 = Objects.equals(lokVar, this.a);
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
        } else if ((iOrdinal == 3 || iOrdinal == 5) && zEquals && lokVar == lok.b) {
            h(aaPlaybackState, jElapsedRealtime - this.f, this.c, z);
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        oit.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ComponentName componentName = this.c;
        if (componentName == null || this.a != lok.b) {
            return;
        }
        h(this.d, jElapsedRealtime - this.f, componentName, this.e);
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        oit.a();
        this.f = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
