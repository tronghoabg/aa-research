package od;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class D0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final a2.v f41535a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f41536b;

    public D0(a2.v vVar) {
        Fe.e.t(vVar, "executorPool");
        this.f41535a = vVar;
    }

    public final synchronized void b() {
        Executor executor = this.f41536b;
        if (executor != null) {
            V1.b((U1) this.f41535a.f17322b, executor);
            this.f41536b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f41536b == null) {
                    Executor executor2 = (Executor) V1.a((U1) this.f41535a.f17322b);
                    Executor executor3 = this.f41536b;
                    if (executor2 == null) {
                        throw new NullPointerException(Fe.g.E("%s.getObject()", executor3));
                    }
                    this.f41536b = executor2;
                }
                executor = this.f41536b;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
