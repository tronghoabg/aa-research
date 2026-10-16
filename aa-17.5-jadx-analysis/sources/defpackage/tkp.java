package defpackage;

/* loaded from: classes3.dex */
public final class tkp implements Runnable {
    public volatile boolean a = false;
    public volatile Object b;
    private final xyc c;

    public tkp(xyc xycVar) {
        this.c = xycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b = this.c.gu();
        synchronized (this) {
            this.a = true;
            notifyAll();
        }
    }
}
