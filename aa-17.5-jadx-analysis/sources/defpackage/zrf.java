package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import j$.time.Duration;

/* loaded from: classes3.dex */
public final class zrf {
    public static final String a = "zrf";
    public static final Duration b;

    static {
        Duration.ofSeconds(5L);
        b = Duration.ofSeconds(15L);
    }

    private zrf() {
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT < 35) {
            String str = a;
            if (zrn.e(str, 4)) {
                Log.i(str, "isActiveNetworkOnSatellite: SDK version < V");
            }
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            String str2 = a;
            if (zrn.e(str2, 4)) {
                Log.i(str2, "isActiveNetworkOnSatellite: active network is null");
            }
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            String str3 = a;
            if (zrn.e(str3, 4)) {
                Log.i(str3, "isActiveNetworkOnSatellite: capabilities are null");
            }
            return false;
        }
        boolean zHasTransport = networkCapabilities.hasTransport(10);
        String str4 = a;
        if (zrn.e(str4, 4)) {
            Log.i(str4, a.bR(zHasTransport, "isActiveNetworkOnSatellite: has TRANSPORT_SATELLITE="));
        }
        return zHasTransport;
    }

    public static boolean b(Context context) {
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            String str = a;
            if (zrn.e(str, 4)) {
                Log.i(str, "ConnectivityManager is null, consider we are not connected.");
            }
            return false;
        }
        if (a(connectivityManager)) {
            String str2 = a;
            if (zrn.e(str2, 4)) {
                Log.i(str2, "Satellite network is active, consider we are connected.");
            }
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            String str3 = a;
            if (zrn.e(str3, 4)) {
                Log.i(str3, "Active Network is null, consider we are not connected.");
            }
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        }
        String str4 = a;
        if (zrn.e(str4, 4)) {
            Log.i(str4, "Network Capabilities is null, consider we are not connected.");
        }
        return false;
    }
}
