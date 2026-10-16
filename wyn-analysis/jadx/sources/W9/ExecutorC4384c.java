package w9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: w9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC4384c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final C4382a f47413a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47414b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f47415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4386e f47416d;

    public ExecutorC4384c(C4386e c4386e) {
        this.f47416d = c4386e;
        RunnableC4383b runnableC4383b = new RunnableC4383b(this);
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnableC4383b);
        this.f47415c = threadNewThread;
        threadNewThread.setName("FirestoreWorker");
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new com.moloco.sdk.internal.error.crash.a(this, 1));
        C4382a c4382a = new C4382a(this, runnableC4383b);
        this.f47413a = c4382a;
        c4382a.setKeepAliveTime(3L, TimeUnit.SECONDS);
        this.f47414b = false;
    }

    public final Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            execute(new ng.a(25, taskCompletionSource, callable));
        } catch (RejectedExecutionException unused) {
            Ba.c.p(C4386e.class.getSimpleName(), "Refused to enqueue task after panic", 2, new Object[0]);
        }
        return taskCompletionSource.getTask();
    }

    public final synchronized boolean c() {
        return this.f47414b;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (!this.f47414b) {
            this.f47413a.execute(runnable);
        }
    }
}
