package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class oqw extends eqj {
    public static final yph a = yph.c("GH.Bt.DeviceConnUpdate");
    final BroadcastReceiver h = new oqu(this);
    private final Context i;

    public oqw(Context context) {
        this.i = context;
    }

    public static oqw a() {
        return (oqw) mki.a.i(oqw.class);
    }

    @Override // defpackage.eqj
    protected final void c() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        dup.e(this.i, this.h, intentFilter, null, 2);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.i.unregisterReceiver(this.h);
        p();
    }
}
