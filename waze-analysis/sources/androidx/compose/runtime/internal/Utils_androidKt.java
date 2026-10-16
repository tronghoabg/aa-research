package androidx.compose.runtime.internal;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Utils_androidKt {
    private static final String LogTag = "ComposeInternal";

    public static final void logError(String str, Throwable th) {
        Log.e(LogTag, str, th);
    }
}
