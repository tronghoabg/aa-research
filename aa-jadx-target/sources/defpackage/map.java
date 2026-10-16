package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class map extends defpackage.oxk {
    private final android.content.ComponentName a;

    public map(android.content.ComponentName componentName) {
        this.a = componentName;
        defpackage.mak.e().h(componentName);
    }

    public final synchronized com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig a() {
        return defpackage.luq.a().f();
    }

    public final synchronized void b(com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo adasRouteInfo) {
        defpackage.mak.e().g(adasRouteInfo);
    }

    public final synchronized void c(com.google.android.apps.auto.sdk.nav.state.NavigationSummary navigationSummary) {
        defpackage.mak.e().i(this.a, navigationSummary);
    }

    public final synchronized void d(com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent) {
        defpackage.mak.e().j(this.a, turnEvent);
    }

    public final synchronized void f(com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast vehicleEnergyForecast) {
        defpackage.mak.e().k(vehicleEnergyForecast);
    }
}
