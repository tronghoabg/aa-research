package com.google.d.m.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class w extends at implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    bm f8091a;

    /* renamed from: b, reason: collision with root package name */
    Object f8092b;

    w(bm bmVar, Object obj) {
        com.google.d.b.an.B(bmVar);
        this.f8091a = bmVar;
        this.f8092b = obj;
    }

    static bm h(bm bmVar, com.google.d.b.t tVar, Executor executor) {
        v vVar = new v(bmVar, tVar);
        bmVar.addListener(vVar, cf.A(executor, vVar));
        return vVar;
    }

    static bm x(bm bmVar, ag agVar, Executor executor) {
        u uVar = new u(bmVar, agVar);
        bmVar.addListener(uVar, cf.A(executor, uVar));
        return uVar;
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        String str;
        bm bmVar = this.f8091a;
        Object obj = this.f8092b;
        String strA = super.a();
        if (bmVar != null) {
            str = "inputFuture=[" + bmVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strA != null) {
                return str.concat(strA);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        m(this.f8091a);
        this.f8091a = null;
        this.f8092b = null;
    }

    abstract Object f(Object obj, Object obj2);

    abstract void g(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        bm bmVar = this.f8091a;
        Object obj = this.f8092b;
        if ((isCancelled() | (bmVar == null)) || (obj == null)) {
            return;
        }
        this.f8091a = null;
        if (bmVar.isCancelled()) {
            e(bmVar);
            return;
        }
        try {
            try {
                Object objF = f(obj, bd.o(bmVar));
                this.f8092b = null;
                g(objF);
            } catch (Throwable th) {
                try {
                    cf.u(th);
                    d(th);
                } finally {
                    this.f8092b = null;
                }
            }
        } catch (Error e2) {
            d(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e3) {
            d(e3.getCause());
        } catch (Exception e4) {
            d(e4);
        }
    }
}
