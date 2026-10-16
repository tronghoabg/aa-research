package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sqv implements java.util.concurrent.Executor {
    private final android.os.Handler a;

    public sqv(android.os.Looper looper) {
        this.a = new defpackage.stq(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.post(runnable);
    }
}
