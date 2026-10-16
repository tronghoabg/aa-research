package com.google.firebase.crashlytics.a.c;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9196a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.o.t f9197b = com.google.android.gms.o.ag.c(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f9198c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f9199d = new ThreadLocal();

    public n(Executor executor) {
        this.f9196a = executor;
        executor.execute(new k(this));
    }

    private final com.google.android.gms.o.t f(com.google.android.gms.o.t tVar) {
        return tVar.b(this.f9196a, new m(this));
    }

    public final com.google.android.gms.o.t a(Callable callable) {
        com.google.android.gms.o.t tVarB;
        synchronized (this.f9198c) {
            tVarB = this.f9197b.b(this.f9196a, new l(this, callable));
            this.f9197b = f(tVarB);
        }
        return tVarB;
    }

    public final com.google.android.gms.o.t b(Callable callable) {
        com.google.android.gms.o.t tVarC;
        synchronized (this.f9198c) {
            tVarC = this.f9197b.c(this.f9196a, new l(this, callable));
            this.f9197b = f(tVarC);
        }
        return tVarC;
    }

    public final Executor d() {
        return this.f9196a;
    }

    public final void e() {
        if (!Boolean.TRUE.equals(this.f9199d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }
}
