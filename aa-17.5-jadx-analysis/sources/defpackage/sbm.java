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
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class sbm {
    public static final ypf a = ols.R("CAR.SETUP.WIFI");
    public final Context b;
    public final boolean c;
    public sbn d;
    public final Handler e;
    public volatile ScheduledExecutorService f;
    public ScheduledFuture g;
    public boolean h;
    public final ConnectivityManager i;
    public int j;
    public volatile long k;
    public final BroadcastReceiver l = new sbh(this);
    public final lgx m;
    private ConnectivityManager.NetworkCallback n;

    public sbm(Context context, lgx lgxVar) {
        context.getClass();
        this.b = context.getApplicationContext();
        this.m = lgxVar;
        this.c = true;
        this.e = new sss(Looper.getMainLooper());
        this.i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, String str, int i, WifiInfo wifiInfo, boolean z) {
        qsu.d();
        network.getClass();
        ypf ypfVar = a;
        ypfVar.l().ai(8687).u("Connecting over wifi");
        sbl sblVar = new sbl(this, network, str, i, z, wifiInfo);
        if (this.h) {
            this.f.execute(sblVar);
        } else {
            ypfVar.g().ai(8688).u("Tried to connect while not initialized");
        }
    }

    public final void b(String str, int i, WifiInfo wifiInfo, Network network, boolean z) {
        Network network2;
        WifiInfo connectionInfo;
        qsu.d();
        a.l().ai(8689).u("connectToWifi");
        this.k = SystemClock.elapsedRealtime();
        if (z) {
            a(network, str, i, wifiInfo, false);
            return;
        }
        WifiManager wifiManager = (WifiManager) this.b.getApplicationContext().getSystemService("wifi");
        if (network == null) {
            ConnectivityManager connectivityManager = this.i;
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
        if (wifiInfo != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
            if (roc.k(wifiInfo.getSSID()).equals(roc.k(connectionInfo.getSSID())) && network2 != null) {
                a(network2, str, i, wifiInfo, true);
                return;
            }
        }
        c(str, i, wifiInfo);
    }

    public final void c(String str, int i, WifiInfo wifiInfo) {
        isp ispVar = new isp(this, str, i, wifiInfo, 14);
        if (this.n == null) {
            sbi sbiVar = new sbi(this, ispVar, str, i, wifiInfo);
            ispVar = ispVar;
            this.n = sbiVar;
        }
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1);
        this.i.requestNetwork(builder.build(), this.n);
        this.e.postDelayed(ispVar, 10000L);
    }

    public final void d() {
        ConnectivityManager.NetworkCallback networkCallback = this.n;
        if (networkCallback == null) {
            return;
        }
        this.i.unregisterNetworkCallback(networkCallback);
        this.n = null;
    }
}
