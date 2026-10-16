package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aebk implements java.lang.Runnable {
    final /* synthetic */ defpackage.aebl b;

    public aebk(defpackage.aebl aeblVar) {
        this.b = aeblVar;
    }

    public abstract void a() throws java.io.IOException;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.b.f == null) {
                throw new java.io.IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (java.lang.Exception e) {
            this.b.c.d(e);
        }
    }
}
