package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class dod implements zgp, afck {
    private final aiud a;
    private final doc b = new doc();

    public dod(aiud aiudVar) {
        this.a = aiudVar;
    }

    @Override // defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.b.cancel(z);
        if (zCancel) {
            this.a.s(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.b.get(j, timeUnit);
    }

    @Override // defpackage.afck
    public final afco hH() {
        return dof.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // defpackage.afck
    public final void w(Object obj) {
        Throwable thA = aezw.a(obj);
        if (thA == null) {
            this.b.e(obj);
            return;
        }
        boolean z = thA instanceof CancellationException;
        doc docVar = this.b;
        if (z) {
            docVar.cancel(false);
        } else {
            docVar.f(thA);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }
}
