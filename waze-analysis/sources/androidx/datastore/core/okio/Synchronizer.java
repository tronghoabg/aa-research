package androidx.datastore.core.okio;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Synchronizer {
    public final <T> T withLock(a<? extends T> aVar) {
        T tInvoke;
        x.f(aVar, "block");
        synchronized (this) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }
}
