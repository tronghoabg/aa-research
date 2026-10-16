package androidx.camera.camera2.pipe.core;

import android.os.Build;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DebugKt {
    public static final void checkApi(int i2, String str) {
        x.f(str, "methodName");
        if (Build.VERSION.SDK_INT >= i2) {
            return;
        }
        throw new IllegalStateException(str + " is not supported on API " + Build.VERSION.SDK_INT + " (requires API " + i2 + ")");
    }

    public static final void checkNOrHigher(String str) {
        x.f(str, "methodName");
    }

    public static final void checkOOrHigher(String str) {
        x.f(str, "methodName");
    }

    public static final void checkPOrHigher(String str) {
        x.f(str, "methodName");
    }

    public static final void checkQOrHigher(String str) {
        x.f(str, "methodName");
    }
}
