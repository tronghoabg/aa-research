package androidx.compose.foundation.platform;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Synchronization_androidKt {
    public static final Object makeSynchronizedObject(Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i2, Object obj2) {
        if (1 == (i2 & 1)) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3047synchronized(Object obj, a<? extends R> aVar) {
        R rInvoke;
        synchronized (obj) {
            rInvoke = aVar.invoke();
        }
        return rInvoke;
    }
}
