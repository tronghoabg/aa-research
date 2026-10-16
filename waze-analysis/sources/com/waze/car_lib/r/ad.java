package com.waze.car_lib.r;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends h.c.b.a.g implements h.g.a.t {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20929a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20930b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f20931c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f20932d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f20933e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bl f20934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(bl blVar, int i2, h.c.e eVar) {
        super(6, eVar);
        this.f20934f = blVar;
        this.f20933e = i2;
    }

    @Override // h.g.a.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ((Number) obj4).intValue();
        ad adVar = new ad(this.f20934f, this.f20933e, (h.c.e) obj6);
        adVar.f20929a = (List) obj;
        adVar.f20930b = (List) obj2;
        adVar.f20931c = (com.waze.settings.b.f) obj3;
        adVar.f20932d = (String) obj5;
        return adVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        aa aaVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f20929a;
        List list2 = (List) this.f20930b;
        com.waze.settings.b.f fVar = (com.waze.settings.b.f) this.f20931c;
        String str = (String) this.f20932d;
        if (h.g.b.x.n(fVar, com.waze.settings.b.d.f36836a)) {
            aaVar = z.f21733a;
        } else {
            if (!h.g.b.x.n(fVar, com.waze.settings.b.e.f36837a)) {
                throw new h.i();
            }
            aaVar = aa.f20926a;
        }
        ab abVar = aaVar;
        bl blVar = this.f20934f;
        return new com.waze.car_lib.p.h(bl.f(blVar, list2, list, str, abVar, this.f20933e), abVar, new com.waze.asks.ad(blVar, 9));
    }
}
