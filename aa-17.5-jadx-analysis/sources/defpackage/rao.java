package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class rao implements ComponentCallbacks {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rao(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        if (this.b != 0) {
            configuration.getClass();
            ((ksf) this.a).g();
            return;
        }
        if (rrd.e("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged New configuration: %s", configuration);
        }
        raw rawVar = (raw) this.a;
        if (rawVar.e != null) {
            rawVar.i(configuration);
            if (rrd.e("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged Applied current video configuration: %s", configuration);
            }
            z = true;
        } else {
            z = false;
        }
        raq raqVar = rawVar.g;
        if (raqVar != null) {
            configuration.touchscreen = raw.c(raqVar);
            configuration.navigation = raw.b(rawVar.g);
            if (rrd.e("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged Applied projected presentation configuration: %s", configuration);
            }
        } else if (!z) {
            return;
        }
        if (rrd.e("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "ComponentCallbacks#onConfigurationChanged Update configuration: %s", configuration);
        }
        rawVar.d().getResources().updateConfiguration(configuration, rawVar.d().getResources().getDisplayMetrics());
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
