package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsj {
    public static final java.lang.String a = "zsj";
    public static final j$.time.Duration b;

    static {
        j$.time.Duration.ofSeconds(5L);
        b = j$.time.Duration.ofSeconds(15L);
    }

    private zsj() {
    }

    public static boolean a(android.net.ConnectivityManager connectivityManager) {
        if (android.os.Build.VERSION.SDK_INT < 35) {
            java.lang.String str = a;
            if (defpackage.zsr.e(str, 4)) {
                android.util.Log.i(str, "isActiveNetworkOnSatellite: SDK version < V");
            }
            return false;
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            java.lang.String str2 = a;
            if (defpackage.zsr.e(str2, 4)) {
                android.util.Log.i(str2, "isActiveNetworkOnSatellite: active network is null");
            }
            return false;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            java.lang.String str3 = a;
            if (defpackage.zsr.e(str3, 4)) {
                android.util.Log.i(str3, "isActiveNetworkOnSatellite: capabilities are null");
            }
            return false;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(10);
        java.lang.String str4 = a;
        if (defpackage.zsr.e(str4, 4)) {
            android.util.Log.i(str4, defpackage.a.bQ(zHasTransport, "isActiveNetworkOnSatellite: has TRANSPORT_SATELLITE="));
        }
        return zHasTransport;
    }

    public static boolean b(android.content.Context context) {
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", android.os.Process.myPid(), android.os.Process.myUid()) != 0) {
            return true;
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            java.lang.String str = a;
            if (defpackage.zsr.e(str, 4)) {
                android.util.Log.i(str, "ConnectivityManager is null, consider we are not connected.");
            }
            return false;
        }
        if (a(connectivityManager)) {
            java.lang.String str2 = a;
            if (defpackage.zsr.e(str2, 4)) {
                android.util.Log.i(str2, "Satellite network is active, consider we are connected.");
            }
            return true;
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            java.lang.String str3 = a;
            if (defpackage.zsr.e(str3, 4)) {
                android.util.Log.i(str3, "Active Network is null, consider we are not connected.");
            }
            return false;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        }
        java.lang.String str4 = a;
        if (defpackage.zsr.e(str4, 4)) {
            android.util.Log.i(str4, "Network Capabilities is null, consider we are not connected.");
        }
        return false;
    }
}
