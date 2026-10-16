package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xvg implements java.lang.Runnable, defpackage.xvr {
    private defpackage.xvq a;
    private defpackage.xvq b;
    private final boolean c = defpackage.wfp.h(java.lang.Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public xvg(defpackage.xvq xvqVar, boolean z) {
        this.f = false;
        this.a = xvqVar;
        this.b = xvqVar;
        this.f = z;
    }

    private final void b() {
        this.d = true;
        defpackage.xvq xvqVar = this.a;
        if (this.c && !this.e) {
            defpackage.wfp.h(java.lang.Thread.currentThread());
        }
        xvqVar.j();
        this.a = null;
    }

    public final void a(defpackage.zhs zhsVar) {
        if (this.d) {
            throw new java.lang.IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.k();
        zhsVar.c(this, defpackage.zgt.INSTANCE);
    }

    @Override // defpackage.xvr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        defpackage.xvq xvqVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new java.lang.IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (xvqVar != null) {
                xvqVar.close();
            }
            if (this.f) {
                defpackage.xuy.c(defpackage.xvf.a);
            }
        } catch (java.lang.Throwable th) {
            if (xvqVar != null) {
                try {
                    xvqVar.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            defpackage.wfp.e(new defpackage.ozv(16));
        } else {
            b();
        }
    }
}
