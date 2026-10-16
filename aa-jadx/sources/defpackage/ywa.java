package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ywa implements java.util.concurrent.Executor {
    final /* synthetic */ java.util.concurrent.Executor a;
    final /* synthetic */ defpackage.ywc b;

    public ywa(defpackage.ywc ywcVar, java.util.concurrent.Executor executor) {
        this.a = executor;
        this.b = ywcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.b.p(e);
        }
    }
}
