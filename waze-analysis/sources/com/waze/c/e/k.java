package com.waze.c.e;

import e.a.dw;
import l.a.dh;
import l.a.dr;
import l.a.ds;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.c.a.b f18672a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.stats.ax f18673b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f18674c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f18675d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f18676e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f18677f;

    public /* synthetic */ k(com.waze.c.a.b bVar, com.waze.stats.ax axVar, h.g.a.a aVar) {
        this.f18672a = bVar;
        this.f18673b = axVar;
        this.f18674c = aVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "AlternateRoutesFTETooltipStateHolderScope");
        this.f18675d = afVarP;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.f18676e = bnVarB;
        kotlinx.coroutines.b.k kVarL = kotlinx.coroutines.b.ai.L(bnVarB, new aj(this, (h.c.e) null, 1));
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f18677f = kotlinx.coroutines.b.ai.V(kVarL, afVarP, kotlinx.coroutines.b.by.b(), null);
    }

    public static final /* synthetic */ void c(k kVar) {
        com.waze.c.a.b bVar = kVar.f18672a;
        if (bVar.j()) {
            return;
        }
        bVar.i();
        bVar.h(bVar.d() + 1);
        com.waze.stats.ax axVar = kVar.f18673b;
        com.waze.sharedui.d.a.b bVarJ = dw.j(dh.newBuilder());
        dr drVarNewBuilder = ds.newBuilder();
        h.g.b.x.f(drVarNewBuilder, "builder");
        ds dsVarBuild = drVarNewBuilder.build();
        h.g.b.x.e(dsVarBuild, "build(...)");
        bVarJ.u(dsVarBuild);
        com.waze.sharedui.utils.o.g(axVar, bVarJ.t());
    }

    public final kotlinx.coroutines.b.ch b() {
        return this.f18677f;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f18675d, null);
    }

    public final void e() {
        this.f18676e.e(null);
        this.f18674c.invoke();
    }
}
