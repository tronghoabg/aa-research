package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tea implements java.util.concurrent.Executor {
    private final android.os.Handler a;
    private final /* synthetic */ int b;

    public tea(android.os.Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.b;
        android.os.Handler handler = this.a;
        if (i != 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
        }
    }
}
