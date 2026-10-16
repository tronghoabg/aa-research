package com.waze.sharedrive.e;

import j$.time.Instant;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    private final cn f38527a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.mywaze.n f38528b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f38529c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f38530d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f38531e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedrive.d.aq f38532f;

    public h(com.waze.sharedrive.d.aq aqVar, cn cnVar, com.waze.mywaze.n nVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aqVar, "controller");
        h.g.b.x.f(cnVar, "uiMapper");
        h.g.b.x.f(nVar, "myWazeInterface");
        h.g.b.x.f(eVar, "logger");
        this.f38532f = aqVar;
        this.f38527a = cnVar;
        this.f38528b = nVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f38529c = afVarP;
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(1, 0, null, 6);
        bmVarE.c(h.ab.f48028a);
        this.f38530d = bmVarE;
        kotlinx.coroutines.b.k kVarQ = kotlinx.coroutines.b.ai.q(aqVar.n(), bmVarE, new g(this, null));
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        kotlinx.coroutines.b.bz bzVarB = kotlinx.coroutines.b.by.b();
        Object objD = aqVar.n().d();
        this.f38531e = kotlinx.coroutines.b.ai.V(kVarQ, afVarP, bzVarB, h(objD instanceof com.waze.sharedrive.d.g ? (com.waze.sharedrive.d.g) objD : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.sharedrive.g.k h(com.waze.sharedrive.d.g gVar) {
        com.waze.sharedrive.g.g gVar2;
        Object next;
        com.waze.sharedrive.c.a.q qVarC;
        if (gVar == null) {
            return null;
        }
        cn cnVar = this.f38527a;
        cm cmVarA = cnVar.a(gVar.c(), gVar.b().a());
        String strC = gVar.a().c();
        if (strC == null) {
            strC = gVar.a().b();
        }
        com.waze.sharedrive.g.ah ahVar = new com.waze.sharedrive.g.ah(gVar.c().d(), cmVarA.c(), cmVarA.b(), cnVar.c(cmVarA.a()));
        com.waze.sharedrive.d.f fVarD = gVar.d();
        if (fVarD == null) {
            gVar2 = com.waze.sharedrive.g.h.f38710a;
        } else if (h.g.b.x.n(fVarD, com.waze.sharedrive.d.d.f38240a)) {
            gVar2 = com.waze.sharedrive.g.f.f38708a;
        } else if (fVarD instanceof com.waze.sharedrive.d.e) {
            com.waze.sharedrive.c.a.m mVarA = ((com.waze.sharedrive.d.e) fVarD).a();
            Iterator it = mVarA.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((com.waze.sharedrive.c.a.l) next).c().b() instanceof com.waze.sharedrive.c.a.h) {
                    break;
                }
            }
            com.waze.sharedrive.c.a.l lVar = (com.waze.sharedrive.c.a.l) next;
            com.waze.sharedrive.c.a.k kVar = (lVar == null || (qVarC = lVar.c()) == null) ? null : (com.waze.sharedrive.c.a.k) qVarC.b();
            com.waze.sharedrive.c.a.h hVar = kVar instanceof com.waze.sharedrive.c.a.h ? (com.waze.sharedrive.c.a.h) kVar : null;
            Instant instantA = hVar != null ? hVar.a() : null;
            com.waze.sharedrive.c.a.b bVarA = mVarA.a();
            String strC2 = bVarA.c();
            if (strC2 == null && (strC2 = bVarA.b()) == null) {
                strC2 = "";
            }
            gVar2 = instantA != null ? new com.waze.sharedrive.g.i(mVarA.c(), strC2, cnVar.e(instantA.toEpochMilli())) : com.waze.sharedrive.g.f.f38708a;
        } else {
            if (!(fVarD instanceof com.waze.sharedrive.d.c)) {
                throw new h.i();
            }
            gVar2 = new com.waze.sharedrive.g.g(com.waze.ui.z.at.f43933a);
        }
        return new com.waze.sharedrive.g.k(strC, ahVar, gVar2, !this.f38528b.isGuestUser());
    }

    @Override // com.waze.sharedrive.e.f
    public final kotlinx.coroutines.b.ch a() {
        return this.f38531e;
    }

    @Override // com.waze.sharedrive.e.f
    public final void b() {
        this.f38532f.w();
    }

    @Override // com.waze.sharedrive.e.f
    public final void c() {
        this.f38532f.y();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f38529c, null);
    }

    @Override // com.waze.sharedrive.e.f
    public final void d() {
        this.f38532f.v();
    }

    @Override // com.waze.sharedrive.e.f
    public final void e() {
        this.f38532f.z();
    }

    @Override // com.waze.sharedrive.e.f
    public final void f() {
        this.f38530d.c(h.ab.f48028a);
    }
}
