package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tlm implements java.lang.Runnable {
    public volatile boolean a = false;
    public volatile java.lang.Object b;
    private final defpackage.xzi c;

    public tlm(defpackage.xzi xziVar) {
        this.c = xziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b = this.c.fF();
        synchronized (this) {
            this.a = true;
            notifyAll();
        }
    }
}
