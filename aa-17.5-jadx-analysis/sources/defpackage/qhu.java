package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
final class qhu implements mpb {
    @Override // defpackage.mpb
    public final void b(Intent intent, CarRegionId carRegionId) {
        if (intent.getComponent().equals(qhx.c) || intent.getComponent().equals(qhx.b)) {
            tfk tfkVar = tfk.a;
            tfkVar.d(tfj.GEARHEAD_ASSISTANT_COLD_STARTUP, 1);
            tfkVar.d(tfj.GEARHEAD_ASSISTANT_WARM_STARTUP, 1);
        }
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void a(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void e(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void f(Intent intent, CarRegionId carRegionId) {
    }
}
