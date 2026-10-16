package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class mpk {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.StartCarActiHelper");
    private final CarRegionId c;

    public mpk(CarRegionId carRegionId) {
        this.c = carRegionId;
    }

    public final void a(Intent intent) {
        qql qqlVar = new qql();
        CarRegionId carRegionId = this.c;
        qqlVar.e = carRegionId;
        ((ype) b.l().ai(5166)).M("Starting %s on %s", intent, carRegionId);
        mpe.a().k(intent, qqlVar);
    }
}
