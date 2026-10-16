package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hyl extends java.lang.Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(9);
        super.run();
    }
}
