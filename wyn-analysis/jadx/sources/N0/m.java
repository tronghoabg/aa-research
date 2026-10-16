package N0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p8.p;

/* loaded from: classes.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f8021a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8022b = new l(this);

    public m(j jVar) {
        this.f8021a = new WeakReference(jVar);
    }

    @Override // p8.p
    public final void addListener(Runnable runnable, Executor executor) {
        this.f8022b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        j jVar = (j) this.f8021a.get();
        boolean zCancel = this.f8022b.cancel(z2);
        if (zCancel && jVar != null) {
            jVar.f8016a = null;
            jVar.f8017b = null;
            jVar.f8018c.i(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8022b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8022b.f8013a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8022b.isDone();
    }

    public final String toString() {
        return this.f8022b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f8022b.get(j8, timeUnit);
    }
}
