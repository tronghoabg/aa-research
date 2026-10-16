package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.sdk.nav.state.AdasRouteInfo;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import com.google.android.apps.auto.sdk.nav.state.VehicleEnergyForecast;

/* loaded from: classes.dex */
public final class mai extends own {
    private final ComponentName a;

    public mai(ComponentName componentName) {
        this.a = componentName;
        mad.e().h(componentName);
    }

    @Override // defpackage.owo
    public final synchronized CarInstrumentClusterConfig a() {
        return luk.a().f();
    }

    @Override // defpackage.owo
    public final synchronized void b(AdasRouteInfo adasRouteInfo) {
        mad.e().g(adasRouteInfo);
    }

    @Override // defpackage.owo
    public final synchronized void c(NavigationSummary navigationSummary) {
        mad.e().i(this.a, navigationSummary);
    }

    @Override // defpackage.owo
    public final synchronized void d(TurnEvent turnEvent) {
        mad.e().j(this.a, turnEvent);
    }

    @Override // defpackage.owo
    public final synchronized void f(VehicleEnergyForecast vehicleEnergyForecast) {
        mad.e().k(vehicleEnergyForecast);
    }
}
