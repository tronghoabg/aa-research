package androidx.lifecycle;

import h.c.j;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PausingDispatcher extends ab {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // kotlinx.coroutines.ab
    public void dispatch(j jVar, Runnable runnable) {
        x.f(jVar, "context");
        x.f(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(jVar, runnable);
    }

    @Override // kotlinx.coroutines.ab
    public boolean isDispatchNeeded(j jVar) {
        x.f(jVar, "context");
        int i2 = av.f51370a;
        return ac.f51860a.c().isDispatchNeeded(jVar) || !this.dispatchQueue.canRun();
    }
}
