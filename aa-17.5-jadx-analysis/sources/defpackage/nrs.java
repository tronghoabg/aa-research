package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class nrs extends nrl {
    private static final yph b = yph.c("GH.PortraitIM");

    @Override // defpackage.nrl, defpackage.nro
    public final void d() {
        ((ype) ((ype) b.f()).ai((char) 5337)).u("Using portrait interaction manager");
        super.d();
    }

    @Override // defpackage.nro
    public final void fF() {
        mqc mqcVarF = mpd.b().f();
        if (k() && mqcVarF != null && mqcVarF.a().equals(mkn.s) && !nxo.b().f()) {
            l(null);
            mua.a().n();
        } else {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.APP_LAUNCHER, yzy.kR).l());
            ngf.g().h(mqx.a);
            mpe.a().i(new Intent().setComponent(mkn.s));
        }
    }

    @Override // defpackage.nro
    public final void fG(CarRegionId carRegionId) {
        ((ype) b.l().ai((char) 5338)).u("Portrait does not support apps growing");
    }

    @Override // defpackage.nro
    public final boolean fH(CarRegionId carRegionId) {
        ((ype) b.l().ai((char) 5336)).u("Portrait does not support apps growing");
        return false;
    }
}
