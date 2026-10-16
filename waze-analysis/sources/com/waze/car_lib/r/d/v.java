package com.waze.car_lib.r.d;

import h.ab;
import h.g.b.aq;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21329a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f21330b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f21331c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ x f21332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(aq aqVar, af afVar, x xVar, h.c.e eVar) {
        super(3, eVar);
        this.f21330b = aqVar;
        this.f21331c = afVar;
        this.f21332d = xVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).longValue();
        v vVar = new v(this.f21330b, this.f21331c, this.f21332d, (h.c.e) obj3);
        vVar.f21329a = (com.waze.resume_drive.a) obj;
        return vVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.resume_drive.a aVar2 = (com.waze.resume_drive.a) this.f21329a;
        aq aqVar = this.f21330b;
        br brVar = (br) aqVar.f48105a;
        if (brVar != null) {
            brVar.s(null);
        }
        if (h.g.b.x.n(aVar2, com.waze.bn.e.f17151a)) {
            aqVar.f48105a = aj.z(this.f21331c, null, null, new t(this.f21332d, (h.c.e) null, 4, (int[]) null), 3);
        }
        return ab.f48028a;
    }
}
