package com.google.android.gms.o;

import com.google.android.gms.common.api.internal.av;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa extends t {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5732a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final v f5733b = new v();

    /* renamed from: c, reason: collision with root package name */
    private boolean f5734c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f5735d;

    /* renamed from: e, reason: collision with root package name */
    private Object f5736e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f5737f;

    aa() {
    }

    private final void A() {
        synchronized (this.f5732a) {
            if (this.f5734c) {
                this.f5733b.b(this);
            }
        }
    }

    private final void x() {
        av.j(this.f5734c, "Task is not yet complete");
    }

    private final void y() {
        if (this.f5735d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void z() {
        if (this.f5734c) {
            throw f.a(this);
        }
    }

    @Override // com.google.android.gms.o.t
    public final t a(a aVar) {
        return b(z.f5781a, aVar);
    }

    @Override // com.google.android.gms.o.t
    public final t b(Executor executor, a aVar) {
        aa aaVar = new aa();
        this.f5733b.a(new c(executor, aVar, aaVar));
        A();
        return aaVar;
    }

    @Override // com.google.android.gms.o.t
    public final t c(Executor executor, a aVar) {
        aa aaVar = new aa();
        this.f5733b.a(new e(executor, aVar, aaVar));
        A();
        return aaVar;
    }

    @Override // com.google.android.gms.o.t
    public final t d(s sVar) {
        return e(z.f5781a, sVar);
    }

    @Override // com.google.android.gms.o.t
    public final t e(Executor executor, s sVar) {
        aa aaVar = new aa();
        this.f5733b.a(new q(executor, sVar, aaVar));
        A();
        return aaVar;
    }

    @Override // com.google.android.gms.o.t
    public final Exception f() {
        Exception exc;
        synchronized (this.f5732a) {
            exc = this.f5737f;
        }
        return exc;
    }

    @Override // com.google.android.gms.o.t
    public final Object g() {
        Object obj;
        synchronized (this.f5732a) {
            x();
            y();
            Exception exc = this.f5737f;
            if (exc != null) {
                throw new r(exc);
            }
            obj = this.f5736e;
        }
        return obj;
    }

    @Override // com.google.android.gms.o.t
    public final Object h(Class cls) {
        Object obj;
        synchronized (this.f5732a) {
            x();
            y();
            boolean zIsInstance = cls.isInstance(this.f5737f);
            Exception exc = this.f5737f;
            if (zIsInstance) {
                throw ((Throwable) cls.cast(exc));
            }
            if (exc != null) {
                throw new r(exc);
            }
            obj = this.f5736e;
        }
        return obj;
    }

    @Override // com.google.android.gms.o.t
    public final boolean i() {
        return this.f5735d;
    }

    @Override // com.google.android.gms.o.t
    public final boolean j() {
        boolean z;
        synchronized (this.f5732a) {
            z = this.f5734c;
        }
        return z;
    }

    @Override // com.google.android.gms.o.t
    public final boolean k() {
        boolean z;
        synchronized (this.f5732a) {
            z = false;
            if (this.f5734c && !this.f5735d && this.f5737f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.o.t
    public final void l(Executor executor, h hVar) {
        this.f5733b.a(new j(executor, hVar, 1));
        A();
    }

    @Override // com.google.android.gms.o.t
    public final void m(k kVar) {
        n(z.f5781a, kVar);
    }

    @Override // com.google.android.gms.o.t
    public final void n(Executor executor, k kVar) {
        this.f5733b.a(new j(executor, kVar, 0));
        A();
    }

    @Override // com.google.android.gms.o.t
    public final void o(m mVar) {
        p(z.f5781a, mVar);
    }

    @Override // com.google.android.gms.o.t
    public final void p(Executor executor, m mVar) {
        this.f5733b.a(new j(executor, mVar, 2));
        A();
    }

    @Override // com.google.android.gms.o.t
    public final void q(Executor executor, o oVar) {
        this.f5733b.a(new j(executor, oVar, 3));
        A();
    }

    @Override // com.google.android.gms.o.t
    public final void r(o oVar) {
        q(z.f5781a, oVar);
    }

    public final void s(Exception exc) {
        av.n(exc, "Exception must not be null");
        synchronized (this.f5732a) {
            z();
            this.f5734c = true;
            this.f5737f = exc;
        }
        this.f5733b.b(this);
    }

    public final void t(Object obj) {
        synchronized (this.f5732a) {
            z();
            this.f5734c = true;
            this.f5736e = obj;
        }
        this.f5733b.b(this);
    }

    public final boolean u(Exception exc) {
        av.n(exc, "Exception must not be null");
        synchronized (this.f5732a) {
            if (this.f5734c) {
                return false;
            }
            this.f5734c = true;
            this.f5737f = exc;
            this.f5733b.b(this);
            return true;
        }
    }

    public final void v() {
        synchronized (this.f5732a) {
            if (this.f5734c) {
                return;
            }
            this.f5734c = true;
            this.f5735d = true;
            this.f5733b.b(this);
        }
    }

    public final void w(Object obj) {
        synchronized (this.f5732a) {
            if (this.f5734c) {
                return;
            }
            this.f5734c = true;
            this.f5736e = obj;
            this.f5733b.b(this);
        }
    }
}
