package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast;

/* loaded from: classes.dex */
public abstract class own extends ijo implements owo {
    public own() {
        super("com.google.android.apps.auto.sdk.nav.state.INavigationStateCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            NavigationSummary navigationSummary = (NavigationSummary) ijp.a(parcel, NavigationSummary.CREATOR);
            ijp.d(parcel);
            c(navigationSummary);
        } else if (i == 2) {
            TurnEvent turnEvent = (TurnEvent) ijp.a(parcel, TurnEvent.CREATOR);
            ijp.d(parcel);
            d(turnEvent);
        } else if (i == 3) {
            CarInstrumentClusterConfig carInstrumentClusterConfigA = a();
            parcel2.writeNoException();
            ijp.h(parcel2, carInstrumentClusterConfigA);
        } else if (i == 4) {
            VehicleEnergyForecast vehicleEnergyForecast = (VehicleEnergyForecast) ijp.a(parcel, VehicleEnergyForecast.CREATOR);
            ijp.d(parcel);
            f(vehicleEnergyForecast);
        } else {
            if (i != 5) {
                return false;
            }
            AdasRouteInfo adasRouteInfo = (AdasRouteInfo) ijp.a(parcel, AdasRouteInfo.CREATOR);
            ijp.d(parcel);
            b(adasRouteInfo);
        }
        return true;
    }
}
