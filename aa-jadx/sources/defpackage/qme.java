package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qme extends java.lang.Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(10);
        super.run();
    }
}
