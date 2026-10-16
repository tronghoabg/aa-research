package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class zgc extends yel implements Future, zgp {
    protected zgc() {
    }

    protected abstract zgp a();

    @Override // defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        a().c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return e().cancel(z);
    }

    protected /* bridge */ /* synthetic */ Future e() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return e().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return e().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return e().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return e().get(j, timeUnit);
    }
}
