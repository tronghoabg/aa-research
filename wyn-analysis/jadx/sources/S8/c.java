package S8;

import Pc.C0786b;
import R8.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11029a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11030b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Task f11031c = Tasks.forResult(null);

    public c(ExecutorService executorService) {
        this.f11029a = executorService;
    }

    public final Task b(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f11030b) {
            taskContinueWithTask = this.f11031c.continueWithTask(this.f11029a, new b(runnable, 0));
            this.f11031c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task c(k kVar) {
        Task taskContinueWithTask;
        synchronized (this.f11030b) {
            taskContinueWithTask = this.f11031c.continueWithTask(this.f11029a, new C0786b(kVar, 29));
            this.f11031c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11029a.execute(runnable);
    }
}
