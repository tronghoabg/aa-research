package com.google.d.m.a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class c extends at implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8051d = 0;

    /* renamed from: a, reason: collision with root package name */
    bm f8052a;

    /* renamed from: b, reason: collision with root package name */
    Class f8053b;

    /* renamed from: c, reason: collision with root package name */
    Object f8054c;

    c(bm bmVar, Class cls, Object obj) {
        this.f8052a = bmVar;
        this.f8053b = cls;
        this.f8054c = obj;
    }

    static bm h(bm bmVar, Class cls, com.google.d.b.t tVar, Executor executor) {
        b bVar = new b(bmVar, cls, tVar);
        bmVar.addListener(bVar, cf.A(executor, bVar));
        return bVar;
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        String str;
        bm bmVar = this.f8052a;
        Class cls = this.f8053b;
        Object obj = this.f8054c;
        String strA = super.a();
        if (bmVar != null) {
            str = "inputFuture=[" + bmVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strA != null) {
                return str.concat(strA);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        m(this.f8052a);
        this.f8052a = null;
        this.f8053b = null;
        this.f8054c = null;
    }

    abstract Object f(Object obj, Throwable th);

    abstract void g(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        bm bmVar = this.f8052a;
        Class cls = this.f8053b;
        Object obj = this.f8054c;
        if (((obj == null) || ((bmVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f8052a = null;
        try {
            th = bmVar instanceof com.google.d.m.a.a.a ? ((com.google.d.m.a.a.a) bmVar).k() : null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(bmVar.getClass()) + " threw " + String.valueOf(e2.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objO = th == null ? bd.o(bmVar) : null;
        if (th == null) {
            c(objO);
            return;
        }
        if (!cls.isInstance(th)) {
            e(bmVar);
            return;
        }
        try {
            Object objF = f(obj, th);
            this.f8053b = null;
            this.f8054c = null;
            g(objF);
        } catch (Throwable th2) {
            try {
                cf.u(th2);
                d(th2);
            } finally {
                this.f8053b = null;
                this.f8054c = null;
            }
        }
    }
}
