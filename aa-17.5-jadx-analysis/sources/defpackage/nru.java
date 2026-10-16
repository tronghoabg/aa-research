package defpackage;

import android.content.Intent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nru extends nrl {
    private static final yph b = yph.c("GH.WidescreenIM");

    @Override // defpackage.nrl
    protected final ProjectionWindowAnimationChoreography c() {
        rcc rccVar = new rcc();
        rccVar.b(CarRegionId.a, 1);
        rccVar.b(nsr.c().b().r(mua.a().e()), 0);
        rccVar.a = true;
        return rccVar.a();
    }

    @Override // defpackage.nrl, defpackage.nro
    public final void d() {
        ((ype) ((ype) b.f()).ai((char) 5344)).u("Using widescreen interaction manager");
        super.d();
    }

    @Override // defpackage.nro
    public final void fF() {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.APP_LAUNCHER, yzy.kR).l());
        ngf.g().h(mqx.a);
        mpe.a().i(new Intent().setComponent(mkn.s));
    }

    @Override // defpackage.nro
    public final void fG(CarRegionId carRegionId) {
        if (!fH(carRegionId)) {
            ((ype) ((ype) b.f()).ai((char) 5346)).u("Unable to increase content area");
            return;
        }
        if (mua.a().u()) {
            ((ype) b.l().ai((char) 5345)).u("Retracting dashboard for more content area");
            mua.a().m();
            return;
        }
        CarRegionId carRegionIdR = nsr.c().b().r(mua.a().e());
        boolean Z = acxa.Z();
        rcc rccVar = new rcc();
        CarRegionId carRegionId2 = CarRegionId.a;
        rccVar.b(carRegionId2, 1);
        rccVar.b(carRegionIdR, 0);
        int i = R.anim.coolwalk_no_op_app_switch_exit;
        rccVar.c(carRegionId2, new ProjectionWindowAnimationParams(Z ? R.anim.coolwalk_no_op_app_switch_exit : R.anim.coolwalk_widescreen_partial_fade_out, false, null, 0));
        rccVar.c(carRegionIdR, new ProjectionWindowAnimationParams(true != Z ? R.anim.coolwalk_delayed_app_switch_enter : R.anim.coolwalk_app_switch_enter, false, null, true != Z ? 200 : 0));
        CarRegionId carRegionIdR2 = nsr.c().b().r(nsn.s);
        if (true != Z) {
            i = R.anim.coolwalk_widescreen_maps_fade;
        }
        rccVar.c(carRegionIdR2, new ProjectionWindowAnimationParams(i, false, null, 0));
        rccVar.a = false;
        l(rccVar.a());
        if (!nxo.b().f()) {
            mua.a().n();
        }
        nxo.b().d();
    }

    @Override // defpackage.nro
    public final boolean fH(CarRegionId carRegionId) {
        if (nsr.c().a(carRegionId.h).k(carRegionId) != nsn.s) {
            ((ype) b.l().ai((char) 5343)).u("Only the map region can request larger content area on widescreen");
            return false;
        }
        int i = nqe.a;
        int i2 = nqg.a;
        if (!nqf.a.h()) {
            return ((eqj) nfh.a().a).e() != null || mua.a().u();
        }
        ((ype) ((ype) b.f()).ai((char) 5342)).u("Can't increase content area due to immersive mode");
        return false;
    }
}
