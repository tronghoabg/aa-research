package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbj implements android.content.ComponentCallbacks {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public rbj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        boolean z;
        if (this.b != 0) {
            configuration.getClass();
            ((defpackage.ksn) this.a).g();
            return;
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged New configuration: %s", configuration);
        }
        defpackage.rbr rbrVar = (defpackage.rbr) this.a;
        if (rbrVar.e != null) {
            rbrVar.i(configuration);
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged Applied current video configuration: %s", configuration);
            }
            z = true;
        } else {
            z = false;
        }
        defpackage.rbl rblVar = rbrVar.g;
        if (rblVar != null) {
            configuration.touchscreen = defpackage.rbr.c(rblVar);
            configuration.navigation = defpackage.rbr.b(rbrVar.g);
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged Applied projected presentation configuration: %s", configuration);
            }
        } else if (!z) {
            return;
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged Update configuration: %s", configuration);
        }
        rbrVar.d().getResources().updateConfiguration(configuration, rbrVar.d().getResources().getDisplayMetrics());
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
