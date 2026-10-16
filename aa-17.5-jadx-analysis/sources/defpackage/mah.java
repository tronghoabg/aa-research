package defpackage;

import com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo;
import com.google.android.gms.car.navigation.AdasRouteInfo;
import com.google.android.gms.car.navigation.ChargingStationDetails;
import com.google.android.gms.car.navigation.EnergyAtDistance;

/* loaded from: classes2.dex */
final class mah {
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
        final maf mafVar = new maf(0);
        a = new ThreadLocal() { // from class: mag
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ Object initialValue() {
                return mafVar.get();
            }
        };
        final maf mafVar2 = new maf(2);
        b = new ThreadLocal() { // from class: mag
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ Object initialValue() {
                return mafVar2.get();
            }
        };
    }

    static AdasRouteInfo.Path a(AdasRouteInfo.Path path) {
        int[] iArr = path.a;
        iArr.getClass();
        int[] iArr2 = path.b;
        iArr2.getClass();
        int[] iArr3 = path.c;
        iArr3.getClass();
        return new AdasRouteInfo.Path(iArr, iArr2, iArr3);
    }

    static ChargingStationDetails b(com.google.android.apps.auto.sdk.nav.state.ChargingStationDetails chargingStationDetails) {
        if (chargingStationDetails == null) {
            return null;
        }
        int i = chargingStationDetails.a;
        if (i < 0) {
            i = -1;
        }
        int i2 = chargingStationDetails.b;
        if (i2 < 0) {
            i2 = -1;
        }
        int i3 = chargingStationDetails.c;
        return new ChargingStationDetails(i, i2, i3 >= 0 ? i3 : -1);
    }

    static EnergyAtDistance c(com.google.android.apps.auto.sdk.nav.state.EnergyAtDistance energyAtDistance) {
        return new EnergyAtDistance(energyAtDistance.a, energyAtDistance.b, energyAtDistance.c);
    }
}
