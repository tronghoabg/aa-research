package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sci {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SETUP.WIFI");
    public final android.content.Context b;
    public final boolean c;
    public defpackage.scj d;
    public final android.os.Handler e;
    public volatile java.util.concurrent.ScheduledExecutorService f;
    public java.util.concurrent.ScheduledFuture g;
    public boolean h;
    public final android.net.ConnectivityManager i;
    public int j;
    public volatile long k;
    public final android.content.BroadcastReceiver l = new defpackage.sce(this);
    public final defpackage.ldx m;
    private android.net.ConnectivityManager.NetworkCallback n;

    public sci(android.content.Context context, defpackage.ldx ldxVar) {
        context.getClass();
        this.b = context.getApplicationContext();
        this.m = ldxVar;
        this.c = true;
        this.e = new defpackage.stq(android.os.Looper.getMainLooper());
        this.i = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(android.net.Network network, java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo, boolean z) {
        defpackage.qtq.d();
        network.getClass();
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8712).u("Connecting over wifi");
        java.lang.Runnable schVar = new sch(this, network, str, i, z, wifiInfo);
        if (this.h) {
            this.f.execute(schVar);
        } else {
            yqkVar.g().ai(8713).u("Tried to connect while not initialized");
        }
    }

    public final void b(java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo, android.net.Network network, boolean z) {
        android.net.Network network2;
        android.net.wifi.WifiInfo connectionInfo;
        defpackage.qtq.d();
        a.l().ai(8714).u("connectToWifi");
        this.k = android.os.SystemClock.elapsedRealtime();
        if (z) {
            a(network, str, i, wifiInfo, false);
            return;
        }
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) this.b.getApplicationContext().getSystemService("wifi");
        if (network == null) {
            android.net.ConnectivityManager connectivityManager = this.i;
            android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks == null) {
                network2 = null;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= allNetworks.length) {
                    network2 = null;
                    break;
                }
                android.net.Network network3 = allNetworks[i2];
                android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network3);
                if (networkInfo != null && networkInfo.getType() == 1) {
                    network2 = network3;
                    break;
                }
                i2++;
            }
        } else {
            network2 = network;
        }
        if (wifiInfo != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
            if (defpackage.tna.u(wifiInfo.getSSID()).equals(defpackage.tna.u(connectionInfo.getSSID())) && network2 != null) {
                a(network2, str, i, wifiInfo, true);
                return;
            }
        }
        c(str, i, wifiInfo);
    }

    public final void c(java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo) {
        java.lang.Runnable isxVar = new isx(this, str, i, wifiInfo, 14);
        if (this.n == null) {
            scf scfVar = new scf(this, isxVar, str, i, wifiInfo);
            isxVar = isxVar;
            this.n = scfVar;
        }
        android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
        builder.addTransportType(1);
        this.i.requestNetwork(builder.build(), this.n);
        this.e.postDelayed(isxVar, 10000L);
    }

    public final void d() {
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.n;
        if (networkCallback == null) {
            return;
        }
        this.i.unregisterNetworkCallback(networkCallback);
        this.n = null;
    }
}
