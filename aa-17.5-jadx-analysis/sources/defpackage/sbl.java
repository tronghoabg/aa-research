package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class sbl implements Runnable {
    public int a = 0;
    final /* synthetic */ Network b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ WifiInfo f;
    final /* synthetic */ sbm g;

    public sbl(sbm sbmVar, Network network, String str, int i, boolean z, WifiInfo wifiInfo) {
        this.b = network;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = wifiInfo;
        this.g = sbmVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            Network network = this.b;
            Socket socket = new Socket();
            socket.setSendBufferSize(16384);
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(10000);
            network.bindSocket(socket);
            sbm sbmVar = this.g;
            if (sbmVar.c) {
                throw new UnsupportedOperationException();
            }
            socket.bind(null);
            Context context = sbmVar.b;
            ols.L(context, "com.google.android.gms.car.WIRELESS_SOCKET_CONNECTION", rrx.a, null);
            String str = this.c;
            int i = this.d;
            socket.connect(new InetSocketAddress(str, i), 10000);
            ols.L(context, "com.google.android.gms.car.WIRELESS_SOCKET_CONNECTION", rrx.b, null);
            sbm.a.l().ai(8685).K("Wifi socket connected to %s:%d", str, i);
            sbmVar.m.g(1, Integer.valueOf(this.a), Integer.valueOf(sbmVar.j), 0, Integer.valueOf((int) (SystemClock.elapsedRealtime() - sbmVar.k)));
            sbmVar.e.post(new sbj(this, socket, 0));
        } catch (IOException e) {
            sbm sbmVar2 = this.g;
            ols.L(sbmVar2.b, "com.google.android.gms.car.WIRELESS_SOCKET_CONNECTION", rrx.c, null);
            if (this.a < 2) {
                sbm.a.g().p(e).ai(8686).w("Couldn't connect to socket, retrying %d", this.a);
                this.a++;
                sbmVar2.g = sbmVar2.f.schedule(this, 1000L, TimeUnit.MILLISECONDS);
            } else {
                Handler handler = sbmVar2.e;
                final boolean z = this.e;
                final String str2 = this.c;
                final int i2 = this.d;
                final WifiInfo wifiInfo = this.f;
                handler.post(new Runnable() { // from class: sbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zA = adca.a.gu().a();
                        sbl sblVar = this.a;
                        if (zA) {
                            sbm sbmVar3 = sblVar.g;
                            ConnectivityManager connectivityManager = sbmVar3.i;
                            for (Network network2 : connectivityManager.getAllNetworks()) {
                                if (!connectivityManager.getNetworkCapabilities(network2).hasCapability(15)) {
                                    ols.M(sbmVar3.b, yxi.WIRELESS_WIFI_VPN_ACTIVE);
                                    sbmVar3.d.e(yze.SOCKET_VPN_CONNECTION_ERROR, yzf.SOCKET_FAIL, "Couldn't connect to receiver socket while VPN active");
                                    return;
                                }
                            }
                        }
                        if (z) {
                            WifiInfo wifiInfo2 = wifiInfo;
                            sblVar.g.c(str2, i2, wifiInfo2);
                            return;
                        }
                        sbm sbmVar4 = sblVar.g;
                        sbmVar4.d.e(yze.PROTOCOL_IO_ERROR, yzf.SOCKET_FAIL, "Couldn't connect to receiver socket");
                        sbmVar4.m.g(2, Integer.valueOf(sblVar.a), Integer.valueOf(sbmVar4.j), 302, null);
                    }
                });
            }
        }
    }
}
