package androidx.core.util;

import h.ab;
import h.c.e;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(e<? super ab> eVar) {
        x.f(eVar, "<this>");
        return new ContinuationRunnable(eVar);
    }
}
