package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wgd implements java.io.Closeable {
    private final /* synthetic */ int a;
    private java.lang.Object b;

    public wgd(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        int i = this.a;
        java.lang.Object obj = this.b;
        if (i != 0) {
            if (obj != null) {
                ((java.nio.channels.FileLock) obj).release();
                this.b = null;
                return;
            }
            return;
        }
        if (obj != null) {
            ((java.util.concurrent.Semaphore) obj).release();
            this.b = null;
        }
    }
}
