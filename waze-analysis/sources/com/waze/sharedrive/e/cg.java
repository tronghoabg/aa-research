package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cg extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38485a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38486b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f38487c;

    cg(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        cg cgVar = new cg((h.c.e) obj4);
        cgVar.f38485a = (f) obj;
        cgVar.f38486b = (r) obj2;
        cgVar.f38487c = (com.waze.sharedrive.d.r) obj3;
        return cgVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.sharedrive.d.o oVarA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        f fVar = (f) this.f38485a;
        r rVar = (r) this.f38486b;
        com.waze.sharedrive.d.r rVar2 = (com.waze.sharedrive.d.r) this.f38487c;
        boolean z = rVar2 instanceof com.waze.sharedrive.d.q;
        com.waze.sharedrive.d.q qVar = z ? (com.waze.sharedrive.d.q) rVar2 : null;
        com.waze.sharedrive.d.p pVarB = qVar != null ? qVar.b() : null;
        com.waze.sharedrive.c.a.m mVarC = (pVarB == null || (oVarA = pVarB.a()) == null) ? null : com.waze.sharedrive.g.bf.C(oVarA);
        if (z && mVarC != null && !h.g.b.x.n(mVarC.b(), ((com.waze.sharedrive.c.a.m) ((com.waze.sharedrive.d.q) rVar2).a().b()).b())) {
            return ca.f38476a;
        }
        if (rVar != null) {
            return new bz(rVar);
        }
        if (fVar != null) {
            return new bx(fVar);
        }
        if (rVar2 instanceof com.waze.sharedrive.d.h) {
            return new by(com.waze.ui.z.at.f43936d);
        }
        return null;
    }
}
