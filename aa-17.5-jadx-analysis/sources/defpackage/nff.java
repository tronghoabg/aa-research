package defpackage;

import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class nff extends eqj {
    private final nfe a = new nfe(this);

    @Override // defpackage.eqj
    protected final void c() {
        m(Boolean.valueOf(mva.q(mki.a.c)));
        mki.a.c.registerReceiver(this.a, new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED"));
    }

    @Override // defpackage.eqj
    protected final void d() {
        mki.a.c.unregisterReceiver(this.a);
    }
}
