package com.waze.an.a.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak implements com.waze.an.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.alerters.a.c f14371a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.a.u f14372b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f14373c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.an.a.x f14374d;

    public ak(com.waze.alerters.a.c cVar, com.waze.an.a.ae aeVar) {
        h.g.b.x.f(cVar, "stateHolder");
        h.g.b.x.f(aeVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f14371a = cVar;
        this.f14372b = new com.waze.an.a.u(((com.waze.j) cVar.d().d()).f().b(), aeVar);
        com.waze.j jVar = (com.waze.j) cVar.d().d();
        String strO = jVar.o();
        String str = strO == null ? "" : strO;
        Integer numJ = jVar.j();
        com.waze.i iVarD = jVar.d();
        com.waze.an.a.j jVar2 = iVarD != null ? new com.waze.an.a.j(iVarD.a(), new com.waze.beacons.m(cVar, 12), null) : null;
        List listB = h.a.i.b();
        if (jVar.v()) {
            if (!h.n.o.G(jVar.n())) {
                String strN = jVar.n();
                com.waze.an.a.c cVar2 = com.waze.an.a.c.f14570b;
                com.waze.i iVarD2 = jVar.d();
                listB.add(new com.waze.an.a.i(strN, new h.g.a.a() { // from class: com.waze.an.a.a.aj
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ak.q(this.f14370a);
                    }
                }, cVar2, (iVarD2 != null ? iVarD2.b() : null) == com.waze.h.f24306c ? new com.waze.an.a.j(jVar.d().a(), new h.g.a.a() { // from class: com.waze.an.a.a.ai
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ak.p(this.f14369a);
                    }
                }, null) : null, null));
            }
            if (!h.n.o.G(jVar.m())) {
                String strM = jVar.m();
                com.waze.an.a.c cVar3 = com.waze.an.a.c.f14569a;
                com.waze.i iVarD3 = jVar.d();
                listB.add(new com.waze.an.a.i(strM, new h.g.a.a() { // from class: com.waze.an.a.a.ah
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ak.o(this.f14368a);
                    }
                }, cVar3, (iVarD3 != null ? iVarD3.b() : null) == com.waze.h.f24305b ? new com.waze.an.a.j(jVar.d().a(), new h.g.a.a() { // from class: com.waze.an.a.a.ag
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ak.n(this.f14367a);
                    }
                }, null) : null, null));
            }
        }
        this.f14373c = ck.b(new com.waze.an.a.k(str, null, numJ, jVar2, h.a.i.a(listB)));
        this.f14374d = cVar.c();
    }

    static final h.ab n(ak akVar) {
        akVar.f14371a.e(com.waze.alerters.a.a.f14134c);
        return h.ab.f48028a;
    }

    static final h.ab o(ak akVar) {
        akVar.f14371a.e(com.waze.alerters.a.a.f14134c);
        return h.ab.f48028a;
    }

    static final h.ab p(ak akVar) {
        akVar.f14371a.e(com.waze.alerters.a.a.f14133b);
        return h.ab.f48028a;
    }

    static final h.ab q(ak akVar) {
        akVar.f14371a.e(com.waze.alerters.a.a.f14133b);
        return h.ab.f48028a;
    }

    @Override // com.waze.an.a.l
    /* renamed from: a */
    public final com.waze.an.a.u m() {
        return this.f14372b;
    }

    @Override // com.waze.an.a.l
    public final ch b() {
        return this.f14373c;
    }

    @Override // com.waze.an.a.l
    public final void c() {
        this.f14371a.e(com.waze.alerters.a.a.f14138g);
    }

    @Override // com.waze.an.a.l
    public final void d() {
        this.f14371a.e(com.waze.alerters.a.a.f14135d);
    }

    @Override // com.waze.an.a.l
    public final void e() {
        this.f14371a.g();
    }

    @Override // com.waze.an.a.l
    public final void f() {
        com.waze.alerters.a.c cVar = this.f14371a;
        if (bd.l(cVar)) {
            return;
        }
        cVar.e(com.waze.alerters.a.a.f14136e);
    }

    @Override // com.waze.an.a.l
    public final /* synthetic */ void g() {
    }

    @Override // com.waze.an.a.l
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // com.waze.an.a.l
    public final /* synthetic */ boolean i(com.waze.location.q qVar) {
        return true;
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14374d;
    }

    @Override // com.waze.an.a.r
    public final void k() {
        this.f14371a.f();
    }

    @Override // com.waze.an.a.r
    public final void l() {
        this.f14371a.k();
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ com.waze.location.q m() {
        return this.f14372b;
    }
}
