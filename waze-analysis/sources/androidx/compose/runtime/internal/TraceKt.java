package androidx.compose.runtime.internal;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, a<? extends T> aVar) {
        Trace.INSTANCE.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.INSTANCE.endSection(null);
        }
    }
}
