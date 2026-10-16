package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.bv;
import com.waze.navigate.cq;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27147a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f27148b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f27149c;

    r(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        r rVar = new r((h.c.e) obj4);
        rVar.f27147a = (bv) obj;
        rVar.f27148b = (cq) obj2;
        rVar.f27149c = (String) obj3;
        return rVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new o((bv) this.f27147a, (cq) this.f27148b, (String) this.f27149c);
    }
}
