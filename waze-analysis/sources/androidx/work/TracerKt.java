package androidx.work;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TracerKt {
    public static final <T> T traced(Tracer tracer, String str, a<? extends T> aVar) {
        x.f(tracer, "<this>");
        x.f(str, "label");
        x.f(aVar, "block");
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } catch (Throwable th) {
                if (zIsEnabled) {
                    tracer.endSection();
                }
                throw th;
            }
        }
        T tInvoke = aVar.invoke();
        if (zIsEnabled) {
            tracer.endSection();
        }
        return tInvoke;
    }
}
