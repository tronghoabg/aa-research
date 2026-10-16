package J3;

import B.F;
import Ef.C0505o0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements p8.p {

    /* renamed from: a, reason: collision with root package name */
    public final U3.j f5579a = new U3.j();

    public l(C0505o0 c0505o0) {
        c0505o0.invokeOnCompletion(new F(this, 2));
    }

    @Override // p8.p
    public final void addListener(Runnable runnable, Executor executor) {
        this.f5579a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return this.f5579a.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5579a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5579a.f12264a instanceof U3.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5579a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f5579a.get(j8, timeUnit);
    }
}
