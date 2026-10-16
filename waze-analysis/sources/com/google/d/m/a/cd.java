package com.google.d.m.a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cd extends at implements RunnableFuture {

    /* renamed from: a, reason: collision with root package name */
    private volatile bk f8061a;

    cd(af afVar) {
        this.f8061a = new cb(this, afVar);
    }

    static cd f(Runnable runnable, Object obj) {
        return new cd(Executors.callable(runnable, obj));
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        bk bkVar = this.f8061a;
        if (bkVar == null) {
            return super.a();
        }
        return "task=[" + bkVar.toString() + "]";
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        bk bkVar;
        if (o() && (bkVar = this.f8061a) != null) {
            bkVar.h();
        }
        this.f8061a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        bk bkVar = this.f8061a;
        if (bkVar != null) {
            bkVar.run();
        }
        this.f8061a = null;
    }

    cd(Callable callable) {
        this.f8061a = new cc(this, callable);
    }
}
