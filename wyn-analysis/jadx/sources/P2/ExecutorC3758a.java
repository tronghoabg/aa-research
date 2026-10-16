package p2;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import m9.B;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC3758a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43195a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f43196b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f43197c;

    public ExecutorC3758a() {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.f43197c = new Semaphore(4);
        this.f43196b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f43195a) {
            case 0:
                ((ExecutorService) this.f43196b).execute(runnable);
                break;
            default:
                if (!((Semaphore) this.f43197c).tryAcquire()) {
                    runnable.run();
                    break;
                } else {
                    try {
                        this.f43196b.execute(new ng.a(28, this, runnable));
                        break;
                    } catch (RejectedExecutionException unused) {
                        runnable.run();
                        return;
                    }
                }
        }
    }

    public ExecutorC3758a(ExecutorService executorService, B b5) {
        this.f43196b = executorService;
        this.f43197c = b5;
    }
}
