package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class zgr extends defpackage.zhq {
    private final java.util.concurrent.Executor a;
    final /* synthetic */ defpackage.zgs b;

    public zgr(defpackage.zgs zgsVar, java.util.concurrent.Executor executor) {
        this.b = zgsVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(java.lang.Object obj);

    @Override // defpackage.zhq
    public final void d(java.lang.Throwable th) {
        defpackage.zgs zgsVar = this.b;
        zgsVar.c = null;
        if (th instanceof java.util.concurrent.ExecutionException) {
            zgsVar.p(((java.util.concurrent.ExecutionException) th).getCause());
        } else if (th instanceof java.util.concurrent.CancellationException) {
            zgsVar.cancel(false);
        } else {
            zgsVar.p(th);
        }
    }

    @Override // defpackage.zhq
    public final void e(java.lang.Object obj) {
        this.b.c = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.b.p(e);
        }
    }

    @Override // defpackage.zhq
    public final boolean g() {
        return this.b.isDone();
    }
}
