package com.google.d.m.a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak extends aa {

    /* renamed from: a, reason: collision with root package name */
    private aj f7988a;

    ak(com.google.d.d.bh bhVar, boolean z, Executor executor, af afVar) {
        super(bhVar, z);
        this.f7988a = new ah(this, afVar, executor);
        h();
    }

    @Override // com.google.d.m.a.aa
    final void g() {
        aj ajVar = this.f7988a;
        if (ajVar != null) {
            ajVar.f();
        }
    }

    @Override // com.google.d.m.a.k
    protected final void l() {
        aj ajVar = this.f7988a;
        if (ajVar != null) {
            ajVar.h();
        }
    }

    @Override // com.google.d.m.a.aa
    final void x(z zVar) {
        super.x(zVar);
        if (zVar == z.f8096a) {
            this.f7988a = null;
        }
    }

    ak(com.google.d.d.bh bhVar, boolean z, Executor executor, Callable callable) {
        super(bhVar, z);
        this.f7988a = new ai(this, callable, executor);
        h();
    }
}
