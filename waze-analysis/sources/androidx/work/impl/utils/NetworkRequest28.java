package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.Logger;
import h.a.c;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkRequest28 {
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    public static final NetworkRequest createNetworkRequest(int[] iArr, int[] iArr2) {
        x.f(iArr, "capabilities");
        x.f(iArr2, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i2 : iArr) {
            try {
                builder.addCapability(i2);
            } catch (IllegalArgumentException e2) {
                Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring adding capability '" + i2 + "'", e2);
            }
        }
        for (int i3 : NetworkRequestCompatKt.defaultCapabilities) {
            if (!c.ah(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e3) {
                    Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring removing default capability '" + i3 + "'", e3);
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        x.e(networkRequestBuild, "build(...)");
        return networkRequestBuild;
    }

    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime(int[] iArr, int[] iArr2) {
        x.f(iArr, "capabilities");
        x.f(iArr2, "transports");
        return new NetworkRequestCompat(createNetworkRequest(iArr, iArr2));
    }

    public final boolean hasCapability$work_runtime(NetworkRequest networkRequest, int i2) {
        x.f(networkRequest, "request");
        return networkRequest.hasCapability(i2);
    }

    public final boolean hasTransport$work_runtime(NetworkRequest networkRequest, int i2) {
        x.f(networkRequest, "request");
        return networkRequest.hasTransport(i2);
    }
}
