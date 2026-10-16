package androidx.compose.ui.util;

import android.os.Trace;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(String str, a<? extends T> aVar) {
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final void traceValue(String str, long j2) {
        Trace.setCounter(str, j2);
    }
}
