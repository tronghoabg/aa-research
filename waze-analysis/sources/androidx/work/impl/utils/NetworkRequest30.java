package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkRequest30 {
    public static final NetworkRequest30 INSTANCE = new NetworkRequest30();

    private NetworkRequest30() {
    }

    public final NetworkSpecifier getNetworkSpecifier(NetworkRequest networkRequest) {
        x.f(networkRequest, "request");
        return networkRequest.getNetworkSpecifier();
    }
}
