package androidx.lifecycle.viewmodel.internal;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SynchronizedObject_jvmKt {
    public static final <T> T synchronizedImpl(SynchronizedObject synchronizedObject, a<? extends T> aVar) {
        T tInvoke;
        x.f(synchronizedObject, "lock");
        x.f(aVar, "action");
        synchronized (synchronizedObject) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }
}
