package defpackage;

/* loaded from: classes.dex */
public final class xua implements Runnable, xul {
    private xuk a;
    private xuk b;
    private final boolean c = wer.h(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public xua(xuk xukVar, boolean z) {
        this.f = false;
        this.a = xukVar;
        this.b = xukVar;
        this.f = z;
    }

    private final void b() {
        this.d = true;
        xuk xukVar = this.a;
        if (this.c && !this.e) {
            wer.h(Thread.currentThread());
        }
        xukVar.j();
        this.a = null;
    }

    public final void a(zgp zgpVar) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.k();
        zgpVar.c(this, zfq.a);
    }

    @Override // defpackage.xul, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xuk xukVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (xukVar != null) {
                xukVar.close();
            }
            if (this.f) {
                xts.c(xtz.a);
            }
        } catch (Throwable th) {
            if (xukVar != null) {
                try {
                    xukVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            wer.e(new oyx(15));
        } else {
            b();
        }
    }
}
