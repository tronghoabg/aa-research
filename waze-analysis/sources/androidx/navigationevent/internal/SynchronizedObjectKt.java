package androidx.navigationevent.internal;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SynchronizedObjectKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m13233synchronized(SynchronizedObject synchronizedObject, a<? extends T> aVar) {
        T tInvoke;
        x.f(synchronizedObject, "lock");
        x.f(aVar, "action");
        synchronized (synchronizedObject) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }
}
