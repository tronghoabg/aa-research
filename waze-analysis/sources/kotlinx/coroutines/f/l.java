package kotlinx.coroutines.f;

import h.g.b.au;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends ab {

    /* renamed from: b, reason: collision with root package name */
    public static final l f51973b = new l();

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        e.f51960b.b(runnable, false);
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatchYield(h.c.j jVar, Runnable runnable) {
        e.f51960b.b(runnable, true);
    }

    @Override // kotlinx.coroutines.ab
    public final ab limitedParallelism(int i2, String str) {
        au.m(i2);
        return i2 >= k.f51970d ? au.l(this, str) : super.limitedParallelism(i2, str);
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        return "Dispatchers.IO";
    }
}
