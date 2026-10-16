package defpackage;

import android.content.ComponentName;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class lrh implements eqn, epf {
    private static final yph a = yph.c("GH.PlaybackOnlyMetrics");
    private ComponentName b;
    private Long c;

    private final void g() {
        oit.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.c;
        l.getClass();
        long jLongValue = jElapsedRealtime - l.longValue();
        a.l().L("Logging PLAYING state for %s (%d ms)", this.b, jLongValue);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fZ);
        rrbVarH.p(this.b);
        rrbVarH.u(jLongValue);
        ohsVarJ.F(rrbVarH.l());
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.eqn
    public final /* bridge */ /* synthetic */ void eS(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        ComponentName componentName2 = this.b;
        if (affa.f(componentName, componentName2)) {
            return;
        }
        if (componentName2 != null && this.c != null) {
            g();
        }
        if (componentName != null) {
            this.b = componentName;
            oit.a();
            this.c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        if (this.b != null) {
            g();
        }
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

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
