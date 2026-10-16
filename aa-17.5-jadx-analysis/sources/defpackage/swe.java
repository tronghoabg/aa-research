package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class swe extends svz {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final nrd e = new nrd();

    private final void s() {
        if (this.b) {
            if (!f()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excD = d();
        }
    }

    private final void t() {
        synchronized (this.a) {
            if (this.b) {
                this.e.h(this);
            }
        }
    }

    @Override // defpackage.svz
    public final svz a(Executor executor, svm svmVar) {
        swe sweVar = new swe();
        this.e.g(new svn(executor, svmVar, sweVar));
        t();
        return sweVar;
    }

    @Override // defpackage.svz
    public final svz b(Executor executor, svm svmVar) {
        swe sweVar = new swe();
        this.e.g(new svo(svmVar, sweVar));
        t();
        return sweVar;
    }

    @Override // defpackage.svz
    public final svz c(Executor executor, svy svyVar) {
        swe sweVar = new swe();
        this.e.g(new svw(executor, svyVar, sweVar));
        t();
        return sweVar;
    }

    @Override // defpackage.svz
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.svz
    public final Object e() {
        Object obj;
        synchronized (this.a) {
            if (!this.b) {
                throw new IllegalStateException("Task is not yet complete");
            }
            if (this.c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.d;
            if (exc != null) {
                throw new svx(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.svz
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.svz
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

    @Override // defpackage.svz
    public final void h(Executor executor, svr svrVar) {
        this.e.g(new svq(svrVar));
        t();
    }

    @Override // defpackage.svz
    public final void i(Executor executor, svs svsVar) {
        this.e.g(new svt(executor, svsVar, 1));
        t();
    }

    @Override // defpackage.svz
    public final void j(svu svuVar) {
        k(swd.a, svuVar);
    }

    @Override // defpackage.svz
    public final void k(Executor executor, svu svuVar) {
        this.e.g(new svt(executor, svuVar, 0));
        t();
    }

    @Override // defpackage.svz
    public final void l(Executor executor, svv svvVar) {
        this.e.g(new svt(executor, svvVar, 2));
        t();
    }

    @Override // defpackage.svz
    public final void m(svs svsVar) {
        i(swd.a, svsVar);
    }

    @Override // defpackage.svz
    public final void n(svv svvVar) {
        l(swd.a, svvVar);
    }

    public final void o(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.a) {
            s();
            this.b = true;
            this.d = exc;
        }
        this.e.h(this);
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            s();
            this.b = true;
            this.f = obj;
        }
        this.e.h(this);
    }

    @ResultIgnorabilityUnspecified
    public final boolean q(Object obj) {
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

    @ResultIgnorabilityUnspecified
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
