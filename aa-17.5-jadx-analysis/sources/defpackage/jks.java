package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiInfo;

/* loaded from: classes2.dex */
public final class jks extends ConnectivityManager.NetworkCallback {
    public boolean a = false;
    final /* synthetic */ Runnable b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ WifiInfo e;
    public final /* synthetic */ jkv f;

    public jks(jkv jkvVar, Runnable runnable, String str, int i, WifiInfo wifiInfo) {
        this.b = runnable;
        this.c = str;
        this.d = i;
        this.e = wifiInfo;
        this.f = jkvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f.c.post(new rns(this, this.b, network, this.c, this.d, this.e, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f.c.post(new ino(this, this.b, 19));
    }
}
