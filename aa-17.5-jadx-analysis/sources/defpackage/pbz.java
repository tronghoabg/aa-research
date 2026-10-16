package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* loaded from: classes2.dex */
public interface pbz {
    NetworkCapabilities a(Network network);

    void b(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback);

    void c(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, int i);

    void d(ConnectivityManager.NetworkCallback networkCallback);
}
