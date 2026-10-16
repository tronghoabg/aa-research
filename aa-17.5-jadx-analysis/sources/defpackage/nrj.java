package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class nrj extends mov {
    public static final nrj a = new nrj();

    private nrj() {
        super("Navigation");
    }

    private static final boolean b(Intent intent) {
        mqc mqcVarA;
        mqb mqbVarB = mqb.b(intent);
        return (mqbVarB == null || (mqcVarA = lem.a().a(kio.b().e(), mqbVarB)) == null || mqcVarA.b != mpz.b) ? false : true;
    }

    private static final boolean c(Intent intent) {
        return intent.getComponent() == null && ((((woy.al(intent.getDataString()).startsWith("geo:") | woy.al(intent.getDataString()).startsWith("google.navigation:")) | woy.al(intent.getDataString()).startsWith("google.maps:")) | woy.al(intent.getDataString()).startsWith("http://maps.google.com")) || woy.al(intent.getDataString()).startsWith("https://maps.google.com"));
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        return c(intent) || b(intent);
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        ComponentName componentNameA;
        if (c(intent) && (componentNameA = lgv.a().a(mpz.b)) != null) {
            mpl.b(componentNameA).d(intent);
        }
        CarRegionId carRegionId = qqlVar.e;
        if (b(intent)) {
            if (carRegionId == null || CarDisplayId.b(carRegionId.h)) {
                mqb mqbVarB = mqb.b(intent);
                mqbVarB.getClass();
                qqlVar.e = lem.a().i(mqbVarB) ? nsr.c().b().r(nsn.s) : nsr.c().b().r(nsn.t);
            }
        }
    }
}
