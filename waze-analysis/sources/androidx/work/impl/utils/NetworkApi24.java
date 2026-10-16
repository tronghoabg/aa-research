package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkApi24 {
    public static final void registerDefaultNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        x.f(connectivityManager, "<this>");
        x.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
