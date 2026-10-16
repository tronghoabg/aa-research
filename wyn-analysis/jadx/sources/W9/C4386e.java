package w9;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kd.RunnableC3307c;
import me.C3558a;

/* renamed from: w9.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4386e {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f47429c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f47428b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC4384c f47427a = new ExecutorC4384c(this);

    public final Task a(Runnable runnable) {
        return this.f47427a.b(new G8.c(runnable, 12));
    }

    public final C3558a b(EnumC4385d enumC4385d, long j8, Runnable runnable) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (this.f47429c.contains(enumC4385d)) {
            j8 = 0;
        }
        System.currentTimeMillis();
        C3558a c3558a = new C3558a(this, runnable);
        ExecutorC4384c executorC4384c = this.f47427a;
        RunnableC3307c runnableC3307c = new RunnableC3307c(c3558a, 20);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (executorC4384c) {
            scheduledFutureSchedule = !executorC4384c.f47414b ? executorC4384c.f47413a.schedule(runnableC3307c, j8, timeUnit) : null;
        }
        c3558a.f40737b = scheduledFutureSchedule;
        this.f47428b.add(c3558a);
        return c3558a;
    }

    public final void c(Throwable th) {
        this.f47427a.f47413a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new RunnableC3307c(th, 19));
    }

    public final void d() {
        Thread threadCurrentThread = Thread.currentThread();
        ExecutorC4384c executorC4384c = this.f47427a;
        Thread thread = executorC4384c.f47415c;
        if (thread == threadCurrentThread) {
            return;
        }
        A6.c.s("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(executorC4384c.f47415c.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        throw null;
    }
}
