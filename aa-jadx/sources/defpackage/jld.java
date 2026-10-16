package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jld {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SETUP.WIFI");
    public final android.content.Context b;
    public final android.os.Handler c;
    public volatile java.util.concurrent.ScheduledExecutorService d;
    public boolean e;
    public int f;
    public defpackage.jen h;
    public defpackage.jqf j;
    private final android.net.ConnectivityManager k;
    private android.net.ConnectivityManager.NetworkCallback l;
    public final defpackage.xzg g = new defpackage.xzg(defpackage.xxd.a);
    public final android.content.BroadcastReceiver i = new defpackage.jky(this);

    public jld(android.content.Context context) {
        context.getClass();
        this.b = context.getApplicationContext();
        this.c = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
        this.k = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(android.net.Network network, java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo, boolean z) {
        defpackage.ill.d();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2270)).u("connectToSocket");
        if (!this.e) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 2271)).u("Tried to connect while not initialized");
            return;
        }
        defpackage.jlc jlaVar = z ? new defpackage.jla(this, str, i, wifiInfo) : new defpackage.jlc(this);
        defpackage.jer jerVar = (defpackage.jer) this.h;
        jerVar.b.execute(new defpackage.jeq(jerVar, network, str, i, jlaVar));
    }

    public final void b(java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo, android.net.Network network, boolean z) {
        android.net.Network network2;
        defpackage.ill.d();
        ((defpackage.yqj) a.l().ai((char) 2272)).u("connectToWifi");
        defpackage.xzg xzgVar = this.g;
        xzgVar.d();
        xzgVar.e();
        if (z) {
            a(network, str, i, wifiInfo, false);
            return;
        }
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) this.b.getApplicationContext().getSystemService("wifi");
        if (network == null) {
            android.net.ConnectivityManager connectivityManager = this.k;
            int i2 = defpackage.jlw.a;
            android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks == null) {
                network2 = null;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= allNetworks.length) {
                    network2 = null;
                    break;
                }
                android.net.Network network3 = allNetworks[i3];
                android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network3);
                if (networkInfo != null && networkInfo.getType() == 1) {
                    network2 = network3;
                    break;
                }
                i3++;
            }
        } else {
            network2 = network;
        }
        if (wifiInfo != null) {
            int i4 = defpackage.jlw.a;
            android.net.wifi.WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null && defpackage.jlw.c(wifiInfo.getSSID(), connectionInfo.getSSID()) && network2 != null) {
                a(network2, str, i, wifiInfo, true);
                return;
            }
        }
        c(str, i, wifiInfo);
    }

    final void c(java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo) {
        defpackage.ill.d();
        defpackage.isx isxVar = new defpackage.isx(this, str, i, wifiInfo, 3);
        if (this.l == null) {
            defpackage.jkz jkzVar = new defpackage.jkz(this, isxVar, str, i, wifiInfo);
            isxVar = isxVar;
            this.l = jkzVar;
        }
        d(defpackage.yyn.WIRELESS_WIFI_LEGACY_NETWORK_REQUEST_STARTED);
        android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
        builder.addTransportType(1);
        this.k.requestNetwork(builder.build(), this.l);
        android.os.Handler handler = this.c;
        long jK = defpackage.adax.k();
        if (jK < 0) {
            jK = 10000;
        }
        handler.postDelayed(isxVar, jK);
    }

    public final void d(defpackage.yyn yynVar) {
        ((defpackage.yqj) a.l().ai((char) 2276)).y("Publishing generic event: %s", yynVar.name());
        defpackage.omv.i(this.b, yynVar);
    }

    public final void e(defpackage.rsr rsrVar) {
        ((defpackage.yqj) a.l().ai((char) 2277)).y("Publishing wireless socket connection event: %s", rsrVar);
        defpackage.omv.h(this.b, "com.google.android.gms.car.WIRELESS_SOCKET_CONNECTION", rsrVar, null);
    }

    public final void f() {
        defpackage.ill.d();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2278)).u("tearDown");
        if (!this.e) {
            ((defpackage.yqj) yqmVar.l().ai((char) 2279)).u("Not initialized");
            return;
        }
        int i = 0;
        this.e = false;
        this.b.unregisterReceiver(this.i);
        g();
        defpackage.jen jenVar = this.h;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = ((defpackage.jer) jenVar).b;
        if (scheduledExecutorService.isShutdown()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jer.a.f()).ai((char) 1953)).u("WiFi socket manager is already shut down, ignoring");
        } else {
            scheduledExecutorService.execute(new defpackage.jeo(jenVar, i));
        }
        this.d.execute(new defpackage.jeo(this, 14));
        d(defpackage.yyn.WIRELESS_WIFI_CAR_WIFI_SETUP_TORN_DOWN);
    }

    public final void g() {
        defpackage.ill.d();
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.l;
        if (networkCallback == null) {
            return;
        }
        this.k.unregisterNetworkCallback(networkCallback);
        this.l = null;
    }
}
