package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class nqx implements nqj {
    private static final yph e = yph.c("GH.ImmersiveToolbar");
    public noh c;
    public noh d;
    public final eqa b = lbh.d();
    private final Handler f = new Handler(Looper.getMainLooper());
    private final Runnable g = new nqw(this, 0);

    private final noh g(ComponentName componentName, boolean z) {
        Object objT = khc.t(new wci("GH.ImmersiveToolbar", yzz.IMMERSIVE_MODE, yzy.LB, "Unable to create immersive toolbar", new Object[0]), new ncy(this, z, z ? (nra) nqq.c(nra.class, componentName) : (nqv) nqq.c(nqv.class, componentName), 4));
        objT.getClass();
        return (noh) objT;
    }

    private final void h() {
        wer.c();
        Handler handler = this.f;
        Runnable runnable = this.g;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, aisq.e(nqi.b));
    }

    @Override // defpackage.nqj
    public final void a(boolean z) {
        wer.c();
        Handler handler = this.f;
        Runnable runnable = this.g;
        handler.removeCallbacks(runnable);
        if (!z) {
            runnable.run();
            return;
        }
        yph yphVar = e;
        yphVar.l().u("Finishing top toolbar");
        noh nohVar = this.c;
        if (nohVar != null) {
            nohVar.d();
        }
        this.c = null;
        yphVar.l().u("Finishing bottom scrim");
        noh nohVar2 = this.d;
        if (nohVar2 != null) {
            nohVar2.d();
        }
        this.d = null;
    }

    @Override // defpackage.nqj
    public final void b() {
        wer.c();
        nqq nqqVarF = f();
        if (nqqVarF == null || !nqqVarF.g()) {
            e.l().u("Ignoring call to refreshToolbarTimeout while toolbar is not showing.");
        } else {
            e.l().u("refreshToolbarTimeout, resetting auto-dismiss timer");
            h();
        }
    }

    @Override // defpackage.nqj
    public final void c(ComponentName componentName) {
        wer.c();
        nqq nqqVarF = f();
        if (nqqVarF != null && nqqVarF.g()) {
            e.l().u("Ignoring request to show toolbar while already showing");
            return;
        }
        if (this.c == null) {
            this.c = g(componentName, true);
        }
        if (this.d == null) {
            this.d = g(componentName, false);
        }
        noh nohVar = this.c;
        if (nohVar != null) {
            nohVar.j(false);
            nqq nqqVarF2 = f();
            if (nqqVarF2 != null) {
                nqqVarF2.f(true);
            }
            noh nohVar2 = this.d;
            if (nohVar2 != null) {
                nohVar2.j(false);
                nqq nqqVarE = e();
                if (nqqVarE != null) {
                    nqqVarE.f(true);
                }
            }
            h();
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.IMMERSIVE_MODE, yzy.LC);
            rrbVarH.p(componentName);
            ohsVarJ.F(rrbVarH.l());
        }
    }

    @Override // defpackage.nqj
    public final boolean d() {
        if (acpf.m()) {
            return false;
        }
        nso nsoVarB = nsr.c().b();
        if (!nsoVarB.D() || nsoVarB.F()) {
            return (nsoVarB.n(nsn.e) == null || nsoVarB.n(nsn.f) == null) ? false : true;
        }
        return false;
    }

    public final nqq e() {
        noh nohVar = this.d;
        if (nohVar != null) {
            return (nqq) nohVar.a();
        }
        return null;
    }

    public final nqq f() {
        noh nohVar = this.c;
        if (nohVar != null) {
            return (nqq) nohVar.a();
        }
        return null;
    }
}
