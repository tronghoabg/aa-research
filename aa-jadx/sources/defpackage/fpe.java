package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fpe implements defpackage.fpn {
    private static final java.lang.String b = defpackage.fjv.b("SerialExecutorImpl");
    private final java.util.concurrent.Executor d;
    private java.lang.Runnable e;
    private final java.util.ArrayDeque c = new java.util.ArrayDeque();
    public final java.lang.Object a = new java.lang.Object();

    public fpe(java.util.concurrent.Executor executor) {
        this.d = executor;
    }

    public final void a() {
        java.lang.Runnable runnable = (java.lang.Runnable) this.c.poll();
        this.e = runnable;
        if (runnable != null) {
            try {
                this.d.execute(runnable);
            } catch (java.lang.Throwable th) {
                defpackage.fjv.a();
                android.util.Log.e(b, "Delegate executor failed to execute", th);
                this.e = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        synchronized (this.a) {
            this.c.add(new defpackage.flc(this, runnable, 2));
            if (this.e == null) {
                a();
            }
        }
    }
}
