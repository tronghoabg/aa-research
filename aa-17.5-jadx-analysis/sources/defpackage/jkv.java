package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class jkv {
    public static final yph a = yph.c("CAR.SETUP.WIFI");
    public final Context b;
    public final Handler c;
    public volatile ScheduledExecutorService d;
    public boolean e;
    public int f;
    public jeg h;
    public jqe j;
    private final ConnectivityManager k;
    private ConnectivityManager.NetworkCallback l;
    public final xya g = new xya(xvx.a);
    public final BroadcastReceiver i = new jkr(this);

    public jkv(Context context) {
        context.getClass();
        this.b = context.getApplicationContext();
        this.c = new sss(Looper.getMainLooper(), (byte[]) null);
        this.k = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, String str, int i, WifiInfo wifiInfo, boolean z) {
        ilb.d();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2269)).u("connectToSocket");
        if (!this.e) {
            ((ype) ((ype) yphVar.g()).ai((char) 2270)).u("Tried to connect while not initialized");
            return;
        }
        jku jktVar = z ? new jkt(this, str, i, wifiInfo) : new jku(this);
        jej jejVar = (jej) this.h;
        jejVar.b.execute(new jei(jejVar, network, str, i, jktVar));
    }

    public final void b(String str, int i, WifiInfo wifiInfo, Network network, boolean z) {
        Network network2;
        ilb.d();
        ((ype) a.l().ai((char) 2271)).u("connectToWifi");
        xya xyaVar = this.g;
        xyaVar.d();
        xyaVar.e();
        if (z) {
            a(network, str, i, wifiInfo, false);
            return;
        }
        WifiManager wifiManager = (WifiManager) this.b.getApplicationContext().getSystemService("wifi");
        if (network == null) {
            ConnectivityManager connectivityManager = this.k;
            int i2 = jlp.a;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks != null) {
                for (Network network3 : allNetworks) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network3);
                    if (networkInfo != null && networkInfo.getType() == 1) {
                        network2 = network3;
                        break;
                    }
                }
                network2 = null;
            } else {
                network2 = null;
            }
        } else {
            network2 = network;
        }
        if (wifiInfo != null) {
            int i3 = jlp.a;
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null && jlp.c(wifiInfo.getSSID(), connectionInfo.getSSID()) && network2 != null) {
                a(network2, str, i, wifiInfo, true);
                return;
            }
        }
        c(str, i, wifiInfo);
    }

    final void c(String str, int i, WifiInfo wifiInfo) {
        ilb.d();
        isp ispVar = new isp(this, str, i, wifiInfo, 3);
        if (this.l == null) {
            jks jksVar = new jks(this, ispVar, str, i, wifiInfo);
            ispVar = ispVar;
            this.l = jksVar;
        }
        d(yxi.WIRELESS_WIFI_LEGACY_NETWORK_REQUEST_STARTED);
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1);
        this.k.requestNetwork(builder.build(), this.l);
        Handler handler = this.c;
        long jK = aczv.k();
        if (jK < 0) {
            jK = 10000;
        }
        handler.postDelayed(ispVar, jK);
    }

    public final void d(yxi yxiVar) {
        ((ype) a.l().ai((char) 2275)).y("Publishing generic event: %s", yxiVar.name());
        ols.M(this.b, yxiVar);
    }

    public final void e(rrx rrxVar) {
        ((ype) a.l().ai((char) 2276)).y("Publishing wireless socket connection event: %s", rrxVar);
        ols.L(this.b, "com.google.android.gms.car.WIRELESS_SOCKET_CONNECTION", rrxVar, null);
    }

    public final void f() {
        ilb.d();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2277)).u("tearDown");
        if (!this.e) {
            ((ype) yphVar.l().ai((char) 2278)).u("Not initialized");
            return;
        }
        this.e = false;
        this.b.unregisterReceiver(this.i);
        g();
        jeg jegVar = this.h;
        ScheduledExecutorService scheduledExecutorService = ((jej) jegVar).b;
        if (scheduledExecutorService.isShutdown()) {
            ((ype) ((ype) jej.a.f()).ai((char) 1953)).u("WiFi socket manager is already shut down, ignoring");
        } else {
            scheduledExecutorService.execute(new ire(jegVar, 15));
        }
        this.d.execute(new jgu(this, 6));
        d(yxi.WIRELESS_WIFI_CAR_WIFI_SETUP_TORN_DOWN);
    }

    public final void g() {
        ilb.d();
        ConnectivityManager.NetworkCallback networkCallback = this.l;
        if (networkCallback == null) {
            return;
        }
        this.k.unregisterNetworkCallback(networkCallback);
        this.l = null;
    }
}
