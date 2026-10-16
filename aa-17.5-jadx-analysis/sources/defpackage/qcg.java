package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qcg {
    private static final yob a = yob.c("com/google/android/apps/gmm/xf/Bridge");
    private static final Object b = new Object();
    private static final Set c = new HashSet();

    public static void a() {
        synchronized (b) {
            woy.aa(false, "Bridge not initialized yet.");
            throw null;
        }
    }

    public static void b(String str) {
        synchronized (b) {
            Set set = c;
            if (set.contains(str)) {
                return;
            }
            ((ynz) ((ynz) ((ynz) a.g()).p(new IllegalStateException("Bridge.loadLibrary called without BridgeInitializer."))).ai(6990)).y("Bridge.loadLibrary called without BridgeInitializer for %s", str);
            System.loadLibrary(str);
            set.add(str);
        }
    }
}
