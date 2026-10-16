package com.carstream.tech.launcher;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class TrangThai {
    private TrangThai() {
    }

    public static boolean bluetooth(Context context) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.isEnabled();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean coTransport(Context context, int i) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(i)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String diDong(Context context) {
        try {
            if (!coTransport(context, 0)) {
                return null;
            }
            int dataNetworkType = ((TelephonyManager) context.getSystemService("phone")).getDataNetworkType();
            return dataNetworkType == 20 ? "5G" : dataNetworkType == 13 ? "4G" : "3G";
        } catch (Throwable unused) {
            return "5G";
        }
    }

    public static boolean gps(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                if (locationManager.isProviderEnabled("gps")) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean wifi(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                return wifiManager.isWifiEnabled();
            }
        } catch (Throwable unused) {
        }
        return coTransport(context, 1);
    }

    public static boolean wifiNoi(Context context) {
        return coTransport(context, 1);
    }
}
