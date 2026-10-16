package i8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public abstract class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f36915a;

    public z() {
        this.f36915a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f36915a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f36915a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public z(TaskCompletionSource taskCompletionSource) {
        this.f36915a = taskCompletionSource;
    }
}
