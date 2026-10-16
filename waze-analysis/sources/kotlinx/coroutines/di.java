package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class di extends ab {

    /* renamed from: b, reason: collision with root package name */
    public static final di f51845b = new di();

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        dm dmVar = (dm) jVar.get(dm.f51848b);
        if (dmVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        dmVar.f51849a = true;
    }

    @Override // kotlinx.coroutines.ab
    public final boolean isDispatchNeeded(h.c.j jVar) {
        return false;
    }

    @Override // kotlinx.coroutines.ab
    public final ab limitedParallelism(int i2, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
