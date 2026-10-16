package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxk extends defpackage.ijw implements defpackage.oxl {
    public oxk() {
        super("com.google.android.apps.auto.sdk.nav.state.INavigationStateCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.apps.auto.sdk.nav.state.NavigationSummary navigationSummary = (com.google.android.apps.auto.sdk.nav.state.NavigationSummary) defpackage.ijx.a(parcel, com.google.android.apps.auto.sdk.nav.state.NavigationSummary.CREATOR);
            defpackage.ijx.d(parcel);
            c(navigationSummary);
        } else if (i == 2) {
            com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent = (com.google.android.apps.auto.sdk.nav.state.TurnEvent) defpackage.ijx.a(parcel, com.google.android.apps.auto.sdk.nav.state.TurnEvent.CREATOR);
            defpackage.ijx.d(parcel);
            d(turnEvent);
        } else if (i == 3) {
            com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig carInstrumentClusterConfigA = a();
            parcel2.writeNoException();
            defpackage.ijx.h(parcel2, carInstrumentClusterConfigA);
        } else if (i == 4) {
            com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast vehicleEnergyForecast = (com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast) defpackage.ijx.a(parcel, com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast.CREATOR);
            defpackage.ijx.d(parcel);
            f(vehicleEnergyForecast);
        } else {
            if (i != 5) {
                return false;
            }
            com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo adasRouteInfo = (com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo) defpackage.ijx.a(parcel, com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo.CREATOR);
            defpackage.ijx.d(parcel);
            b(adasRouteInfo);
        }
        return true;
    }
}
