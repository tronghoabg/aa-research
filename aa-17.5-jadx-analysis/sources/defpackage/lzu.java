package defpackage;

import android.os.RemoteException;
import com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast;

/* loaded from: classes.dex */
final class lzu extends own {
    final /* synthetic */ owo a;
    final /* synthetic */ lzv b;

    public lzu(lzv lzvVar, owo owoVar) {
        this.a = owoVar;
        this.b = lzvVar;
    }

    @Override // defpackage.owo
    public final CarInstrumentClusterConfig a() throws RemoteException {
        return this.a.a();
    }

    @Override // defpackage.owo
    public final void b(AdasRouteInfo adasRouteInfo) throws RemoteException {
        this.a.b(adasRouteInfo);
    }

    @Override // defpackage.owo
    public final void c(NavigationSummary navigationSummary) throws RemoteException {
        lzv lzvVar = this.b;
        synchronized (lzvVar) {
            lzvVar.d = navigationSummary;
        }
        this.a.c(navigationSummary);
    }

    @Override // defpackage.owo
    public final void d(TurnEvent turnEvent) throws RemoteException {
        lzv lzvVar = this.b;
        synchronized (lzvVar) {
            lzvVar.c = turnEvent;
        }
        this.a.d(turnEvent);
        lzv lzvVar2 = this.b;
        lzvVar2.e.post(new lqj(turnEvent, 14));
    }

    @Override // defpackage.owo
    public final void f(VehicleEnergyForecast vehicleEnergyForecast) throws RemoteException {
        this.a.f(vehicleEnergyForecast);
    }
}
