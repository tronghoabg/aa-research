package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public class nrt extends nrl {
    private static final yph b = yph.c("GH.ShortPortraitIM");

    @Override // defpackage.nrl, defpackage.nro
    public void d() {
        ((ype) ((ype) b.f()).ai((char) 5340)).u("Using short portrait interaction manager");
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
        ((ype) b.l().ai((char) 5341)).u("Short portrait does not support apps growing");
    }

    @Override // defpackage.nro
    public final boolean fH(CarRegionId carRegionId) {
        ((ype) b.l().ai((char) 5339)).u("Short portrait does not support apps growing");
        return false;
    }

    @Override // defpackage.nrl, defpackage.nro
    public void i() {
        nxo.b().d();
        mua.a().n();
    }
}
