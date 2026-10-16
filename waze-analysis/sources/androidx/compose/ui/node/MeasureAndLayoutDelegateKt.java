package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegateKt {
    public static final <T> T traceMeasureLayout(String str, a<? extends T> aVar) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled) {
            return aVar.invoke();
        }
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final <T> T traceMeasureLayoutIf(boolean z, String str, a<? extends T> aVar) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled || !z) {
            return aVar.invoke();
        }
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
