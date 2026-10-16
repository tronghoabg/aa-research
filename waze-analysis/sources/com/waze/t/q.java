package com.waze.t;

import h.g.b.x;
import java.io.Closeable;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements Closeable, com.waze.t.a.o {

    /* renamed from: a, reason: collision with root package name */
    private final af f40909a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.shared_infra.h.c f40910b;

    public q(com.waze.sharedui.e.g gVar, ab abVar) {
        x.f(gVar, "locationService");
        x.f(abVar, "coroutineDispatcher");
        af afVarE = aj.e(abVar);
        this.f40909a = afVarE;
        aj.z(afVarE, null, null, new p(gVar, this, null), 3);
    }

    @Override // com.waze.t.a.j
    public final /* synthetic */ Object b() {
        return this.f40910b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f40909a, null);
    }
}
