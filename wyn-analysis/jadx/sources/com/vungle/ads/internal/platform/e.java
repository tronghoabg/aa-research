package com.vungle.ads.internal.platform;

import Af.n;
import Bf.k;
import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.unity3d.services.core.di.ServiceProvider;
import ef.C2529m;
import ff.m;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class e {
    public static boolean a() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String str = Build.FINGERPRINT;
        String lowerCase6 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase = "";
        }
        String str2 = Build.MODEL;
        if (str2 != null) {
            lowerCase2 = str2.toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase2 = "";
        }
        String str3 = Build.PRODUCT;
        if (str3 != null) {
            lowerCase3 = str3.toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase3 = "";
        }
        String str4 = Build.BRAND;
        if (str4 != null) {
            lowerCase4 = str4.toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase4 = "";
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            lowerCase5 = str5.toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase5 = "";
        }
        String str6 = Build.BOARD;
        if (str6 != null) {
            lowerCase6 = str6.toLowerCase(Locale.ROOT);
            AbstractC3340k.d(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        AbstractC3340k.d(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase7 = m.A0(SUPPORTED_ABIS, null, null, null, null, 63).toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return k.n0(lowerCase, "generic", false) || k.n0(lowerCase, "emulator", false) || k.n0(lowerCase2, "google_sdk", false) || k.n0(lowerCase2, "emulator", false) || k.n0(lowerCase3, ServiceProvider.NAMED_SDK, false) || k.n0(lowerCase3, "vbox", false) || k.n0(lowerCase4, "generic", false) || k.n0(lowerCase5, "genymotion", false) || k.n0(lowerCase6, "nox", false) || k.n0(lowerCase7, "x86", false);
    }

    public static String b(Context context) {
        Object objZ;
        AbstractC3340k.e(context, "context");
        if (Build.VERSION.SDK_INT < 28) {
            return "n/a";
        }
        try {
            objZ = Settings.Global.getString(context.getContentResolver(), "private_dns_mode");
            if (objZ == null) {
                objZ = "opportunistic";
            }
            if (objZ.equals("hostname")) {
                String string = Settings.Global.getString(context.getContentResolver(), "private_dns_specifier");
                if (string == null) {
                    string = "";
                }
                objZ = "hostname(" + string + ')';
            }
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (objZ instanceof C2529m) {
            objZ = "unknown";
        }
        return (String) objZ;
    }

    public static int c(Context context) {
        AbstractC3340k.e(context, "context");
        Object systemService = context.getSystemService("sensor");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public static boolean d(Context context) {
        AbstractC3340k.e(context, "context");
        return Settings.canDrawOverlays(context);
    }

    public static boolean e(Context context) {
        Object objZ;
        boolean zA;
        AbstractC3340k.e(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zA = false;
            } else {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zA = a(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objZ = Boolean.valueOf(zA);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Object obj = Boolean.FALSE;
        if (objZ instanceof C2529m) {
            objZ = obj;
        }
        return ((Boolean) objZ).booleanValue();
    }

    public static boolean f(Context context) {
        Object objZ;
        AbstractC3340k.e(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            AbstractC3340k.d(allNetworks, "cm.allNetworks");
            int length = allNetworks.length;
            boolean z2 = false;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i5]);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        z2 = true;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            objZ = Boolean.valueOf(z2);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Object obj = Boolean.FALSE;
        if (objZ instanceof C2529m) {
            objZ = obj;
        }
        return ((Boolean) objZ).booleanValue();
    }

    public static boolean a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !AbstractC3340k.a(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public static String a(Context context) {
        Object objZ;
        AbstractC3340k.e(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                objZ = "none";
            } else {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    objZ = "unknown";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    if (networkCapabilities.hasTransport(1)) {
                        sb2.append("wifi");
                    } else if (networkCapabilities.hasTransport(0)) {
                        sb2.append("cellular");
                    } else if (networkCapabilities.hasTransport(3)) {
                        sb2.append("ethernet");
                    } else {
                        sb2.append("other");
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        sb2.append("+vpn");
                    }
                    if (connectivityManager.isActiveNetworkMetered()) {
                        sb2.append("+metered");
                    }
                    objZ = sb2.toString();
                    AbstractC3340k.d(objZ, "StringBuilder().apply(builderAction).toString()");
                }
            }
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        return (String) (objZ instanceof C2529m ? "unknown" : objZ);
    }

    public static String a(Throwable th) {
        boolean z2;
        if (th == null) {
            return "none";
        }
        Iterator it = n.a0(th, d.f33500a).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((Throwable) it.next()) instanceof CertificateException) {
                z2 = true;
                break;
            }
        }
        boolean z10 = th instanceof SSLHandshakeException;
        if (z10 && z2) {
            return "SSL_CERT_ERROR";
        }
        if (z10) {
            return "SSL_HANDSHAKE";
        }
        if (th instanceof SSLPeerUnverifiedException) {
            return "SSL_PEER_UNVERIFIED";
        }
        if (th instanceof SSLException) {
            return "SSL_ERROR";
        }
        if (th instanceof UnknownHostException) {
            return "DNS_FAILURE";
        }
        if (th instanceof ConnectException) {
            return "CONNECT_FAILURE";
        }
        if (th instanceof SocketTimeoutException) {
            return "TIMEOUT";
        }
        if (th instanceof SocketException) {
            SocketException socketException = (SocketException) th;
            String message = socketException.getMessage();
            if (message != null && k.n0(message, "reset", true)) {
                return "CONNECTION_RESET";
            }
            String message2 = socketException.getMessage();
            if (message2 != null && k.n0(message2, "abort", true)) {
                return "CONNECTION_ABORT";
            }
            String message3 = socketException.getMessage();
            return (message3 == null || !k.n0(message3, "closed", true)) ? "SOCKET_ERROR" : "CONNECTION_CLOSED";
        }
        return th.getClass().getSimpleName();
    }
}
