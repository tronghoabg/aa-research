package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;

/* loaded from: classes.dex */
final class ore extends BroadcastReceiver {
    final /* synthetic */ orf a;

    public ore(orf orfVar) {
        this.a = orfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        if (intent.getIntExtra("wifi_state", -1) == 1) {
            orf orfVar = this.a;
            if (orfVar.d.compareAndSet(true, false)) {
                applicationContext.unregisterReceiver(this);
                orfVar.c.removeCallbacksAndMessages(this);
                ((WifiManager) applicationContext.getSystemService(WifiManager.class)).setWifiEnabled(true);
            }
        }
    }
}
