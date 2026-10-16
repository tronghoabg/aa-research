package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fju {
    public android.content.Context a;
    public androidx.work.WorkerParameters b;
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(-256);
    public boolean d;

    public fju(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new java.lang.IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public defpackage.zhs a() {
        throw null;
    }

    public abstract defpackage.zhs b();

    public final defpackage.fjj d() {
        return this.b.b;
    }

    public final java.util.UUID e() {
        return this.b.a;
    }

    public final java.util.concurrent.Executor f() {
        return this.b.c;
    }

    public final void g(int i) {
        this.c.compareAndSet(-256, i);
    }

    public final boolean h() {
        return this.c.get() != -256;
    }
}
