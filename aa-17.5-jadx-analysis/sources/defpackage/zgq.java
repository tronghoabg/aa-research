package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zgq extends FutureTask implements zgp {
    private final zft a;

    public zgq(Runnable runnable) {
        super(runnable, null);
        this.a = new zft();
    }

    @Override // defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        zft zftVar = this.a;
        synchronized (zftVar.b) {
            if (zftVar.a) {
                zft.a(runnable, executor);
            } else {
                zftVar.c = new gjt(runnable, executor, zftVar.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        zft zftVar = this.a;
        synchronized (zftVar.b) {
            if (zftVar.a) {
                return;
            }
            zftVar.a = true;
            Object obj = zftVar.c;
            Object obj2 = null;
            zftVar.c = null;
            while (obj != null) {
                gjt gjtVar = (gjt) obj;
                Object obj3 = gjtVar.c;
                gjtVar.c = obj2;
                obj2 = obj;
                obj = obj3;
            }
            while (obj2 != null) {
                gjt gjtVar2 = (gjt) obj2;
                zft.a(gjtVar2.a, gjtVar2.b);
                obj2 = gjtVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public zgq(Callable callable) {
        super(callable);
        this.a = new zft();
    }
}
