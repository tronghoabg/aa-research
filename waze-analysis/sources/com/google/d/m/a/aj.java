package com.google.d.m.a;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class aj extends bk {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7986a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f7987b;

    aj(ak akVar, Executor executor) {
        Objects.requireNonNull(akVar);
        this.f7987b = akVar;
        com.google.d.b.an.B(executor);
        this.f7986a = executor;
    }

    abstract void c(Object obj);

    @Override // com.google.d.m.a.bk
    final void d(Throwable th) {
        ak akVar = this.f7987b;
        akVar.f7988a = null;
        if (th instanceof ExecutionException) {
            akVar.d(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            akVar.cancel(false);
        } else {
            akVar.d(th);
        }
    }

    @Override // com.google.d.m.a.bk
    final void e(Object obj) {
        this.f7987b.f7988a = null;
        c(obj);
    }

    final void f() {
        try {
            this.f7986a.execute(this);
        } catch (RejectedExecutionException e2) {
            this.f7987b.d(e2);
        }
    }

    @Override // com.google.d.m.a.bk
    final boolean g() {
        return this.f7987b.isDone();
    }
}
