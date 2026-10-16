package androidx.work.impl.utils;

import android.net.NetworkRequest;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class NetworkRequest31 {
    public static final NetworkRequest31 INSTANCE = new NetworkRequest31();

    private NetworkRequest31() {
    }

    public final int[] capabilities(NetworkRequest networkRequest) {
        x.f(networkRequest, "request");
        int[] capabilities = networkRequest.getCapabilities();
        x.e(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    public final int[] transportTypes(NetworkRequest networkRequest) {
        x.f(networkRequest, "request");
        int[] transportTypes = networkRequest.getTransportTypes();
        x.e(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
