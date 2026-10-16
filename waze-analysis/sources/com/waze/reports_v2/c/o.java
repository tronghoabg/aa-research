package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34528a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f34529b;

    o(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar = new o((h.c.e) obj3);
        oVar.f34528a = (com.waze.navigate.location_preview.ba) obj;
        oVar.f34529b = (com.waze.shared_infra.h.b) obj2;
        return oVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(com.waze.reports_v2.a.a.a.d.b((com.waze.navigate.location_preview.ba) this.f34528a, (com.waze.shared_infra.h.b) this.f34529b));
    }
}
