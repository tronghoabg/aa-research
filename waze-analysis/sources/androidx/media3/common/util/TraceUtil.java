package androidx.media3.common.util;

import android.os.Trace;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
