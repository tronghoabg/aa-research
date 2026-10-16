package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class nrh extends mov {
    public static final nrh a = new nrh();

    private nrh() {
        super("CompatActivity");
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        mqb mqbVarB = mqb.b(intent);
        if (mqbVarB == null) {
            return false;
        }
        if ("com.google.android.projection.gearhead.pctsverifier".equals(mqbVarB.a.getPackageName())) {
            return true;
        }
        mqc mqcVarA = lem.a().a(kio.b().e(), mqbVarB);
        return mqcVarA != null && mqcVarA.b == mpz.g;
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        CarRegionId carRegionId = qqlVar.e;
        if (carRegionId == null || CarDisplayId.b(carRegionId.h)) {
            qqlVar.e = nsr.c().b().r(nsn.u);
        }
    }
}
