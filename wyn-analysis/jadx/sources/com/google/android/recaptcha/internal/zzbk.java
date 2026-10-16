package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.x;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzbk {
    public zzbk() {
        new ConcurrentHashMap();
        zzc();
    }

    @NotNull
    public static final Set zza(@NotNull Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zznz.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zznz.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zznz.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zznz.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zznz.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return x.f35434a;
        }
    }

    public static final boolean zzb(@NotNull Context context) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getSystemService("connectivity");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
            activeNetwork = connectivityManager.getActiveNetwork();
        } catch (Exception unused) {
        }
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(16);
    }

    private static final Map zzc() {
        LinkedHashMap linkedHashMapS = AbstractC2640A.S(new C2527k(0, zznz.NET_CAPABILITY_MMS), new C2527k(1, zznz.NET_CAPABILITY_SUPL), new C2527k(2, zznz.NET_CAPABILITY_DUN), new C2527k(3, zznz.NET_CAPABILITY_FOTA), new C2527k(4, zznz.NET_CAPABILITY_IMS), new C2527k(5, zznz.NET_CAPABILITY_CBS), new C2527k(6, zznz.NET_CAPABILITY_WIFI_P2P), new C2527k(7, zznz.NET_CAPABILITY_IA), new C2527k(8, zznz.NET_CAPABILITY_RCS), new C2527k(9, zznz.NET_CAPABILITY_XCAP), new C2527k(10, zznz.NET_CAPABILITY_EIMS), new C2527k(11, zznz.NET_CAPABILITY_NOT_METERED), new C2527k(12, zznz.NET_CAPABILITY_INTERNET), new C2527k(13, zznz.NET_CAPABILITY_NOT_RESTRICTED), new C2527k(14, zznz.NET_CAPABILITY_TRUSTED), new C2527k(15, zznz.NET_CAPABILITY_NOT_VPN));
        int i5 = Build.VERSION.SDK_INT;
        linkedHashMapS.put(17, zznz.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapS.put(16, zznz.NET_CAPABILITY_VALIDATED);
        if (i5 >= 28) {
            linkedHashMapS.put(18, zznz.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapS.put(19, zznz.NET_CAPABILITY_FOREGROUND);
            linkedHashMapS.put(20, zznz.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapS.put(21, zznz.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i5 >= 29) {
            linkedHashMapS.put(23, zznz.NET_CAPABILITY_MCX);
        }
        if (i5 >= 30) {
            linkedHashMapS.put(25, zznz.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i5 >= 31) {
            linkedHashMapS.put(32, zznz.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapS.put(29, zznz.NET_CAPABILITY_ENTERPRISE);
        }
        if (i5 >= 33) {
            linkedHashMapS.put(35, zznz.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapS.put(34, zznz.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapS.put(33, zznz.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapS;
    }
}
