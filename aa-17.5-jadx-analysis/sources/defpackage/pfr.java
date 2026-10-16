package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class pfr extends BroadcastReceiver {
    final /* synthetic */ pgr a;

    public pfr(pgr pgrVar) {
        this.a = pgrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            this.a.w((yxi) pgr.k.getOrDefault(Integer.valueOf(intent.getIntExtra("wifi_state", 4)), yxi.WIRELESS_WIFI_STATE_UNKNOWN));
        }
    }
}
