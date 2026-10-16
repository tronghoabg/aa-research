package kotlinx.coroutines.f;

import h.k.n;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.bh;
import kotlinx.coroutines.e.al;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends bh implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final d f51958b = new d();

    /* renamed from: c, reason: collision with root package name */
    private static final ab f51959c = ab.limitedParallelism$default(l.f51973b, al.d("kotlinx.coroutines.io.parallelism", n.h(64, al.a()), 0, 0, 12), null, 2, null);

    @Override // kotlinx.coroutines.bh
    public final Executor a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        f51959c.dispatch(jVar, runnable);
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatchYield(h.c.j jVar, Runnable runnable) {
        f51959c.dispatchYield(jVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(h.c.k.f48060a, runnable);
    }

    @Override // kotlinx.coroutines.ab
    public final ab limitedParallelism(int i2, String str) {
        return l.f51973b.limitedParallelism(i2, str);
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        return "Dispatchers.IO";
    }
}
