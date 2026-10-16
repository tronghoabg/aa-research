package androidx.core.os;

import android.os.Trace;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TraceKt {
    public static final <T> T trace(String str, a<? extends T> aVar) {
        x.f(str, "sectionName");
        x.f(aVar, "block");
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
