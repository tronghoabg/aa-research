package defpackage;

import com.google.android.gms.car.navigation.VehicleEnergyForecast;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class ixh extends ixd {
    static final Function a = new ixb(2);
    static final Function b = new ixb(1);
    static final Function c = new ixg();
    static final Function d = new ixb(0);

    @Override // defpackage.ixd
    public final void b(VehicleEnergyForecast vehicleEnergyForecast, abnp abnpVar) {
        int iAq = a.aq(vehicleEnergyForecast.c);
        if (iAq == 0) {
            iAq = 2;
        }
        abnpVar.t();
        aaic aaicVar = (aaic) abnpVar.b;
        aaic aaicVar2 = aaic.a;
        aaicVar.e = aclh.d(iAq);
    }
}
