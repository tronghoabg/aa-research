package defpackage;

import android.content.Context;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class qlk {
    public static volatile qlk a;
    public final Context b;
    public final List c;
    public final qlh d;
    public volatile qln e;
    public Thread.UncaughtExceptionHandler f;

    public qlk(Context context) {
        Context applicationContext = context.getApplicationContext();
        spu.aw(applicationContext);
        this.b = applicationContext;
        this.d = new qlh(this);
        this.c = new CopyOnWriteArrayList();
        new qlb();
    }

    public static void b() {
        if (!(Thread.currentThread() instanceof qlj)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future a(Callable callable) {
        if (!(Thread.currentThread() instanceof qlj)) {
            return this.d.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void c(Runnable runnable) {
        this.d.submit(runnable);
    }
}
