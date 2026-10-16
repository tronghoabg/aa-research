package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class esx extends defpackage.ete implements java.lang.Runnable {
    boolean a;
    final /* synthetic */ defpackage.esy b;

    public esx(defpackage.esy esyVar) {
        this.b = esyVar;
    }

    @Override // defpackage.ete
    public final java.lang.Object a() {
        try {
            return this.b.a();
        } catch (defpackage.dwj e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.ete
    protected final void b(java.lang.Object obj) {
        this.b.c(this, obj);
    }

    @Override // defpackage.ete
    protected final void c(java.lang.Object obj) {
        defpackage.esy esyVar = this.b;
        if (esyVar.a != this) {
            esyVar.c(this, obj);
            return;
        }
        if (esyVar.f) {
            esyVar.f(obj);
            return;
        }
        esyVar.i = false;
        android.os.SystemClock.uptimeMillis();
        esyVar.a = null;
        esyVar.k(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.e();
    }
}
