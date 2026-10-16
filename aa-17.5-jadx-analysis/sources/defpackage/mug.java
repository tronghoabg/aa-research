package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class mug implements mud {
    static final /* synthetic */ afia[] a = {new affn(mug.class, "perLifetimeState", "getPerLifetimeState()Lcom/google/android/apps/auto/components/system/dashboard/DashboardWindowControllerImpl$perLifetimeState$2$1;", 0)};
    public static final /* synthetic */ int e = 0;
    public final eqm c;
    private final nej g;
    private final eqj i;
    private final eqj j;
    public final nfh d = new nfh(nsn.q);
    public final yph b = new yph(yqn.d("GH.DashWinController"));
    private final afgl f = new lhu(new ltd(this, 7), lho.a);

    public mug() {
        lhr lhrVar = new lhr(muc.b, 2);
        this.c = lhrVar;
        this.g = new nej();
        afco afcoVar = tby.a;
        this.i = new eqm(false);
        this.j = eqy.b(lhrVar, new njq(muc.a, 13));
    }

    private final mue d() {
        return (mue) this.f.getValue(this, a[0]);
    }

    @Override // defpackage.mud
    public final eqj a() {
        return this.c;
    }

    @Override // defpackage.mud
    public final eqj b() {
        return this.i;
    }

    @Override // defpackage.mud
    public final eqj c() {
        return this.j;
    }

    @Override // defpackage.mud
    public final nsn e() {
        return nsn.q;
    }

    @Override // defpackage.mud
    public final void f() {
        mue mueVarD = d();
        if (mueVarD.b == null) {
            this.b.l().u("Redundant call to finish()");
            return;
        }
        if (mueVarD.d) {
            mwc.a(yzy.v, null);
            mueVarD.a(muc.c);
        }
        mueVarD.d = false;
        noh nohVar = mueVarD.b;
        if (nohVar != null) {
            nohVar.d();
        }
        mueVarD.b = null;
        nej nejVar = this.g;
        Context context = mki.a.c;
        context.getClass();
        context.unregisterReceiver(nejVar);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void g(boolean z) {
        int i = mua.a;
        i(z, null);
    }

    @Override // defpackage.mud
    public final void h(boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        i(z, projectionWindowAnimationParams);
    }

    @Override // defpackage.mud
    public final void i(boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        mue mueVarD = d();
        if (!mueVarD.d) {
            this.b.l().u("Redundant call to hide()");
            return;
        }
        mueVarD.d = false;
        mueVarD.e = z || projectionWindowAnimationParams != null;
        if (projectionWindowAnimationParams == null) {
            noh nohVar = mueVarD.b;
            if (nohVar != null) {
                nohVar.e(z);
            }
        } else {
            noh nohVar2 = mueVarD.b;
            if (nohVar2 != null) {
                nohVar2.h(projectionWindowAnimationParams);
            }
        }
        mwc.a(yzy.v, null);
        mueVarD.a(muc.b);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void j() {
        int i = mua.a;
    }

    @Override // defpackage.mud
    public final /* synthetic */ void k() {
        int i = mua.a;
        l(true);
    }

    @Override // defpackage.mud
    public final void l(boolean z) {
        if (d().b()) {
            return;
        }
        int i = mua.a;
        p(z, null);
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
        mue mueVarD = d();
        if (!nsr.c().b().K()) {
            throw new IllegalStateException("Dashboard should only be shown when current display supports it");
        }
        if (z) {
            nso nsoVar = mueVarD.a;
            if ((nsoVar.m() == nsv.a || nsoVar.m() == nsv.g || nsoVar.m() == nsv.h) && !nsr.c().b().H()) {
                mqc mqcVarE = mpd.b().e(CarRegionId.a);
                mpz mpzVar = mqcVarE != null ? mqcVarE.b : null;
                mpz mpzVar2 = mpz.b;
                if (mpzVar != mpzVar2) {
                    ComponentName componentNameA = lgv.a().a(mpzVar2);
                    if (componentNameA != null) {
                        this.b.l().u("Starting navigation for dashboard");
                        mpe mpeVarA = mpe.a();
                        Intent intent = new Intent();
                        intent.setComponent(componentNameA);
                        intent.putExtra("com.google.android.apps.auto.components.system.dashboard.EXTRA_FOR_DASHBOARD", true);
                        intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1);
                        mpeVarA.i(intent);
                    }
                } else {
                    this.b.l().u("Navigation already started when opening dashboard");
                }
            }
        }
        if (mueVarD.d) {
            this.b.l().u("Redundant call to show()");
            return;
        }
        mueVarD.d = true;
        mueVarD.f = false;
        mwc.a(yzy.u, null);
        noh nohVar = mueVarD.b;
        int i = 2;
        int i2 = 5;
        if (nohVar == null) {
            leg legVar = leh.a;
            legVar.a();
            nso nsoVar2 = mueVarD.a;
            CarWindowLayoutParams carWindowLayoutParamsA = nsh.a(nsoVar2, nsn.q, new mqm(nsoVar2, i2));
            if (carWindowLayoutParamsA == null) {
                throw new IllegalStateException("No dashboard region available");
            }
            String string = carWindowLayoutParamsA.r.getString(nso.d);
            boolean zU = string != null ? afyh.u(string, "horizontal", false) : false;
            legVar.a();
            msx msxVar = new msx();
            msxVar.setArguments(lxr.m(zU));
            mueVarD.b = (noh) khc.t(new wci("GH.DashWinController", yzz.DASHBOARD, yzy.r, "Unable to show dashboard", new Object[0]), new mts(carWindowLayoutParamsA, msxVar, i));
            mueVarD.a(muc.a);
            nej nejVar = this.g;
            Context context = mki.a.c;
            context.getClass();
            nejVar.c(context);
            return;
        }
        if (projectionWindowAnimationParams == null) {
            nohVar.j(mueVarD.e);
        } else {
            wer.c();
            yph yphVar = noc.a;
            ype ypeVar = (ype) yphVar.l().ai(5322);
            String str = nohVar.h;
            ypeVar.M("show(%s): %s", projectionWindowAnimationParams, str);
            woy.ad(!nohVar.e, "show called when %s already finished", str);
            if (nohVar.f) {
                nohVar.f = false;
                sab sabVar = nohVar.k;
                rby rbyVar = nohVar.m;
                rzx rzxVar = (rzx) sabVar.g.get(rbyVar);
                if (rzxVar == null) {
                    rrd.d(5, "CAR.WM", null, "attempting to show window layout, but inflater not found: %s", rbyVar);
                } else {
                    if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                        rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s showWindowWithAnimation(%s)", rzxVar.a, projectionWindowAnimationParams);
                    }
                    try {
                        rzxVar.i.r(projectionWindowAnimationParams);
                    } catch (RemoteException e2) {
                        rrd.b("CAR.CLIENT.WM.WIN", e2, "showWindowWithAnimation RemoteException");
                    }
                }
                ((ype) yphVar.l().ai(5323)).M("show(%s) completed: %s", projectionWindowAnimationParams, str);
            } else {
                ((ype) ((ype) yphVar.h()).ai((char) 5324)).y("show called when %s not hidden. Nothing to do", str);
            }
        }
        mueVarD.a(muc.a);
    }

    @Override // defpackage.mud
    public final /* synthetic */ void q() {
        int i = mua.a;
        p(true, null);
    }

    @Override // defpackage.mud
    public final void r(boolean z) {
        int i = mua.a;
        p(true, null);
    }

    @Override // defpackage.mud
    public final void s() {
        qrn qrnVarE = kio.b().e();
        qrnVarE.getClass();
        mue mueVarD = d();
        if (mueVarD.c) {
            return;
        }
        eqy.a(tby.E(tby.d(this.c, mpd.b().h, new mqe(9)))).fE(lbh.d(), new med(new lyb(mueVarD, qrnVarE, 7, null), 7));
        mpd.b().g(new muf(this, mueVarD, qrnVarE));
        mueVarD.c = true;
    }

    @Override // defpackage.mud
    public final boolean t() {
        return d().d;
    }

    @Override // defpackage.mud
    public final boolean u() {
        return false;
    }

    @Override // defpackage.mud
    public final boolean v() {
        return d().d || d().f;
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
        msk mskVar;
        printWriter.getClass();
        if (!lbh.d().g()) {
            printWriter.println("Unable to get dashboard state out of lifetime");
            return;
        }
        mue mueVarD = d();
        Object objE = mueVarD.h.c.e();
        objE.getClass();
        printWriter.println("Current state: " + ((muc) objE) + ", isShowing: " + mueVarD.d + ", hiddenWithAnimation: " + mueVarD.e + ", isFullScreenMaps: " + mueVarD.b());
        noh nohVar = mueVarD.b;
        if (nohVar == null || (mskVar = (msk) nohVar.a()) == null) {
            return;
        }
        mskVar.h(printWriter);
    }

    @Override // defpackage.mud
    public final void m() {
    }
}
