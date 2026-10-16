package defpackage;

/* loaded from: classes2.dex */
public final class pyv implements Runnable {
    public final Runnable a;
    public final pyw b;
    public final /* synthetic */ pyx c;

    public pyv(pyx pyxVar, Runnable runnable, pyw pywVar) {
        this.c = pyxVar;
        this.a = runnable;
        this.b = pywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new pru(this, 19).run();
    }
}
