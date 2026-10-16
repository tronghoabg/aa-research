package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zsi extends FutureTask {
    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        zrt.a.b();
        return super.get();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        zrt.a.b();
        return super.get(j, timeUnit);
    }
}
