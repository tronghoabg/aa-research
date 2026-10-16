package defpackage;

import android.net.Network;
import android.net.wifi.WifiInfo;

/* loaded from: classes2.dex */
final class jqf implements Runnable {
    final /* synthetic */ jkv a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ WifiInfo d;
    final /* synthetic */ Network e;
    final /* synthetic */ boolean f;

    public jqf(jkv jkvVar, String str, int i, WifiInfo wifiInfo, Network network, boolean z) {
        this.a = jkvVar;
        this.b = str;
        this.c = i;
        this.d = wifiInfo;
        this.e = network;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b, this.c, this.d, this.e, this.f);
    }
}
