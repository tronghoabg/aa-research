package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zgb extends zgj {
    private final zgp a;

    public zgb(zgp zgpVar) {
        zgpVar.getClass();
        this.a = zgpVar;
    }

    @Override // defpackage.zeu, defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.zeu, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.zeu, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.a.get();
    }

    @Override // defpackage.zeu, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.zeu, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.zeu
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.zeu, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.a.get(j, timeUnit);
    }
}
