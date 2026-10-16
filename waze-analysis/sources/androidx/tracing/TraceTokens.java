package androidx.tracing;

import h.a.i;
import h.c.j;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TraceTokens {
    public static final PlatformThreadContextElement inheritedCoroutinePropagationToken(PlatformThreadContextElement platformThreadContextElement, PerfettoTracer perfettoTracer) {
        String category;
        List<Long> listD;
        String name;
        String str = "";
        if (platformThreadContextElement == null || (category = platformThreadContextElement.getCategory()) == null) {
            category = "";
        }
        if (platformThreadContextElement != null && (name = platformThreadContextElement.getName()) != null) {
            str = name;
        }
        if (platformThreadContextElement == null || (listD = platformThreadContextElement.getFlowIds()) == null) {
            listD = i.d(Long.valueOf(CommonKt.monotonicId()));
        }
        return new CoroutinePropagationElement(perfettoTracer, category, str, listD);
    }

    public static final PlatformThreadContextElement inheritedPropagationToken(PlatformThreadContextElement platformThreadContextElement, PerfettoTracer perfettoTracer) {
        String category;
        List<Long> listD;
        String name;
        String str = "";
        if (platformThreadContextElement == null || (category = platformThreadContextElement.getCategory()) == null) {
            category = "";
        }
        if (platformThreadContextElement != null && (name = platformThreadContextElement.getName()) != null) {
            str = name;
        }
        if (platformThreadContextElement == null || (listD = platformThreadContextElement.getFlowIds()) == null) {
            listD = i.d(Long.valueOf(CommonKt.monotonicId()));
        }
        return new PropagationElement(perfettoTracer, category, str, listD);
    }

    public static final PlatformThreadContextElement platformThreadContextElement(j jVar) {
        return (PlatformThreadContextElement) jVar.get(PlatformThreadContextElement.KEY);
    }
}
