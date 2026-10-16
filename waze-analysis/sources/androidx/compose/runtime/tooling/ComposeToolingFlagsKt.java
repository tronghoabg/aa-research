package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.Trace;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeToolingFlagsKt {
    public static final <T> T verboseTrace(String str, a<? extends T> aVar) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled) {
            return aVar.invoke();
        }
        Trace.INSTANCE.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.INSTANCE.endSection(null);
        }
    }
}
