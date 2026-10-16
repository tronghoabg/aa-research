package defpackage;

import android.content.Context;
import android.telephony.satellite.SatelliteManager;
import android.telephony.satellite.SatelliteStateChangeListener;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ntt extends eqj implements SatelliteStateChangeListener {
    private final SatelliteManager a;
    private final Executor h;

    public ntt(Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) b$$ExternalSyntheticApiModelOutline0.m$2());
        systemService.getClass();
        this.a = b$$ExternalSyntheticApiModelOutline0.m198m(systemService);
        Executor executor = mki.a.d;
        executor.getClass();
        this.h = executor;
    }

    @Override // defpackage.eqj
    protected final void c() {
        this.a.registerStateChangeListener(this.h, this);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.a.unregisterStateChangeListener(this);
    }

    public final void onEnabledStateChanged(boolean z) {
        j(Boolean.valueOf(z));
    }
}
