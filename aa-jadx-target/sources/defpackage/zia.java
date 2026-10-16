package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class zia extends zga.f implements java.lang.Runnable {
    private final java.lang.Runnable a;

    public zia(java.lang.Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (java.lang.Throwable th) {
            p(th);
            throw th;
        }
    }
}
