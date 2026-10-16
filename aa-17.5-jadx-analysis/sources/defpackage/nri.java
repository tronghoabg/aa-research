package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class nri extends mov {
    public static final /* synthetic */ int a = 0;

    public nri() {
        super("ImmersiveApp");
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        mqc mqcVarA;
        mqb mqbVarB = mqb.b(intent);
        return (mqbVarB == null || (mqcVarA = lem.a().a(kio.b().e(), mqbVarB)) == null || !mqcVarA.d) ? false : true;
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        CarRegionId carRegionId = qqlVar.e;
        if (carRegionId == null || CarDisplayId.b(carRegionId.h)) {
            qqlVar.e = nsr.c().b().r(nsn.d);
        }
    }
}
