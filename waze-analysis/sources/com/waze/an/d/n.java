package com.waze.an.d;

import com.waze.an.a.u;
import com.waze.location.q;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements com.waze.an.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.l f14853a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f14854b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f14855c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f14856d;

    /* renamed from: e, reason: collision with root package name */
    private final af f14857e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f14858f;

    public n(com.waze.an.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.c.j jVar) {
        x.f(lVar, "notificationInsightDescriptor");
        x.f(jVar, "coroutineContext");
        this.f14853a = lVar;
        this.f14854b = aVar;
        this.f14855c = aVar2;
        this.f14856d = aVar3;
        af afVarE = aj.e(jVar.plus(aj.Q()).plus(new ae("NotificationDescriptor-".concat(String.valueOf(m().c())))));
        this.f14857e = afVarE;
        m mVar = new m(lVar.b(), this);
        int i2 = bz.f51630a;
        this.f14858f = ai.V(mVar, afVarE, by.c(), o((com.waze.an.a.k) lVar.b().d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.an.a.k o(final com.waze.an.a.k kVar) {
        com.waze.an.a.j jVarA = kVar.a();
        com.waze.an.a.j jVarC = jVarA != null ? com.waze.an.a.j.c(jVarA, new h.g.a.a() { // from class: com.waze.an.d.h
            @Override // h.g.a.a
            public final Object invoke() {
                kVar.a().b().invoke();
                this.k();
                return ab.f48028a;
            }
        }) : null;
        List<com.waze.an.a.i> listE = kVar.e();
        ArrayList arrayList = new ArrayList(h.a.i.q(listE, 10));
        for (final com.waze.an.a.i iVar : listE) {
            com.waze.an.a.j jVarF = iVar.f();
            arrayList.add(com.waze.an.a.i.j(iVar, new h.g.a.a() { // from class: com.waze.an.d.j
                @Override // h.g.a.a
                public final Object invoke() {
                    iVar.i().invoke();
                    this.k();
                    return ab.f48028a;
                }
            }, jVarF != null ? com.waze.an.a.j.c(jVarF, new h.g.a.a() { // from class: com.waze.an.d.i
                @Override // h.g.a.a
                public final Object invoke() {
                    iVar.f().b().invoke();
                    this.k();
                    return ab.f48028a;
                }
            }) : null));
        }
        return com.waze.an.a.k.f(kVar, jVarC, arrayList);
    }

    @Override // com.waze.an.a.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u m() {
        return this.f14853a.m();
    }

    @Override // com.waze.an.a.l
    public final ch b() {
        return this.f14858f;
    }

    @Override // com.waze.an.a.l
    public final void c() {
        this.f14853a.c();
        k();
    }

    @Override // com.waze.an.a.l
    public final void d() {
        this.f14853a.d();
        k();
    }

    @Override // com.waze.an.a.l
    public final void e() {
        this.f14853a.e();
        this.f14854b.invoke();
    }

    @Override // com.waze.an.a.l
    public final void f() {
        this.f14853a.f();
        k();
    }

    @Override // com.waze.an.a.l
    public final void g() {
        this.f14853a.g();
    }

    @Override // com.waze.an.a.l
    public final boolean h() {
        return this.f14853a.h();
    }

    @Override // com.waze.an.a.l
    public final boolean i(q qVar) {
        return this.f14853a.i(qVar);
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14853a.j();
    }

    @Override // com.waze.an.a.r
    public final void k() {
        this.f14853a.k();
        this.f14855c.invoke();
        aj.h(this.f14857e, null);
    }

    @Override // com.waze.an.a.r
    public final void l() {
        this.f14853a.l();
        h.g.a.a aVar = this.f14856d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
