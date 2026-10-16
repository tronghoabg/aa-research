package defpackage;

import android.content.Intent;
import android.net.NetworkInfo;

/* loaded from: classes2.dex */
final class jkr extends rht {
    final /* synthetic */ jkv a;

    public jkr(jkv jkvVar) {
        this.a = jkvVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        ((ype) jkv.a.l().ai((char) 2267)).u("got intent");
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null || networkInfo.getState() != NetworkInfo.State.DISCONNECTED) {
            return;
        }
        this.a.d(yxi.WIRELESS_WIFI_NETWORK_STATE_CHANGED_DISCONNECTED_NO_SOCKET_DISCONNECT);
    }
}
