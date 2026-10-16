package com.waze.sharedrive.e;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v implements r {

    /* renamed from: a, reason: collision with root package name */
    private final cn f38563a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f38564b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f38565c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedrive.d.aq f38566d;

    public v(com.waze.sharedrive.d.aq aqVar, cn cnVar) {
        h.g.b.x.f(aqVar, "controller");
        h.g.b.x.f(cnVar, "uiMapper");
        this.f38566d = aqVar;
        this.f38563a = cnVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f38564b = afVarP;
        u uVar = new u(aqVar.n(), this);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f38565c = kotlinx.coroutines.b.ai.V(uVar, afVarP, kotlinx.coroutines.b.by.a(5000L, 2), new com.waze.sharedrive.g.t(null, new com.waze.sharedrive.g.ai(h.a.i.h()), false, com.waze.sharedrive.g.n.f38726a));
    }

    public static final /* synthetic */ com.waze.sharedrive.g.ai g(v vVar, com.waze.sharedrive.c.a.m mVar) {
        if (mVar == null) {
            return new com.waze.sharedrive.g.ai(h.a.i.h());
        }
        ArrayList arrayList = new ArrayList();
        for (com.waze.sharedrive.c.a.l lVar : mVar.d()) {
            cn cnVar = vVar.f38563a;
            cm cmVarB = cnVar.b(lVar);
            arrayList.add(new com.waze.sharedrive.g.ah(lVar.d(), cmVarB.c(), cmVarB.b(), cnVar.c(cmVarB.a())));
        }
        return new com.waze.sharedrive.g.ai(arrayList);
    }

    public static final /* synthetic */ com.waze.sharedrive.g.s h(com.waze.sharedrive.d.o oVar) {
        if (oVar instanceof com.waze.sharedrive.d.j) {
            return com.waze.sharedrive.g.n.f38726a;
        }
        if (oVar instanceof com.waze.sharedrive.d.i) {
            return new com.waze.sharedrive.g.m(i(((com.waze.sharedrive.d.i) oVar).a()));
        }
        if (oVar instanceof com.waze.sharedrive.d.m) {
            return com.waze.sharedrive.g.q.f38729a;
        }
        if (oVar instanceof com.waze.sharedrive.d.n) {
            return com.waze.sharedrive.g.p.f38728a;
        }
        if (oVar instanceof com.waze.sharedrive.d.k) {
            return new com.waze.sharedrive.g.o(i(((com.waze.sharedrive.d.k) oVar).a()));
        }
        if (oVar instanceof com.waze.sharedrive.d.l) {
            return com.waze.sharedrive.g.r.f38730a;
        }
        throw new h.i();
    }

    private static final com.waze.ui.z.at i(com.waze.sharedrive.q qVar) {
        return qVar instanceof com.waze.sharedrive.l ? com.waze.ui.z.at.f43934b : qVar instanceof com.waze.sharedrive.p ? com.waze.ui.z.at.f43935c : com.waze.ui.z.at.f43933a;
    }

    @Override // com.waze.sharedrive.e.r
    public final kotlinx.coroutines.b.ch a() {
        return this.f38565c;
    }

    @Override // com.waze.sharedrive.e.r
    public final void b() {
        this.f38566d.x();
    }

    @Override // com.waze.sharedrive.e.r
    public final void c() {
        this.f38566d.C();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f38564b, null);
    }

    @Override // com.waze.sharedrive.e.r
    public final void d() {
        this.f38566d.D();
    }

    @Override // com.waze.sharedrive.e.r
    public final void e() {
        this.f38566d.E();
    }

    @Override // com.waze.sharedrive.e.r
    public final void f(boolean z) {
        this.f38566d.H(z);
    }
}
