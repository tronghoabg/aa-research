package androidx.collection.internal;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m1698synchronized(Lock lock, a<? extends T> aVar) {
        T tInvoke;
        x.f(lock, "<this>");
        x.f(aVar, "block");
        synchronized (lock) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }
}
