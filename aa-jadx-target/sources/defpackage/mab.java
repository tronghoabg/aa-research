package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mab extends defpackage.oxk {
    final /* synthetic */ oxl a;
    final /* synthetic */ defpackage.mac b;

    public mab(defpackage.mac macVar, oxl oxlVar) {
        this.a = oxlVar;
        this.b = macVar;
    }

    public final com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig a() throws android.os.RemoteException {
        return this.a.a();
    }

    public final void b(com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo adasRouteInfo) throws android.os.RemoteException {
        this.a.b(adasRouteInfo);
    }

    public final void c(com.google.android.apps.auto.sdk.nav.state.NavigationSummary navigationSummary) throws android.os.RemoteException {
        defpackage.mac macVar = this.b;
        synchronized (macVar) {
            macVar.d = navigationSummary;
        }
        this.a.c(navigationSummary);
    }

    public final void d(com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent) throws android.os.RemoteException {
        defpackage.mac macVar = this.b;
        synchronized (macVar) {
            macVar.c = turnEvent;
        }
        this.a.d(turnEvent);
        defpackage.mac macVar2 = this.b;
        macVar2.e.post(new defpackage.lzk(turnEvent, 2));
    }

    public final void f(com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast vehicleEnergyForecast) throws android.os.RemoteException {
        this.a.f(vehicleEnergyForecast);
    }
}
