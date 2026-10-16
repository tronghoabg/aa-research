package androidx.lifecycle.viewmodel.internal;

import h.c.j;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CloseableCoroutineScope implements AutoCloseable, af {
    private final j coroutineContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(af afVar) {
        this(afVar.getCoroutineContext());
        x.f(afVar, "coroutineScope");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        aj.W(getCoroutineContext(), null);
    }

    @Override // kotlinx.coroutines.af
    public j getCoroutineContext() {
        return this.coroutineContext;
    }

    public CloseableCoroutineScope(j jVar) {
        x.f(jVar, "coroutineContext");
        this.coroutineContext = jVar;
    }
}
