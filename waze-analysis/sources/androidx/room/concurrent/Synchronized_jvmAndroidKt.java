package androidx.room.concurrent;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Synchronized_jvmAndroidKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m13234synchronized(Object obj, a<? extends T> aVar) {
        T tInvoke;
        x.f(obj, "lock");
        x.f(aVar, "block");
        synchronized (obj) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }
}
