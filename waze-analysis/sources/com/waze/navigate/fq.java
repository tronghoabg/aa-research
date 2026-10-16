package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fq implements fo {

    /* renamed from: a, reason: collision with root package name */
    private final cj f31375a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f31376b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f31377c;

    public fq(cj cjVar) {
        h.g.b.x.f(cjVar, "etaStateProvider");
        this.f31375a = cjVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "RecenterBarStateHolder");
        this.f31376b = afVarP;
        er erVar = new er(cjVar.P(), 2);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f31377c = kotlinx.coroutines.b.ai.V(erVar, afVarP, kotlinx.coroutines.b.by.b(), new fn(null));
    }

    @Override // com.waze.navigate.fo
    public final kotlinx.coroutines.b.ch a() {
        return this.f31377c;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f31376b, kotlinx.coroutines.bo.g("Closed", null));
    }
}
