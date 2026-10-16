package com.waze.an.c;

import com.waze.ui.l.cg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg f14797a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.k.a.u f14798b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f14799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(cg cgVar, com.waze.main_screen.k.a.u uVar, h.c.e eVar) {
        super(2, eVar);
        this.f14797a = cgVar;
        this.f14798b = uVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        p pVar = new p(this.f14797a, this.f14798b, eVar);
        pVar.f14799c = obj;
        return pVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f14799c;
        cg cgVar = this.f14797a;
        kotlinx.coroutines.aj.z(afVar, null, null, new l(cgVar, null), 3);
        com.waze.main_screen.k.a.u uVar = this.f14798b;
        kotlinx.coroutines.a.o oVarC = h.g.b.w.c(-1, null, null, 6);
        kotlinx.coroutines.aj.z(afVar, null, null, new n(uVar, oVarC, (h.c.e) null, 0), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new o(oVarC, cgVar, uVar, null), 3);
        return h.ab.f48028a;
    }
}
