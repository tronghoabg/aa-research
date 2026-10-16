package androidx.tracing;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ContextElements_jvmAndAndroidKt {
    public static final PlatformThreadContextElement buildCoroutinePropagationElement(PerfettoTracer perfettoTracer, String str, String str2, List<Long> list) {
        return new CoroutinePropagationElement(perfettoTracer, str, str2, list);
    }

    public static final PlatformThreadContextElement buildPropagationElement(PerfettoTracer perfettoTracer, String str, String str2, List<Long> list) {
        return new PropagationElement(perfettoTracer, str, str2, list);
    }
}
