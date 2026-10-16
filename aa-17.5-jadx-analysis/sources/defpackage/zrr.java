package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* loaded from: classes3.dex */
public final class zrr {
    public static final zrr a = new zrr();
    private static final String b = "zrr";

    private zrr() {
    }

    public final StrictMode.ThreadPolicy a() {
        String str = b;
        if (zrn.e(str, 5)) {
            Log.w(str, "Suppressed StrictMode policy violation: StrictModeDiskReadViolation");
        }
        return StrictMode.allowThreadDiskReads();
    }

    public final StrictMode.ThreadPolicy b() {
        StrictMode.ThreadPolicy threadPolicyA = a();
        c();
        return threadPolicyA;
    }

    public final StrictMode.ThreadPolicy c() {
        String str = b;
        if (zrn.e(str, 5)) {
            Log.w(str, "Suppressed StrictMode policy violation: StrictModeDiskWriteViolation");
        }
        return StrictMode.allowThreadDiskWrites();
    }

    public final void d(StrictMode.ThreadPolicy threadPolicy) {
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
