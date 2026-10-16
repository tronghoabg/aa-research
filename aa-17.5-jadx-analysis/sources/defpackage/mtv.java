package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class mtv implements mud {
    static final /* synthetic */ afia[] a = {new affn(mtv.class, "perLifetimeState", "getPerLifetimeState()Lcom/google/android/apps/auto/components/system/dashboard/DashboardShadeWindowController$perLifetimeState$2$1;", 0)};
    public static final yph b = yph.c("GH.DashShadeWinCtrl");
    public final nfh g = new nfh(nsn.r);
    private final afgl i = new lhu(new ltd(this, 6), lho.a);
    public final eqm c = new lhr(muc.b, 2);
    public final eqm d = new lhr(false, 1);
    public final eqm e = new lhr(false, 1);
    private final nej j = new nej();
    public final qzx f = new qzx(this);

    private final void A() {
        nso nsoVar = d().a;
        if ((nsoVar.m() == nsv.a || nsoVar.m() == nsv.g || nsoVar.m() == nsv.h) && !nsoVar.H()) {
            mqc mqcVarE = mpd.b().e(CarRegionId.a);
            mpz mpzVar = mqcVarE != null ? mqcVarE.b : null;
            mpz mpzVar2 = mpz.b;
            if (mpzVar == mpzVar2) {
                b.l().u("Navigation already started when opening dashboard");
                return;
            }
            ComponentName componentNameA = lgv.a().a(mpzVar2);
            if (componentNameA != null) {
                b.l().u("Starting navigation for dashboard");
                mpe mpeVarA = mpe.a();
                Intent intent = new Intent();
                intent.setComponent(componentNameA);
                intent.putExtra("com.google.android.apps.auto.components.system.dashboard.EXTRA_FOR_DASHBOARD", true);
                intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1);
                mpeVarA.i(intent);
            }
        }
    }

    private final noh z(nso nsoVar) {
        Object objT = khc.t(new wci("GH.DashShadeWinCtrl", yzz.DASHBOARD, yzy.r, "Unable to show dashboard", new Object[0]), new mts(nsoVar, this, 0));
        objT.getClass();
        return (noh) objT;
    }

    @Override // defpackage.mud
    public final eqj a() {
        return this.c;
    }

    @Override // defpackage.mud
    public final eqj b() {
        return this.d;
    }

    @Override // defpackage.mud
    public final eqj c() {
        return this.e;
    }

    public final mtt d() {
        return (mtt) this.i.getValue(this, a[0]);
    }

    @Override // defpackage.mud
    public final nsn e() {
        return nsn.r;
    }

    @Override // defpackage.mud
    public final void f() {
        mtt mttVarD = d();
        if (mttVarD.b == null) {
            b.l().u("Redundant call to finish()");
            return;
        }
        if (mttVarD.d) {
            mwc.a(yzy.v, null);
            mttVarD.b(muc.c);
        }
        mttVarD.d = false;
        mttVarD.g = false;
        mttVarD.h = 0;
        noh nohVar = mttVarD.b;
        if (nohVar != null) {
            nohVar.d();
        }
        mttVarD.b = null;
        nej nejVar = this.j;
        Context context = mki.a.c;
        context.getClass();
        context.unregisterReceiver(nejVar);
        mtr.a.a().a();
        this.d.m(false);
        this.e.m(false);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void g(boolean z) {
        int i = mua.a;
        h(z, null);
    }

    @Override // defpackage.mud
    public final void h(boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        mtt mttVarD = d();
        if (!mttVarD.d) {
            b.l().u("Redundant call to hide()");
            return;
        }
        mttVarD.d = false;
        mttVarD.g = false;
        mttVarD.h = 0;
        boolean z2 = true;
        if (!z && projectionWindowAnimationParams == null) {
            z2 = false;
        }
        mttVarD.e = z2;
        if (projectionWindowAnimationParams == null) {
            noh nohVar = mttVarD.b;
            if (nohVar != null) {
                nohVar.e(z);
            }
        } else {
            noh nohVar2 = mttVarD.b;
            if (nohVar2 != null) {
                nohVar2.h(projectionWindowAnimationParams);
            }
        }
        mttVarD.b(muc.b);
        this.d.m(false);
        this.e.m(false);
        mtr.a.a().a();
        mwc.a(yzy.v, null);
    }

    @Override // defpackage.mud
    public final void i(boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        mtt mttVarD = d();
        if (!mttVarD.g) {
            b.l().u("Not expanded, early exiting collapse");
            return;
        }
        noh nohVar = mttVarD.b;
        if (nohVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        nohVar.l(0, null);
        mttVarD.g = false;
        mttVarD.b(muc.b);
    }

    @Override // defpackage.mud
    public final void j() {
        mtt mttVarD = d();
        this.d.m(true);
        nsu nsuVarL = nsr.c().b().l();
        int i = nsuVarL != null ? ((yls) nsuVarL.e).c : 1;
        int i2 = mttVarD.h;
        int i3 = i - 1;
        if (i2 >= i3) {
            mttVarD.i = false;
        } else if (i2 <= 1) {
            mttVarD.i = true;
        }
        int iMin = mttVarD.i ? Math.min(i2 + 1, i3) : 1;
        b.l().S("onDragHandleClicked: current=%d, next=%d, max=%d, isExpanding=%b", Integer.valueOf(mttVarD.h), Integer.valueOf(iMin), Integer.valueOf(i3), Boolean.valueOf(mttVarD.i));
        noh nohVar = mttVarD.b;
        if (nohVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        nohVar.l(iMin, null);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void k() {
        int i = mua.a;
        l(true);
    }

    @Override // defpackage.mud
    public final void l(boolean z) {
        if (d().a() > 0) {
            int i = mua.a;
            p(z, null);
            return;
        }
        mqc mqcVarF = mpd.b().f();
        if (mqcVarF == null || mqcVarF.b == mpz.b) {
            r(z);
        }
    }

    @Override // defpackage.mud
    public final void m() {
        mtt mttVarD = d();
        if (!mttVarD.g) {
            b.l().u("Dashboard shade not expanded, unable to retract");
            return;
        }
        int i = mttVarD.h;
        if (i <= 0) {
            ((ype) b.h()).w("Expanded but state is not retractable %s", i);
            return;
        }
        if (i == 1) {
            w();
            return;
        }
        noh nohVar = mttVarD.b;
        if (nohVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        nohVar.l(i - 1, null);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void n() {
        int i = mua.a;
        p(true, null);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void o(boolean z) {
        int i = mua.a;
        p(z, null);
    }

    @Override // defpackage.mud
    public final void p(boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        mtt mttVarD = d();
        nso nsoVar = mttVarD.a;
        if (!nsoVar.K()) {
            throw new IllegalStateException("Dashboard should only be shown when current display supports it");
        }
        boolean z2 = false;
        mttVarD.f = false;
        if (z) {
            A();
        }
        if (mttVarD.g) {
            b.l().u("Already expanded, early exiting expand");
            return;
        }
        if (mttVarD.b == null) {
            mttVarD.b = z(nsoVar);
            nej nejVar = this.j;
            Context context = mki.a.c;
            context.getClass();
            nejVar.c(context);
        }
        nsu nsuVarL = nsoVar.l();
        yfq yfqVar = nsuVarL != null ? nsuVarL.e : null;
        int iG = (yfqVar == null || ((yls) yfqVar).c < 2) ? 1 : afpt.g(mttVarD.a(), 1, woy.bh(yfqVar));
        noh nohVar = mttVarD.b;
        if (nohVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        nohVar.l(iG, projectionWindowAnimationParams);
        mttVarD.d = true;
        mttVarD.g = true;
        mttVarD.b(muc.a);
        mttVarD.h = iG;
        eqm eqmVar = this.e;
        if (yfqVar != null && iG == woy.bh(yfqVar)) {
            z2 = true;
        }
        eqmVar.m(Boolean.valueOf(z2));
        mtr.a.a().b(yfqVar != null ? (Integer) woy.bI(yfqVar, iG) : null);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void q() {
        int i = mua.a;
        r(true);
    }

    @Override // defpackage.mud
    public final void r(boolean z) {
        mtt mttVarD = d();
        nso nsoVar = mttVarD.a;
        if (!nsoVar.K()) {
            throw new IllegalStateException("Dashboard should only be shown when current display supports it");
        }
        if (z) {
            A();
        }
        if (mttVarD.d) {
            b.l().u("Redundant call to show()");
            return;
        }
        mttVarD.d = true;
        nsu nsuVarL = nsoVar.l();
        yfq yfqVar = nsuVarL != null ? nsuVarL.e : null;
        mtr.a.a().b(yfqVar != null ? (Integer) woy.bH(yfqVar) : null);
        mttVarD.f = false;
        mwc.a(yzy.u, null);
        mttVarD.b(muc.b);
        mttVarD.h = 0;
        mttVarD.c(0);
        noh nohVar = mttVarD.b;
        if (nohVar != null) {
            nohVar.l(0, null);
            return;
        }
        mttVarD.b = z(nsoVar);
        nej nejVar = this.j;
        Context context = mki.a.c;
        context.getClass();
        nejVar.c(context);
    }

    @Override // defpackage.mud
    public final void s() {
        mtt mttVarD = d();
        if (mttVarD.c) {
            return;
        }
        mpd.b().g(new mtu(this, mttVarD));
        mttVarD.c = true;
    }

    @Override // defpackage.mud
    public final boolean t() {
        return d().g;
    }

    @Override // defpackage.mud
    public final boolean u() {
        return d().h > 1;
    }

    @Override // defpackage.mud
    public final boolean v() {
        return d().g || d().f;
    }

    @Override // defpackage.mud
    public final /* synthetic */ void w() {
        int i = mua.a;
        i(true, null);
    }

    @Override // defpackage.mud
    public final void x() {
        noh nohVar = d().b;
        if (nohVar != null) {
            nohVar.p(null);
        }
    }

    @Override // defpackage.mud
    public final void y(PrintWriter printWriter) {
        printWriter.getClass();
        if (!lbh.d().g()) {
            printWriter.println("Unable to get dashboard state out of lifetime");
            return;
        }
        mtt mttVarD = d();
        Object objE = mttVarD.j.c.e();
        objE.getClass();
        printWriter.println("Dashboard Shade current state: " + ((muc) objE) + ", isShowing: " + mttVarD.d + ", isExpanded: " + mttVarD.g + " hiddenWithAnimation: " + mttVarD.e + ", savedDragStep: " + mttVarD.a() + ", currentDragStep: " + mttVarD.h + ", isExpanding: " + mttVarD.i);
        mtr mtrVarA = mtr.a.a();
        boolean z = mtrVarA.d().a;
        Object obj = mtrVarA.d().b;
        Object obj2 = mtrVarA.d().d;
        StringBuilder sb = new StringBuilder("DashboardShadeScrimController: isShowing=");
        sb.append(z);
        sb.append(", scrimView=");
        sb.append(obj != null);
        sb.append(", viewInflater=");
        sb.append(obj2 != null);
        printWriter.println(sb.toString());
    }
}
