package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkRequestCompatKt {
    private static final int[] defaultCapabilities = {13, 15, 14};

    public static final int[] getCapabilitiesCompat(NetworkRequest networkRequest) {
        x.f(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.INSTANCE.capabilities(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 30; i2++) {
            int i3 = iArr[i2];
            if (NetworkRequest28.INSTANCE.hasCapability$work_runtime(networkRequest, i3)) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return i.aA(arrayList);
    }

    public static final int[] getTransportTypesCompat(NetworkRequest networkRequest) {
        x.f(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.INSTANCE.transportTypes(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = iArr[i2];
            if (NetworkRequest28.INSTANCE.hasTransport$work_runtime(networkRequest, i3)) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return i.aA(arrayList);
    }
}
