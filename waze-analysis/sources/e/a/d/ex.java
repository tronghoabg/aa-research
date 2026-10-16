package e.a.d;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ex implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final gr f46909a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f46910b;

    ex(gr grVar) {
        this.f46909a = grVar;
    }

    final synchronized Executor a() {
        Executor executor;
        executor = this.f46910b;
        if (executor == null) {
            executor = (Executor) this.f46909a.a();
            com.google.d.b.an.D(executor, "%s.getObject()", this.f46910b);
            this.f46910b = executor;
        }
        return executor;
    }

    final synchronized void b() {
        Executor executor = this.f46910b;
        if (executor != null) {
            this.f46909a.b(executor);
            this.f46910b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}
