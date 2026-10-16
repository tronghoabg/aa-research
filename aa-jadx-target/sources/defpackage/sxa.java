package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class sxa implements java.util.concurrent.Executor {
    private final android.os.Handler a = new defpackage.stq(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.post(runnable);
    }
}
