package androidx.compose.runtime;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronization_jvmKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m7286synchronized(Object obj, a<? extends R> aVar) {
        R rInvoke;
        synchronized (obj) {
            rInvoke = aVar.invoke();
        }
        return rInvoke;
    }
}
