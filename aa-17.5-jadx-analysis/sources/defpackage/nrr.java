package defpackage;

import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nrr extends nrt {
    private static final yph b = yph.c("GH.IrShortPortraitIM");

    @Override // defpackage.nrt, defpackage.nrl, defpackage.nro
    public final void d() {
        ((ype) ((ype) b.f()).ai((char) 5335)).u("Using irregular short portrait interaction manager");
        super.d();
    }

    @Override // defpackage.nrt, defpackage.nrl, defpackage.nro
    public final void i() {
        if (nxo.b().f()) {
            mua.a().p(true, new ProjectionWindowAnimationParams(R.anim.dashboard_fade_in, false, null, 0));
        } else {
            mua.a().p(true, null);
        }
        if (m(null)) {
            this.a = new ily(17);
        } else {
            j();
        }
    }
}
