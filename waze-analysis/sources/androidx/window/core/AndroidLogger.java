package androidx.window.core;

import android.util.Log;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AndroidLogger implements Logger {
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(String str, String str2) {
        x.f(str, "tag");
        x.f(str2, "message");
        Log.d(str, str2);
    }
}
