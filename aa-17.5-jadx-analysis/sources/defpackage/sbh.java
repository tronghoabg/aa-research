package defpackage;

import android.content.Intent;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
final class sbh extends rht {
    final /* synthetic */ sbm a;

    public sbh(sbm sbmVar) {
        this.a = sbmVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null || networkInfo.getState() != NetworkInfo.State.DISCONNECTED) {
            return;
        }
        sbm sbmVar = this.a;
        sbmVar.d.e(yze.PROTOCOL_IO_ERROR, yzf.WIFI_NETWORK_DISCONNECTED, "Wifi network no longer connected");
        sbmVar.m.g(2, null, null, 304, null);
    }
}
