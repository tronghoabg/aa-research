package androidx.collection.internal;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(a<? extends T> aVar) {
        T tInvoke;
        x.f(aVar, "block");
        synchronized (this) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }
}
