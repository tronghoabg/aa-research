package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nrn implements nro {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.CanonicalCM");
    private final xyc c;

    public nrn(xyc xycVar) {
        this.c = xycVar;
    }

    @Override // defpackage.nro
    public final void d() {
        ((ype) ((ype) b.f()).ai((char) 5330)).u("Using canonical content manager");
    }

    @Override // defpackage.nro
    public final void fF() {
        Object objGu = this.c.gu();
        mqc mqcVarF = mpd.b().f();
        if (mqcVarF != null && mqcVarF.a().equals(mkn.s) && objGu != null && !nxo.b().f()) {
            mpe.a().i(new Intent().setComponent((ComponentName) objGu));
            return;
        }
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.APP_LAUNCHER, yzy.kR).l());
        ngf.g().h(mqx.a);
        mpe.a().i(new Intent().setComponent(mkn.s));
    }

    @Override // defpackage.nro
    public final void fG(CarRegionId carRegionId) {
        if (fH(carRegionId)) {
            mua.a().w();
        } else {
            ((ype) ((ype) b.f()).ai((char) 5334)).u("Unable to increase content area");
        }
    }

    @Override // defpackage.nro
    public final boolean fH(CarRegionId carRegionId) {
        if (nsr.c().a(carRegionId.h).k(carRegionId) != nsn.s) {
            ((ype) ((ype) b.l().l(1000, TimeUnit.MILLISECONDS)).ai(5329)).u("Only maps apps can increase their area");
            return false;
        }
        int i = nqe.a;
        int i2 = nqg.a;
        if (!nqf.a.h()) {
            return mua.a().t();
        }
        ((ype) ((ype) b.f()).ai((char) 5328)).u("Can't increase content area due to immersive mode");
        return false;
    }

    @Override // defpackage.nro
    public final void h() {
        nxo nxoVarB = nxo.b();
        if (nxoVarB.f()) {
            nxoVarB.d();
        } else {
            nxoVarB.e();
        }
    }

    @Override // defpackage.nro
    public final void i() {
        if (!nsr.c().b().K()) {
            ((ype) ((ype) b.h()).ai((char) 5333)).u("Trying to start dashboard for a display which does not support it");
            return;
        }
        int i = 0;
        boolean z = ldz.a().b() && nsr.c().b().H();
        mua.a().p(true, null);
        mqc mqcVarE = mpd.b().e(CarRegionId.a);
        if (!nxo.b().f() || ((mqcVarE == null || mqcVarE.b != mpz.b) && !z)) {
            ((ype) b.l().ai((char) 5331)).u("Not closing notification center for dashboard press");
        } else {
            nxo.b().d();
            ((ype) b.l().ai((char) 5332)).u("Closing notification center for dashboard press");
        }
        if (!z || mpd.b().f() == null) {
            return;
        }
        kgq.d(new nrm(i), "GH.CanonicalCM", yzz.RAIL, yzy.eT, "Car not connected when trying to stop activity", new Object[0]);
    }

    @Override // defpackage.nro
    public final void g() {
    }
}
