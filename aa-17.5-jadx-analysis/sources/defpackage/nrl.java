package defpackage;

import android.content.Intent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class nrl implements nro, mpb {
    protected Runnable a;

    public static final void j() {
        if (nxo.b().f()) {
            nxo.b().d();
        }
    }

    protected static final boolean k() {
        return mpd.b().f() != null;
    }

    protected static final void l(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        kgq.d(new kyi(projectionWindowAnimationChoreography, 9), "GH.BaseLargeScreenIM", yzz.RAIL, yzy.eT, "Car not connected when trying to stop activity", new Object[0]);
    }

    protected static final boolean m(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        if (!k()) {
            return false;
        }
        l(projectionWindowAnimationChoreography);
        return true;
    }

    protected ProjectionWindowAnimationChoreography c() {
        return null;
    }

    @Override // defpackage.nro
    public void d() {
        mpd.b().g(this);
        this.a = null;
    }

    @Override // defpackage.mpb
    public final void f(Intent intent, CarRegionId carRegionId) {
        Runnable runnable;
        if (!carRegionId.equals(CarRegionId.a) || (runnable = this.a) == null) {
            return;
        }
        runnable.run();
        this.a = null;
    }

    @Override // defpackage.nro
    public final void g() {
        mpd.b().j(this);
    }

    @Override // defpackage.nro
    public final void h() {
        if (nxo.b().f()) {
            nxo.b().d();
        } else {
            nxo.b().e();
        }
    }

    @Override // defpackage.nro
    public void i() {
        mmc.c();
        if (mmc.h() && nxo.b().f()) {
            mua.a().p(true, new ProjectionWindowAnimationParams(R.anim.dashboard_fade_in, false, null, 0));
        } else {
            mua.a().p(true, null);
        }
        if (m(c())) {
            this.a = new ily(16);
        } else {
            j();
        }
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void a(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void b(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void e(Intent intent, CarRegionId carRegionId) {
    }
}
