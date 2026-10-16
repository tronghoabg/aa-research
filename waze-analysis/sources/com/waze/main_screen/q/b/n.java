package com.waze.main_screen.q.b;

import h.g.b.x;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n implements i {

    /* renamed from: a, reason: collision with root package name */
    private final f f27402a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.q.a.b f27403b;

    /* renamed from: c, reason: collision with root package name */
    private final af f27404c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f27405d;

    public n(f fVar, com.waze.main_screen.q.a.b bVar) {
        x.f(fVar, "onCloseListener");
        x.f(bVar, "nearDestinationRepository");
        this.f27402a = fVar;
        this.f27403b = bVar;
        int i2 = av.f51370a;
        af afVarE = aj.e(ac.f51860a.c().plus(aj.Q()).plus(new ae("NearingDestinationStateHolder")));
        this.f27404c = afVarE;
        m mVar = new m(bVar.a());
        int i3 = bz.f51630a;
        this.f27405d = ai.V(mVar, afVarE, by.b(), new h((com.waze.main_screen.q.a.a) bVar.a().d()));
    }

    @Override // com.waze.main_screen.q.b.i
    public final ch a() {
        return this.f27405d;
    }

    @Override // com.waze.main_screen.q.b.i
    public final void b() {
        aj.h(this.f27404c, bo.g("Cleared", null));
    }

    @Override // com.waze.main_screen.q.b.i
    public final void c() {
        this.f27403b.b();
        this.f27402a.a();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
