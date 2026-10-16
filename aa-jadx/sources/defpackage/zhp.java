package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zhp extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
    private final defpackage.zhq a;

    public zhp(defpackage.zhq zhqVar) {
        this.a = zhqVar;
    }

    public final void a(java.lang.Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
