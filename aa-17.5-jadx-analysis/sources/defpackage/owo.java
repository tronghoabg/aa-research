package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast;

/* loaded from: classes2.dex */
public interface owo extends IInterface {
    CarInstrumentClusterConfig a() throws RemoteException;

    void b(AdasRouteInfo adasRouteInfo) throws RemoteException;

    void c(NavigationSummary navigationSummary) throws RemoteException;

    void d(TurnEvent turnEvent) throws RemoteException;

    void f(VehicleEnergyForecast vehicleEnergyForecast) throws RemoteException;
}
