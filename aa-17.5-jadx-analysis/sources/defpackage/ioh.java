package defpackage;

import android.os.Bundle;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
final class ioh extends ioc {
    @Override // defpackage.ioc
    protected final ing a(inz inzVar, iob iobVar, int i, boolean z) {
        Bundle bundle = inzVar.d;
        CarRegionId carRegionId = bundle == null ? CarRegionId.a : (CarRegionId) new ntn(new qql(bundle).e).i(CarRegionId.a);
        return new ioj(iobVar, this, iobVar.j(carRegionId.h), carRegionId, inzVar.j, inzVar.k, inzVar.l, inzVar.m, inzVar.h, inzVar.n);
    }
}
