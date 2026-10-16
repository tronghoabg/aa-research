package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.u {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26284a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26285b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f26286c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f26287d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f26288e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f26289f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ai f26290g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(ai aiVar, h.c.e eVar) {
        super(7, eVar);
        this.f26290g = aiVar;
    }

    @Override // h.g.a.u
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        v vVar = new v(this.f26290g, (h.c.e) obj7);
        vVar.f26284a = (com.waze.main_screen.b.a.f) obj;
        vVar.f26285b = (com.waze.main_screen.ae.a.d) obj2;
        vVar.f26286c = (com.waze.main_screen.j.a.h) obj3;
        vVar.f26287d = (com.waze.main_screen.c.f.i) obj4;
        vVar.f26288e = (com.waze.nav_connect.b.j) obj5;
        vVar.f26289f = (com.waze.main_screen.c.e.i) obj6;
        return vVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new u((com.waze.main_screen.b.a.f) this.f26284a, (com.waze.main_screen.ae.a.d) this.f26285b, (com.waze.main_screen.j.a.h) this.f26286c, (com.waze.main_screen.c.f.i) this.f26287d, (com.waze.nav_connect.b.j) this.f26288e, (com.waze.main_screen.c.e.i) this.f26289f, this.f26290g.f26103h.a());
    }
}
