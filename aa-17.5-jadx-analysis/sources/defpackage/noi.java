package defpackage;

import android.support.v4.app.Fragment;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class noi implements noj {
    @Override // defpackage.noj
    public final nog a(CarWindowLayoutParams carWindowLayoutParams, String str, Fragment fragment, eqa eqaVar) {
        if (carWindowLayoutParams.o == 0) {
            qsw qswVar = new qsw(carWindowLayoutParams);
            qswVar.n = R.style.Theme_Gearhead_Projected;
            carWindowLayoutParams = qswVar.a();
        }
        return new nog(carWindowLayoutParams, str, fragment, eqaVar);
    }

    @Override // defpackage.noj
    public final noh b(Fragment fragment) {
        if (fragment.getParentFragment() != null) {
            return b(fragment);
        }
        Object host = fragment.getHost();
        if (host instanceof noh) {
            return (noh) host;
        }
        return null;
    }
}
