package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dwt extends java.lang.Thread {
    private final int a;

    public dwt(java.lang.Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.a);
        super.run();
    }
}
