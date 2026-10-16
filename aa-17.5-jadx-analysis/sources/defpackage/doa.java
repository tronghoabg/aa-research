package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class doa implements zgp {
    final WeakReference a;
    public final dnv b = new dnz(this);

    public doa(dnw dnwVar) {
        this.a = new WeakReference(dnwVar);
    }

    public final boolean a(Throwable th) {
        return this.b.f(th);
    }

    @Override // defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        dnw dnwVar = (dnw) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || dnwVar == null) {
            return zCancel;
        }
        dnwVar.a = null;
        dnwVar.b = null;
        dnwVar.c.e(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.b.get(j, timeUnit);
    }
}
