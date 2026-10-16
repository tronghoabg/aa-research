package Q3;

import J3.r;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9839a;

    static {
        String strF = r.f("NetworkStateTracker");
        AbstractC3340k.d(strF, "tagWithPrefix(\"NetworkStateTracker\")");
        f9839a = strF;
    }

    public static final O3.a a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        AbstractC3340k.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = T3.h.a(connectivityManager, T3.i.a(connectivityManager));
        } catch (SecurityException e7) {
            r.d().c(f9839a, "Unable to validate active network", e7);
        }
        boolean zB = networkCapabilitiesA != null ? T3.h.b(networkCapabilitiesA, 16) : false;
        return new O3.a(z2, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
