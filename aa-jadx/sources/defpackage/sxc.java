package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sxc extends defpackage.swx {
    public boolean b;
    public volatile boolean c;
    public java.lang.Exception d;
    private java.lang.Object f;
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.nrr e = new defpackage.nrr();

    private final void s() {
        java.lang.String strConcat;
        if (this.b) {
            if (!f()) {
                throw new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            java.lang.Exception excD = d();
            if (excD != null) {
                strConcat = "failure";
            } else if (g()) {
                strConcat = "result ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e())));
            } else {
                strConcat = this.c ? "cancellation" : "unknown issue";
            }
        }
    }

    private final void t() {
        synchronized (this.a) {
            if (this.b) {
                this.e.h(this);
            }
        }
    }

    @Override // defpackage.swx
    public final defpackage.swx a(java.util.concurrent.Executor executor, defpackage.swk swkVar) {
        defpackage.sxc sxcVar = new defpackage.sxc();
        this.e.g(new defpackage.swl(executor, swkVar, sxcVar));
        t();
        return sxcVar;
    }

    @Override // defpackage.swx
    public final defpackage.swx b(java.util.concurrent.Executor executor, defpackage.swk swkVar) {
        defpackage.sxc sxcVar = new defpackage.sxc();
        this.e.g(new defpackage.swm(swkVar, sxcVar));
        t();
        return sxcVar;
    }

    @Override // defpackage.swx
    public final defpackage.swx c(java.util.concurrent.Executor executor, defpackage.sww swwVar) {
        defpackage.sxc sxcVar = new defpackage.sxc();
        this.e.g(new defpackage.swu(executor, swwVar, sxcVar));
        t();
        return sxcVar;
    }

    @Override // defpackage.swx
    public final java.lang.Exception d() {
        java.lang.Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.swx
    public final java.lang.Object e() {
        java.lang.Object obj;
        synchronized (this.a) {
            if (!this.b) {
                throw new java.lang.IllegalStateException("Task is not yet complete");
            }
            if (this.c) {
                throw new java.util.concurrent.CancellationException("Task is already canceled.");
            }
            java.lang.Exception exc = this.d;
            if (exc != null) {
                throw new defpackage.swv(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.swx
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.swx
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.swx
    public final void h(java.util.concurrent.Executor executor, defpackage.swp swpVar) {
        this.e.g(new defpackage.swo(swpVar));
        t();
    }

    @Override // defpackage.swx
    public final void i(java.util.concurrent.Executor executor, defpackage.swq swqVar) {
        this.e.g(new defpackage.swr(executor, swqVar, 1));
        t();
    }

    @Override // defpackage.swx
    public final void j(defpackage.sws swsVar) {
        k(defpackage.sxb.a, swsVar);
    }

    @Override // defpackage.swx
    public final void k(java.util.concurrent.Executor executor, defpackage.sws swsVar) {
        this.e.g(new defpackage.swr(executor, swsVar, 0));
        t();
    }

    @Override // defpackage.swx
    public final void l(java.util.concurrent.Executor executor, defpackage.swt swtVar) {
        this.e.g(new defpackage.swr(executor, swtVar, 2));
        t();
    }

    @Override // defpackage.swx
    public final void m(defpackage.swq swqVar) {
        i(defpackage.sxb.a, swqVar);
    }

    @Override // defpackage.swx
    public final void n(defpackage.swt swtVar) {
        l(defpackage.sxb.a, swtVar);
    }

    public final void o(java.lang.Exception exc) {
        if (exc == null) {
            throw new java.lang.NullPointerException("Exception must not be null");
        }
        synchronized (this.a) {
            s();
            this.b = true;
            this.d = exc;
        }
        this.e.h(this);
    }

    public final void p(java.lang.Object obj) {
        synchronized (this.a) {
            s();
            this.b = true;
            this.f = obj;
        }
        this.e.h(this);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean q(java.lang.Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.h(this);
            return true;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void r() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.h(this);
        }
    }
}
